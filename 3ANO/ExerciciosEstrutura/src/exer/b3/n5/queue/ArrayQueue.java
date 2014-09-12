package exer.b3.n5.queue;

import exer.b3.n5.queue.exception.EmptyQueueException;
import exer.b3.n5.queue.exception.FullQueueException;

public class ArrayQueue<E> implements Queue<E> {
    /** Indice da celula que contém o primeiro item da fila​ */
    private int              front    = 0;
    /** Indice para a proxima celula livre​ */
    private int              rear     = 0;   // atras
    private E[]              queue;
    private int              capacity;
    private final static int CAPACITY = 1000;

    public ArrayQueue() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Object[capacity];
    }

    public void enqueue(E element) throws FullQueueException {
        if (this.size() == this.capacity)
            throw new FullQueueException();

        this.queue[this.rear] = element;
        this.rear = (this.rear + 1) % this.capacity;
    }

    public E dequeue() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        int front = this.front;

        this.front = (this.front + 1) % this.capacity;

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
        if (this.rear < this.front)
            return (this.rear + this.capacity) - this.front;
        else
            return this.rear - this.front;

    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = this.front; i != this.rear; i = (i + 1) % this.capacity) {
            sb.append(this.queue[i]);
            sb.append(", ");
        }

        sb.replace(sb.length() - 2, sb.length() + 1, "]");
        return sb.toString();
    }
}