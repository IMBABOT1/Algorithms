package Sorting;

import java.util.Arrays;

public class CountingSort {
        //O(n+k)
    public void countingSort(int[] arr, int k) {
        int[] count = new int[k];
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            ++count[arr[i]];
        }

        for (int i = 1; i < k ; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = result[i];
        }
    }
}
