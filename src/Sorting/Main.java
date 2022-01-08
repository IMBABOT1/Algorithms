package Sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1,-123, 5, 4689, 3, -132, -321, 128};
        MergeSort.mergeSort(arr, 0, arr.length - 1, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
