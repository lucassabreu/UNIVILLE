package exer.b3.n6.queue;

import exer.b3.n6.queue.exception.EmptyQueueException;
import exer.b3.n6.queue.exception.FullQueueException;

public class ArrayQueueRealoteWhenIsFull<E> implements Queue<E> {
    /** Indice da celula que contém o primeiro item da fila​ */
    private int              front    = 0;
    /** Indice para a proxima celula livre​ */
    private int              rear     = 0;   // atras
    private E[]              queue;
    private int              capacity;
    private final static int CAPACITY = 1000;

    public ArrayQueueRealoteWhenIsFull() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueueRealoteWhenIsFull(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Object[capacity];
    }

    public void enqueue(E element) throws FullQueueException {
        if (this.isFull())
            throw new FullQueueException();

        this.queue[this.rear++] = element;
    }

    public E dequeue() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        return this.queue[this.front++];
    }

    @Override
    public boolean isFull() {
        if (this.rear < this.capacity)
            return false;

        if (this.front != 0) {
            this.rear -= this.front;

            for (int i = 0; i < this.rear; i++) {
                this.queue[i] = this.queue[i + this.front];
            }

            this.front = 0;
            return false;
        }

        return true;
    }

    public E front() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        return this.queue[0];
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return this.rear;

    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = this.front; i < this.rear; i++) {
            sb.append(this.queue[i]);
            sb.append(", ");
        }

        sb.replace(sb.length() - 2, sb.length() + 1, "]");
        return sb.toString();
    }
}