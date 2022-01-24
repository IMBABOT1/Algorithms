package Sorting;
//O(n log(n))
public class MergeSort {
    private void merge(int[] arr, int left, int mid, int right, int size){
        int i = left;
        int j = mid + 1;
        int k = left;
        int[] temp = new int[size];

        while (i <= mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }


        for (int l = left; l <= right; l++) {
            arr[l] = temp[l];
        }
    }

    public  void mergeSort(int[]arr, int left, int right, int size){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, size);
            mergeSort(arr, mid + 1, right, size);
            merge(arr, left, mid, right, size);
        }
    }

}
