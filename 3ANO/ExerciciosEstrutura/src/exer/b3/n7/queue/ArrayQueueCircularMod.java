package exer.b3.n7.queue;

import exer.b3.n7.queue.exception.EmptyQueueException;
import exer.b3.n7.queue.exception.FullQueueException;

public class ArrayQueueCircularMod<E> implements Queue<E> {
    /** Indice da celula que contém o primeiro item da fila​ */
    private int              front    = 0;
    /** Indice para a proxima celula livre​ */
    private int              rear     = 0;   // atras
    private E[]              queue;
    private int              capacity;
    private final static int CAPACITY = 1000;

    public ArrayQueueCircularMod() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueueCircularMod(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Object[capacity];
    }

    public void enqueue(E element) throws FullQueueException {
        if (this.isFull())
            throw new FullQueueException();

        this.queue[this.rear++ % this.capacity] = element;
    }

    public E dequeue() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        return this.queue[this.front++ % this.capacity];
    }

    public E front() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        return this.queue[this.front % this.capacity];
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return this.rear - this.front;
    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = this.front; i < this.rear; i++) {
            sb.append(this.queue[i % this.capacity]);
            sb.append(", ");
        }

        sb.replace(sb.length() - 2, sb.length() + 1, "]");
        return sb.toString();
    }

    @Override
    public boolean isFull() {
        if (this.front >= this.capacity) {
            this.front -= this.capacity;
            this.rear -= this.capacity;
        }

        return this.size() == this.capacity;
    }
}