package br.univille.b2.aula3.listasencadeadasdupla;

public class DLinkedList {
    private DNode head;
    private DNode trailer;
    private int   size;

    public int getSize() {
        return size;
    }

    public DLinkedList() {
        this.head = new DNode();
        this.trailer = new DNode();

        this.head.setNext(trailer);
        this.trailer.setPrev(head);

        this.size = 0;
    }

    public DNode get(int i) {
        if (i < 0 || i >= this.size)
            throw new IndexOutOfBoundsException("Index " + i + " not exist");

        DNode node = null;

        if (this.size / 2 > i) {
            node = this.trailer.getPrev();
            for (int j = this.size - 1; j > i; j--)
                node = node.getPrev();
        } else {
            node = this.head.getNext();
            for (int j = 0; j < i; j++)
                node = node.getNext();
        }

        return node;
    }

    public void addFirst(DNode node) {

        node.setNext(this.head.getNext());
        node.getNext().setPrev(node);

        node.setPrev(head);
        this.head.setNext(node);

        this.size++;
    }

    public void addLast(DNode node) {

        node.setPrev(this.trailer.getPrev());
        node.getPrev().setNext(node);

        node.setNext(this.trailer);
        this.trailer.setPrev(node);

        this.size++;
    }

    public void addAfter(DNode prev, DNode newNode) {
        // altera o proximo do novo para ser o proximo do existente
        newNode.setNext(prev.getNext());

        // altera o anterior proximo nó do novo nó para que seja o novo nó
        newNode.getNext().setPrev(newNode);

        // altera o proximo do existente para ser o novo
        prev.setNext(newNode);

        // altera o anterior do novo para ser o existente
        newNode.setPrev(prev);
    }
    
    public void addBefore(DNode next, DNode newNode) {
        // altera o anterior do novo para ser o anterior do existente
        newNode.setPrev(next.getPrev());

        // altera o proximo do anterior do novo nó para que seja o novo nó
        newNode.getPrev().setNext(newNode);

        // altera o proximo do existente para ser o novo
        next.setPrev(newNode);

        // altera o anterior do novo para ser o existente
        newNode.setNext(next);
    }

    public void remove(DNode remove) {

        if (remove.getPrev() != null)
            // altera o próximo do anterior do nó para ser o próximo do nó
            remove.getPrev().setNext(remove.getNext());

        if (remove.getNext() != null)
            // altera o anterior do próximo do nó para ser o anterior do nó
            remove.getNext().setPrev(remove.getPrev());

        remove.setNext(null);
        remove.setPrev(null);

    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        DNode[] bim = new DNode[4];

        list.addFirst(bim[3] = new DNode("BIM3"));
        list.addFirst(bim[1] = new DNode("BIM1"));

        list.addAfter(bim[1], bim[2] = new DNode("BIM2"));

        System.out.println("Add After:");
        list.print();
        
        list.remove(bim[2]);

        System.out.println("Remove:");
        list.print();
        
        list.addBefore(bim[3], bim[2]);

        System.out.println("Add Before:");
        list.print();
    }

    public void print() {
        DNode node = this.head.getNext();

        while (node.getNext() != null) {
            System.out.println(node.getElement());
            node = node.getNext();
        }
    }
}
