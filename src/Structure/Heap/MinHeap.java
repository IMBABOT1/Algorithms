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

    public void deleteKey(int i){
        decreaseKey(i, Integer.MAX_VALUE);
        extractMin();
    }

    private void decreaseKey(int i, int value){
        arr[i] = value;
        while (i != 0 && arr[parent(i)] > arr[i]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public int extractMin(){
        if (heap_size <= 0){
            throw new RuntimeException("Heap is empty");
        }else if (heap_size == 1){
            heap_size--;
            return arr[0];
        }else {
            int root = arr[0];
            arr[0] = arr[heap_size - 1];
            heap_size--;
            minHeapify(0);
            return root;
        }
    }

    private void minHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && arr[l] < arr[i]){
            smallest = l;
        }
        if (r < heap_size && arr[r] > arr[smallest]){
            smallest = r;
        }
        if (smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(smallest);
        }
    }


    private int parent(int i){
        return (i-1)/2;
    }

    private int left(int i){
        return (2 * i + 1);
    }

    private int right(int i){
        return (2 * i + 2);
    }


    public int linearSearch(int value){
        for (int i = 0; i < heap_size ; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
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
