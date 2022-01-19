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
}