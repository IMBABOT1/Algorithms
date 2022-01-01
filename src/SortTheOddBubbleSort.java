public class SortTheOddBubbleSort {
    //O(n)^2
    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                continue;
            for (int j = (i + 1); j < array.length; j++) {
                if (array[j] % 2 != 0) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }


        return array;
    }

}
