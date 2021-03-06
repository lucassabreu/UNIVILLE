package listaencadeada;

import gameentry.GameEntry;

public class ListaEncadeada {
    protected Node head;
    protected long size;

    public ListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public long getSize() {
        return size;
    }

    public void add(Node node) {
        /*
         * Verifica se existe algum head ou se o valor do head é menor que o do
         * node sendo adicionado
         */
        if (this.head == null || this.head.getElement().getScore() < node
                        .getElement().getScore()) {

            node.setNext(this.head);
            this.head = node;
        } else {
            /*
             * Caso exista um head e este tenha score superior então é preciso
             * percorrer os nós para alocar o novo nó
             */

            Node prev = this.head;
            Node current = this.head.getNext();

            /*
             * enquanto existir um proximo e este próximo for maior ou igual ao
             * nós a ser adicionado, continua procurando
             */
            while (current != null && current.getElement().getScore() >= node
                            .getElement().getScore()) {
                prev = current;
                current = prev.getNext();
            }

            /*
             * Quando não houver mais nós ou o corrente for menor que o nó por
             * adicionar então é trocado o proximo do ultimo nó maior para o nó
             * por adicionar e o nó corrente passa a ser o próximo do nó por
             * adicionar
             */

            prev.setNext(node);
            node.setNext(current);
        }
        this.size++; // incrementa o tamanho
    }

    public GameEntry remove(int i) {
        if (i >= this.size || i < 0)
            throw new IndexOutOfBoundsException("Posição " + i + " inválida");

        Node node = null;

        if (i == 0) {
            node = this.head;
            this.head = node.getNext();
        } else {
            Node prev = this.head;
            node = this.head.getNext();

            for(int j = 1; j < i && node != null; j++) {
                prev = node;
                node = node.getNext();
            }
            
            prev.setNext(null);
            if (node != null)
                prev.setNext(node.getNext());
        }

        this.size--;
        
        if (node != null)
            return node.getElement();
        else
            return null;
    }

    public static void main(String[] args) {

        ListaEncadeada list = new ListaEncadeada();

        for (int i = 0; i < 20; i++)
            list.add(new Node(new GameEntry("Name " + (i + 1), 2000 - i * 100
                            // (int) (Math.random() * 1000.0)
            )));

        list.remove(0);
        
        GameEntry ge = list.remove(0);
        
        System.out.println("GameEntry: " + ge.toString());
        
        System.out.println("Lista: ");
        list.print();
    }

    public void print() {

        if (head == null)
            System.out.println("Lista vazio");
        else {
            Node tail = this.head;

            while (tail != null) {
                System.out.println(tail.getElement());
                tail = tail.getNext();
            }
        }
    }

    @Override
    public String toString() {
        if (this.size > 0)
            return "[" + this.head.toString() + "]";
        else
            return "[]";
    }
}
