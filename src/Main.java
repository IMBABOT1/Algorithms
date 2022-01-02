import Sorting.ImprovedBubbleSort;
import Sorting.InsertionSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        ImprovedBubbleSort bs = new ImprovedBubbleSort();

        int[] arr = {16, 14, 5, 6, 8};
        bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
