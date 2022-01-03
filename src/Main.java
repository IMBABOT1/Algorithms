import Sorting.CountingSort;
import Sorting.ImprovedBubbleSort;
import Sorting.InsertionSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        CountingSort cs = new CountingSort();

        int[] arr = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};

        cs.countingSort(arr);


    }
}
