package Structure.Heap;

public class MinHeap {
    private int[] arr;
    private int capacity;
    private int heap_size;

    public MinHeap(int capacity){
        heap_size = 0;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public int linearSearch(int value){
        for (int i = 0; i < heap_size ; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public int height(int N) {
        return (int)Math.ceil(Math.log(N +
                1) / Math.log(2)) - 1;
    }
}
