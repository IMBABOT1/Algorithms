import Structure.Heap.MinHeap;
import Structure.Queue.LinkedQueue.LinkedQueue;
import Structure.Trees.BinarySearchTree;


public class Main {

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(1);
        heap.insert(123);
        heap.insert(1234);

        System.out.println(heap);
    }
}
