public class FindMinElementRecursion {

    //O(n)
    public int findMin(int[] arr, int index){
        if (index == arr.length - 1){
         return arr[index];
        }

        int value = findMin(arr, index + 1);

        if (arr[index] < value){
            return arr[index];
        }else {
            return value;
        }
    }
}
