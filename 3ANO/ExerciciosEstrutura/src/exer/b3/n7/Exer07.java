package exer.b3.n7;

import exer.b3.n7.queue.ArrayQueueCircularSize;
import exer.b3.n7.queue.ArrayQueueCircularMod;
import exer.b3.n7.queue.Queue;

public class Exer07 {
    public static void main(String[] args) throws Exception {

        System.out.println("Solução Usando MOD: \n");
        testCircularQueue(new ArrayQueueCircularMod<Integer>(10));
        testCircularQueue2(new ArrayQueueCircularMod<Integer>(5));

        System.out.println("\nSolução Usando Size: \n");
        testCircularQueue(new ArrayQueueCircularSize<Integer>(10));
        testCircularQueue2(new ArrayQueueCircularSize<Integer>(5));
    }

    public static void testCircularQueue(Queue<Integer> queue) {
        int i = 1;
        while (!queue.isFull()) {
            queue.enqueue(Integer.valueOf(i++));
            System.out.println("Primeiro: " + queue.front());
            System.out.println("Tamanho da fila: " + queue.size());
            if (!queue.isFull()) {
                queue.enqueue(Integer.valueOf(i++));
                if (!queue.isFull()) {
                    queue.enqueue(Integer.valueOf(i++));
                    System.out.println("Atendido:" + queue.dequeue() + ", ainda na fila: " + queue);
                }
            }
        }
        System.out.println("Fila Cheia");
        System.out.println("Tamanho da fila: " + queue.size() + ", ainda na fila: " + queue);
    }

    public static void testCircularQueue2(Queue<Integer> queue) {
        System.out.println("\nSequencia do slide: \n");

        System.out.printf("Operação         | Saída | frente <- Q <- fim\n");

        queue.enqueue(5);
        System.out.printf("queue.enqueue(5) | %5s | %s \n", "", queue);

        queue.enqueue(3);
        System.out.printf("queue.enqueue(3) | %5s | %s \n", "", queue);

        System.out.printf("queue.dequeue()  | %5d | %s \n", queue.dequeue(), queue);

        queue.enqueue(7);
        System.out.printf("queue.enqueue(7) | %5s | %s \n", "", queue);

        queue.enqueue(9);
        System.out.printf("queue.enqueue(9) | %5s | %s \n", "", queue);

        System.out.printf("queue.dequeue()  | %5d | %s \n", queue.dequeue(), queue);

        queue.enqueue(4);
        System.out.printf("queue.enqueue(4) | %5s | %s \n", "", queue);

        queue.enqueue(2);
        System.out.printf("queue.enqueue(2) | %5s | %s \n", "", queue);

        System.out.printf("queue.dequeue()  | %5d | %s \n", queue.dequeue(), queue);

        queue.enqueue(1);
        System.out.printf("queue.enqueue(1) | %5s | %s \n", "", queue);

        queue.enqueue(8);
        System.out.printf("queue.enqueue(8) | %5s | %s \n", "", queue);

        System.out.printf("queue.dequeue()  | %5d | %s \n", queue.dequeue(), queue);

        queue.enqueue(3);
        System.out.printf("queue.enqueue(3) | %5s | %s \n", "", queue);

        try {
            queue.enqueue(6);
            System.out.printf("queue.enqueue(6) | %5s | %s \n", "", queue);
        } catch (Exception e) {
            System.out.printf("queue.enqueue(6) | %5s | %s \n", "error", queue);
        }

        System.out.printf("queue.dequeue()  | %5d | %s \n", queue.dequeue(), queue);
    }
}
