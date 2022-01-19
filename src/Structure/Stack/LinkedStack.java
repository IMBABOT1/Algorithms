package Structure.Stack;
import Structure.LinkedList.SinglyLinkedList.SinglyLinkedList;

import java.util.Objects;

public class LinkedStack<T> {

    private class Node<T>{
        private T data;
        private Node next;

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
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node<T> node = (Node) obj;
            return Objects.equals(this.data, node.data);
        }
    }

    private Node<T> top;

    public LinkedStack(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T element){
        Node<T> node = new Node<>(element);
        if (top == null){
            top = node;
        }else {
            Node<T> temp = top;
            top = node;
            node.next = temp;
        }
    }

    public boolean search(T element){
        Node<T> node = new Node<>(element);
        Node<T> temp = top;
        boolean exist = false;
        while (temp != null){
            if (temp == node){
                exist = true;
                break;
            }
            temp = temp.next;
        }
        return exist;
    }

    public T pop(){
        Node<T> temp = null;
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }else {
            temp = top;
            top = top.next;
        }
        return temp.data;
    }

    public T peek(){
        Node<T> temp = null;
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }else {
            temp = top;
        }
        return temp.data;
    }

    public int count(){
        Node<T> node = top;
        int count = 0;
        while (node != null){
            count++;
            node = node.next;
        }

        return count;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        Node<T> current = top;
        StringBuilder sb = new StringBuilder("[");
        while (current != null){
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }
        return sb.toString();
    }
}
