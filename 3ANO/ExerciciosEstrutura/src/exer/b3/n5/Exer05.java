package exer.b3.n5;

import exer.b3.n5.queue.ArrayQueue;

public class Exer05 {
    public static void main(String[] args) throws Exception {
        ArrayQueue<Integer> aq = new ArrayQueue<Integer>(7);

        aq.enqueue(5);
        System.out.printf("enqueue(5),        Queue: %s\n", aq);

        aq.enqueue(3);
        System.out.printf("enqueue(3),        Queue: %s\n", aq);

        System.out.printf("dequeue() : %5d, Queue: %s\n", aq.dequeue(), aq);

        aq.enqueue(7);
        System.out.printf("enqueue(7),        Queue: %s\n", aq);

        System.out.printf("dequeue() : %5d, Queue: %s\n", aq.dequeue(), aq);

        aq.front();
        System.out.printf("front()   : %5d, Queue: %s\n", aq.front(), aq);

        System.out.printf("dequeue() : %5d, Queue: %s\n", aq.dequeue(), aq);

        try {
            System.out.printf("dequeue() : %5d, Queue: %s\n", aq.dequeue(), aq);
        } catch (Exception e) {
            System.out.printf("dequeue() : error, Queue: %s\n", aq);
        }

        System.out.printf("isEmpty() : %5s, Queue: %s\n", aq.isEmpty() ? "true" : "false", aq);

        aq.enqueue(9);
        System.out.printf("enqueue(9),        Queue: %s\n", aq);

        aq.enqueue(7);
        System.out.printf("enqueue(7),        Queue: %s\n", aq);

        System.out.printf("size()    : %5d, Queue: %s\n", aq.size(), aq);

        aq.enqueue(3);
        System.out.printf("enqueue(3),        Queue: %s\n", aq);

        aq.enqueue(5);
        System.out.printf("enqueue(5),        Queue: %s\n", aq);

        System.out.printf("dequeue() : %5d, Queue: %s\n", aq.dequeue(), aq);
    }
}
