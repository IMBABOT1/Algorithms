package Structure.LinkedList.CircularList;

import Structure.LinkedList.DoublyLinkedList.DoublyLinkedList;

import java.util.Objects;

public class CircularList<T> {

    private class Node<T> {
        private Node<T> next;
        private T data;

        public Node(T data) {
            next = null;
            this.data = data;
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

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> head;

    public CircularList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(T element){
        Node<T> ptr = head;
        if (head == null){
            return false;
        }else if (head != null){
            do {
                if (ptr.data.equals(element)){
                    return true;
                }
                ptr = ptr.next;
            }while (ptr != head);
        }
        return false;
    }

    public boolean insert(T element){
        Node<T> node = new Node<>(element);
        if (head == null){
            head = node;
            node.next = head;
            return true;
        }else if (head != null){
            Node<T> ptr = head;
            while (ptr.next != head){
                ptr = ptr.next;
            }
            ptr.next = node;
            node.next = head;
        }
        return false;
    }

    public T remove(T element) {
        Node<T> node = new Node<>(element);
        Node<T> delete = null;
        if (isEmpty()) throw new RuntimeException("List is empty");
        else {
            if (head.equals(node)) {
                if (head.next == null) {
                    delete = head;
                    head = null;
                    return delete.data;
                } else {
                    Node<T> ptr = head;
                    while (ptr.next != head) {
                        ptr = ptr.next;
                    }
                    delete = head;
                    ptr.next = head.next;
                    head = head.next;
                    return delete.data;
                }
            } else {
                Node<T> temp = null;
                Node<T> prev = head;
                Node<T> current = head.next;
                while (current != null) {
                    if (current.equals(node)) {
                        temp = current;
                        delete = current;
                        current = null;
                    } else {
                        prev = prev.next;
                        current = current.next;
                    }
                }
                prev.next = temp.next;
            }
        }
        return delete.data;
    }




    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        Node<T> current = head;
        StringBuilder sb = new StringBuilder("[");
        do {
            sb.append(current);
            if (current.next != null) {
                current = current.next;
                sb.append((current == head) ? "]" : ", ");
            }if (current.next == null){
                sb.append("]");
            }
        }while (current != head);
        return sb.toString();
    }
}

