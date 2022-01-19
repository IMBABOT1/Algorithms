package Structure.Stack;
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

    public T pop(){

    }

    public T peek(){

    }

    public int count(){

    }

}
