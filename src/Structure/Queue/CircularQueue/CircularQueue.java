package Structure.Queue.CircularQueue;

public class CircularQueue<T> {
    private Object[] arr;
    private int front;
    private int rear;
    private int size;
    private int count;

    public CircularQueue(int size) {
        this.size = size;
        count = 0;
        front = -1;
        rear = -1;
        arr = new Object[size];

    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % arr.length == front;
    }

    public void enqueue(T value) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        } else if (isEmpty()) {
            rear = front = 0;
            arr[rear] = value;
            count++;
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            count++;
        }
    }

    public T dequeue() {
        T e;
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else if (front == rear) {
            e = (T) arr[front];
            front = -1;
            rear = -1;
            count--;
            return e;
        } else {
            e = (T) arr[front];
            front = (front + 1) % arr.length;
            count--;
            return e;
        }
    }

    public int count() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        if (front == -1 && rear == -1) {
            sb.append("[]");
        } else {
            for (int i = front; i <= rear; i++) {
                sb.append(arr[i] + ", ");
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}

