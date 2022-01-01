public class FindMinMax {
    //O(n)
    public int findMin(int... arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    //O(n)
    public int findMax(int... arr){
        int max = arr[0];

        for (int i = 0; i <  arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
