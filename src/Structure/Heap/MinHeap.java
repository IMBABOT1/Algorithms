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

    public void insert(int value){
        if (heap_size == capacity){
            throw new RuntimeException("Heap full " + heap_size);
        }
        heap_size++;
        int i = heap_size - 1;
        arr[i] = value;
        while (i != 0 && arr[parent(i)] > arr[i]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    private int parent(int i){
        return (i-1)/2;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (heap_size == 0){
            sb.append("[]");
        }else {
            sb.append("[");
            int i = 0;
            while (i < heap_size){
                sb.append(arr[i] + ", ");
                i++;
            }
        }
        sb.setLength(sb.length()-2);
        sb.append("]");
        return sb.toString();
    }
}
