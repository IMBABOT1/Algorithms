package Structure.Queue.Queue;

public class Queue<T> {

    private Object[] arr;
    private int front;
    private int rear;
    private int size;

    public Queue(int size){
        this.size = size;
        front = -1;
        rear = - 1;
        arr = new Object[size];

    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public boolean isFull(){
        return rear == arr.length - 1;
    }

    public void enqueue(T value){
        if (isFull()){
            throw new RuntimeException("Queue is full");
        }else if (isEmpty()){
            rear = front = 0;
            arr[rear] = value;
        }else {
            rear++;
            arr[rear] = value;
        }
    }

    public T dequeue(){
        T e;
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else if(front == rear){
            e = (T) arr[front];
            front = -1;
            rear = -1;
            return e;
        }else {
            e = (T) arr[front];
            front++;
            return e;
        }
    }

    public int count(){
        return (rear - front + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        if (front == -1 && rear == -1){
            sb.append("[]");
        }else {
            for (int i = front; i <= rear; i++) {
                sb.append(arr[i] + ", ");
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
