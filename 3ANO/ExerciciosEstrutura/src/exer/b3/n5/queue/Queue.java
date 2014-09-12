package exer.b3.n5.queue;

import exer.b3.n5.queue.exception.EmptyQueueException;
import exer.b3.n5.queue.exception.FullQueueException;

public interface Queue<E> {
    /** Metodo que retorna o tamanho da fila​ */
    public int size();

    /** Metodo que retorna se a fila esta vazia​ */
    public boolean isEmpty();

    /** Metodo que retorna o primeiro item da fila​ */
    public E front() throws EmptyQueueException;

    /** Metodo que insere um item na fila​ */
    public void enqueue(E element) throws FullQueueException;

    /** Metodo que retorna e retira um item da fila​ */
    public E dequeue() throws EmptyQueueException;
}