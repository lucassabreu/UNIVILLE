package exer.b3.n6.queue;

import exer.b3.n6.queue.exception.EmptyQueueException;
import exer.b3.n6.queue.exception.FullQueueException;

public class ArrayQueueRealoteWhenDequeue<E> implements Queue<E> {
    /** Indice para a proxima celula livre​ */
    private int              rear     = 0;   // atras
    private E[]              queue;
    private int              capacity;
    private final static int CAPACITY = 1000;

    public ArrayQueueRealoteWhenDequeue() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueueRealoteWhenDequeue(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Object[capacity];
    }

    public void enqueue(E element) throws FullQueueException {
        if (this.size() == this.capacity)
            throw new FullQueueException();

        this.queue[this.rear++] = element;
    }

    public E dequeue() throws EmptyQueueException {
        if (this.isEmpty())
            throw new EmptyQueueException();

        E element = this.queue[0];
        this.rear--;

        for (int i = 0; i < this.rear; i++)
            this.queue[i] = this.queue[i + 1];

        return element;
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

        for (int i = 0; i < this.rear; i++) {
            sb.append(this.queue[i]);
            sb.append(", ");
        }

        sb.replace(sb.length() - 2, sb.length() + 1, "]");
        return sb.toString();
    }

    @Override
    public boolean isFull() {
        return this.queue.length <= this.rear;
    }
}