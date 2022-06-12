package Algorithms;

public class ArrayBalance {

    public boolean arrayBalance(int[] arr){
        int left = 0;

        for (int i = 0; i < arr.length ; i++) {
            left += arr[i];

            int right = 0;

            for (int j = i + 1;  j < arr.length ; j++) {
                right += arr[j];
            }

            if (right == left){
                return true;
            }
        }
        return false;
    }
}
