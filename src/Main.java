import Sorting.HeapSort;
import Structure.Heap.MinHeap;
import Structure.Queue.LinkedQueue.LinkedQueue;
import Structure.Trees.BinarySearchTree;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{8,3,2,13,52};
        HeapSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
