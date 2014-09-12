package exer.b3.n6;

import exer.b3.n6.queue.ArrayQueueRealoteWhenDequeue;
import exer.b3.n6.queue.ArrayQueueRealoteWhenIsFull;
import exer.b3.n6.queue.Queue;

public class Exer06 {
    public static void main(String[] args) {
        System.out.println("Testando classe: ArrayQueueRealoteWhenDequeue - Realoca no dequeue");
        testQueue(new ArrayQueueRealoteWhenDequeue<Integer>(10));

        System.out.println();
        System.out.println("Testando classe: ArrayQueueRealoteIsFull - Realoca quando cheia");
        testQueue(new ArrayQueueRealoteWhenIsFull<Integer>(10));
    }

    public static void testQueue(Queue<Integer> queue) {
        int i = 1;
        while (!queue.isFull()) {
            queue.enqueue(Integer.valueOf(i++));
            System.out.println("Primeiro: " + queue.front());
            System.out.println("Tamanho da fila: " + queue.size());
            if (!queue.isFull()) {
                queue.enqueue(Integer.valueOf(i++));
                if (!queue.isFull()) {
                    queue.enqueue(Integer.valueOf(i++));
                    System.out.println("Atendido:" + queue.dequeue());
                }
            }
        }
        System.out.println("Fila Cheia");
        System.out.println("Tamanho da fila: " + queue.size());
    }
}
