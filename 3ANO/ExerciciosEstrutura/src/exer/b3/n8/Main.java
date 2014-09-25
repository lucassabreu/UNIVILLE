package exer.b3.n8;

import exer.b3.n8.queue.Queue;
import exer.b3.n8.queue.linked.SLinkedQueue;

public class Main {

    public static void main(String[] args) {
        testQueue(new SLinkedQueue<Integer>());
    }

    public static void testQueue(Queue<Integer> queue) {
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
