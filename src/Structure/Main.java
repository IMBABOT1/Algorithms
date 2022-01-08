package Structure;


import Algorithms.BinarySearch;
import Sorting.InsertionSort;
import Structure.LinkedList.CircularList.CircularList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[]arr = {1, 5, 8, 10, 111, 536};

        InsertionSort.insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
