import Sorting.CountingSort;
import Sorting.ImprovedBubbleSort;
import Sorting.InsertionSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        ShiftElements.shiftRight(arr);
        System.out.println(Arrays.toString(arr));

    }
}
