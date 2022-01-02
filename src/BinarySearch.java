public class BinarySearch {
   // O(log n)
    public int binarySearch(int[] arr, int value){
        int l = 0;
        int r = arr.length;
        int m;
        while (l < r){
            m = l + r >> 1;
            if (value == arr[m]){
                return  m;
            }else if (value < arr[m]){
                r = m;
            }else {
                l = m + 1;
            }
        }

        return -1;
    }
}
