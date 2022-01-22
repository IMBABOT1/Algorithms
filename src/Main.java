import Structure.Heap.MinHeap;
import Structure.Queue.LinkedQueue.LinkedQueue;
import Structure.Trees.BinarySearchTree;


public class Main {

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(5);
        heap.insert(321);

        heap.deleteKey(5);
    }
}
