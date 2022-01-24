package Algorithms;

public class Swap {

    //O(1);
    public void swap(int[] arr, int first, int second){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
    }
}
