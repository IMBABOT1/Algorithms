public class Swap {

    public static void swap(int[] arr, int first, int second){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
    }
}
