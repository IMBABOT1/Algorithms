package Structure.Queue;

public class Queue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Queue(int size){
        this.size = size;
        front = -1;
        rear = - 1;
        arr = new int[size];

    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public boolean isFull(){
        return rear == arr.length - 1;
    }

    public void enqueue(int value){
        if (isFull()){
            throw new RuntimeException("Queue is full");
        }else if (isEmpty()){
            rear = front = 0;
        }else {
            rear++;
        }
        arr[rear] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0 ; i <= rear ; i++) {
            sb.append(arr[i] + ", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
