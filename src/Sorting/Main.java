package Sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 1, 3, 5, 3, 83, 0, 123};
        ShellSort.shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
