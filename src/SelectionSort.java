public class SelectionSort {

    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int f = i;

            for (int j = i + 1; j <  arr.length; j++) {
                if (arr[j] < arr[f]){
                    f = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[f];
            arr[f] = temp;
        }
    }
}
