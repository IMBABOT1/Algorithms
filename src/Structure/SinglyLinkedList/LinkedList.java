package Structure.SinglyLinkedList;

import java.util.Objects;

public class LinkedList<T> {

    private class Node<T>{
        T data;
        Node<T> next;

        public Node(T data){
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node node = (Node) obj;
            return Objects.equals(this.data, node.data);
        }

        @Override
        public int hashCode() {
            return this.data.hashCode() * 32;
        }
    }

    private Node<T> head;

    public LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

}
