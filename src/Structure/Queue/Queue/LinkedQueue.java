package Structure.Queue.Queue;

import java.util.Objects;

public class LinkedQueue<T> {

    private class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }

        @Override
        public int hashCode() {
            return data.hashCode() * 32;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node<T> node = (Node) obj;
            return Objects.equals(this.data, node.data);
        }
    }

    private Node<T> rear;
    private Node<T> front;

    public LinkedQueue(){
        rear = null;
        front = null;
    }

    public boolean isEmpty(){
        return rear == null && front == null;
    }

    public boolean exist(T element) {
        Node<T> node = new Node<>(element);
        Node<T> temp = front;
        boolean exist = false;

        while (temp != null){
            if (temp == node){
                exist = true;
            }
            temp = temp.next;
        }
        return exist;
    }

    public void enqueue(T element){
        Node<T> node = new Node<>(element);
        if (isEmpty()){
            rear = node;
            front = node;
        }else {
            rear.next = node;
            rear = node;
        }
    }

    public T dequeue(){
        Node<T> temp = null;
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else if (front == rear){
            temp = front;
            front = null;
            rear = null;
            return temp.data;
        }else {
            temp = front;
            front = front.next;
            return temp.data;
        }
    }

    public int count(){
        int count = 0;
        Node<T> temp = front;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        Node<T> temp = front;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (temp != null){
            sb.append(temp);
            temp = temp.next;
            sb.append((temp == null) ? "]" : ", ");
        }
        return sb.toString();
    }
}
