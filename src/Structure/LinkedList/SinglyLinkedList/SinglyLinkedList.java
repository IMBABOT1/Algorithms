package Structure.LinkedList.SinglyLinkedList;

import java.util.Objects;

public class SinglyLinkedList<T> {
    private class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<T> node = (Node) o;
            return Objects.equals(this.data, node.data);
        }
    }

    private Node<T> head;
    private int size;

    public SinglyLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public boolean contains(T element){
        Node<T> temp = new Node<>(element);
        Node<T> current = head;
        while (!current.equals(temp)){
            if (current.next == null){
                return false;
            }else {
                current = current.next;
            }
        }
        return true;
    }

    public boolean insert(T element){
        Node<T> node = new Node<>(element);
        Node<T> ptr = head;
        if (head == null){
            head = node;
            size++;
            return true;
        }else if (head != null){
            while (ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = node;
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(T element){
        Node<T> delete = new Node<>(element);
        if (head == null) {
            throw new RuntimeException("List is empty");
        }else if (head != null){
            if (head.equals(delete)){
                head = head.next;
                size--;
                return true;
            }else {
                Node<T> temp = null;
                Node<T> prev = head;
                Node<T> current = head.next;
                while (current != null){
                    if (current.equals(delete)){
                        temp = current;
                        current = null;
                    }else {
                        prev = prev.next;
                        current = current.next;
                    }
                    if (temp != null){
                        prev.next = temp.next;
                        size--;
                        return true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        Node<T> current = head;
        StringBuilder sb = new StringBuilder("[");
        while (current != null) {
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }
        return sb.toString();
    }
}