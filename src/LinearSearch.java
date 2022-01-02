public class LinearSearch {

    //O(n)
    public int linearSearch(int[] arr, int value){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                index = i;
            }
        }

        return index;
    }
}
