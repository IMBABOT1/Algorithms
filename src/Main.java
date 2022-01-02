import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();

        int[] arr = {1,-58,13587, 8, 3, 2, 135, 98, 6};

        sort.insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
