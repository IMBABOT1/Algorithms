package Algorithms;

import java.util.Arrays;

public class ShiftElements {


    public static void shiftRight(int[] arr){
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0 ; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

    public static void shiftLeft(int[] arr){
        int temp = arr[0];

        for (int i = 0; i < arr.length -1 ; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

    }
}
