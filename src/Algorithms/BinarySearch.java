package Algorithms;

public class BinarySearch {
    //O(logN)
    public  int binarySearch(int[] arr, int element){
        int left = 0;
        int right = arr.length;
        int m = 0;
        while (left <= right){
             m = left + (right - left) / 2;
             if (arr[m] == element){
                 return m;
             }else if (arr[m] < element){
                 left = m + 1;
             }else {
                 right = m - 1;
             }
        }
        return -1;
    }
}
