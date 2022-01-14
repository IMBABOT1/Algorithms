package Sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 1, 3, 5, 3};
        CountingSort.countingSort(arr, 7);

        System.out.println(Arrays.toString(arr));
    }
}
