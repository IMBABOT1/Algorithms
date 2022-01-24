package Sorting;

public class InsertionSort {
    //O(n^2)
    public void insertionSort(int[] arr){
        int j = 0;
        int key = 0;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
