package Algorithms;

public class ShiftElementsByN {

    public static int[] shiftElements(int[] arr, int n){
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 2; j > -1; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[0] = temp;
            }
        }
        if (n < 0){
            n *=-1;
            for (int i = 0; i < n; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length -1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
        return arr;
    }
}
