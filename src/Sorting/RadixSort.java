package Sorting;

public class RadixSort {

    public void radixSort(int[] arr){
        int max = findMax(arr);
        for (int div = 1; max/div > 0; div*=10) {
            countingSort(arr, arr.length, div);
        }
    }

    private void countingSort(int[] arr, int size, int div){
        int[] result = new int[size];
        int[] count = new int[10];

        for (int i = 0; i < size; i++) {
            count[(arr[i]/div)%10]++;
        }
        for (int i = 1; i < count.length ; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            result[count[(arr[i]/div)%10]-1] = arr[i];
            count[(arr[i]/div)%10]--;
        }
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = result[i];
        }
    }

    private static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
