package Sorting;

import java.util.Arrays;

public class CountingSort {

    public void countingSort(int[] arr){
        int[] count = new int[10];
        int[] result = new int[arr.length];
        int k = 9;
        for (int i = 0; i < arr.length ; i++) {
            ++count[arr[i]];
        }
        for (int i = 1; i <= k ; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = result.length - 1; i >= 0 ; i--) {
            result[--count[arr[i]]] = arr[i];
        }

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = result[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
