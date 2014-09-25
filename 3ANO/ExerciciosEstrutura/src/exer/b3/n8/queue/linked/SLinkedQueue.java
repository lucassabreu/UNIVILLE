package exer.b3.n8.queue.linked;

import exer.b3.n8.queue.Queue;
import exer.b3.n8.queue.exception.EmptyQueueException;
import exer.b3.n8.queue.exception.FullQueueException;

public class SLinkedQueue<E> implements Queue<E> {

    private Node<E> front;
    private Node<E> rear;
    private int     size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public E front() throws EmptyQueueException {
        if (this.isEmpty())
            return null;

        return this.front.getValue();
    }

    @Override
    public void enqueue(E element) throws FullQueueException {

        if (element == null)
            throw new NullPointerException("Value passed by parameter can't be 'null'");

        Node<E> node = new Node<E>(element);

        if (this.isEmpty())
            this.front = node;
        else
            this.rear.setNext(node);

        this.rear = node;
        this.size++;
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        Node<E> node = this.front;

        this.size--;

        if (!this.isEmpty())
            this.front = this.front.getNext();

        return node.getValue();
    }

    @Override
    public String toString() {

        if (this.isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();

        Node<E> node = this.front;

        while (node != null) {
            sb.append(node.getValue());
            node = node.getNext();
            if (node != null) {
                sb.append(", ");
            }
        }

        return "[".concat(sb.toString()).concat("]");
    }
}
