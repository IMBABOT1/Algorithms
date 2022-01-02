import Sorting.ImprovedBubbleSort;
import Sorting.InsertionSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        ImprovedBubbleSort bs = new ImprovedBubbleSort();

        int[] arr = {1,-58,13587, 8, 3, 2, 135, 98, 6};
        bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
