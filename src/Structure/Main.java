package Structure;

import Structure.Queue.Queue;
import Structure.Stack.Stack;

public class Main {

    public static void main(String[] args) {
       Queue<Integer> queue = new Queue<>(12);
       queue.enqueue(132);
       queue.enqueue(321);
       queue.enqueue(324);

       System.out.println(queue);

        System.out.println(queue.count());
    }
}
