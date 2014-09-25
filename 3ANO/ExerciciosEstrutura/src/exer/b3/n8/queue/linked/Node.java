package exer.b3.n8.queue.linked;

public class Node<E> {
    private E       value;
    private Node<E> next;

    public Node(E value) {
        this.setValue(value);
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }
}
