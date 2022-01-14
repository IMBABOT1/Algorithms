package Sorting;

public class QuickSort {
    //O(n log(n))
    public static void quickSort(int[] arr, int s, int e){
        if (s<e){
            int p = partition(arr, s, e);
            quickSort(arr, s, p - 1);
            quickSort(arr, p + 1, e);
        }
    }

    private static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int index = s;

        for (int i = s; i < e; i++) {
            if (arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        int temp = arr[e];
        arr[e] = arr[index];
        arr[index] = temp;

        return index;
    }
}
