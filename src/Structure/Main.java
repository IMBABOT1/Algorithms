package Structure;

import Structure.CircularQueue.CircularQueue;

public class Main {

    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue);

        System.out.println(queue.count());
    }
}
