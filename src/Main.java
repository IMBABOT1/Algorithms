import Structure.Queue.Queue.LinkedQueue;


public class Main {

    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();

        System.out.println(linkedQueue.isEmpty());
        linkedQueue.enqueue(132);
        linkedQueue.enqueue(321);
        System.out.println(linkedQueue);
    }
}
