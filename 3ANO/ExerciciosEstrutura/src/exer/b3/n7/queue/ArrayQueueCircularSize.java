package exer.b3.n7.queue;

import exer.b3.n7.queue.exception.EmptyQueueException;
import exer.b3.n7.queue.exception.FullQueueException;

public class ArrayQueueCircularSize<E> implements Queue<E> {
    /** Indice da celula que contém o primeiro item da fila​ */
    private int              front    = 0;
    private int              size     = 0;   // comprimento
    private E[]              queue;
    private int              capacity;
    private final static int CAPACITY = 1000;

    public ArrayQueueCircularSize() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueueCircularSize(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Object[capacity];
    }

    public void enqueue(E element) throws FullQueueException {
        if (this.isFull())
            throw new FullQueueException();

        this.queue[(this.front + this.size++) % this.capacity] = element;
    }

    public E dequeue() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        int front = this.front;
        this.front = ++this.front % this.capacity;
        this.size--;

        return this.queue[front];
    }

    public E front() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        return this.queue[this.front];
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int rear = this.front + this.size;

        for (int i = this.front; i < rear; i++) {
            sb.append(this.queue[i % this.capacity]);
            sb.append(", ");
        }

        sb.replace(sb.length() - 2, sb.length() + 1, "]");
        return sb.toString();
    }

    @Override
    public boolean isFull() {
        return this.size() == this.capacity;
    }
}