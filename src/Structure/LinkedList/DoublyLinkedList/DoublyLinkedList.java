package Structure.LinkedList.DoublyLinkedList;

import java.util.Objects;

public class DoublyLinkedList<T> {
    private class Node<T>{
        private Node<T> next;
        private Node<T> prev;
        private T data;

        public Node(T data){
            next = null;
            prev = null;
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
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node<T> node = (Node) obj;
            return Objects.equals(this.data, node.data);
        }
    }

    private Node<T> head;
    private int size;

    public DoublyLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean contains(T element){
        Node<T> node = new Node<>(element);
        Node<T> ptr = head;

        while (ptr != null){
            if (ptr.equals(node)){
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }

    public void insert(T element){
        Node<T> node = new Node<>(element);
        if (head == null){
            head = node;
        }else if (head != null){
            Node<T> ptr = head;
            while (ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = node;
            node.prev = ptr;
        }
    }


    public T remove(T element){
        Node<T> node = new Node<>(element);
        Node<T> delete = null;
        if (head == null){
            throw new RuntimeException("List is empty");
        }else if (head != null){
            if (head.equals(node)){
                delete = head;
                head = head.next;
                return delete.data;
            }else if (!head.equals(node)){
                Node<T> find = head;
                Node<T> pnt = null;
                while (!find.equals(node)){
                    find = find.next;
                    if (find == null){
                        throw new RuntimeException("Value doesn't exist in list: " + node);
                    }
                    if (find.equals(node)){
                        pnt = find;
                    }
                }
                Node<T> next = pnt.next;
                Node<T> prev = pnt.prev;
                if (next == null){
                    delete = pnt;
                    prev.next = null;
                }else if (next != null){
                    delete = pnt;
                    prev.next = next;
                    next.prev = prev;
                }
            }
        }
        return delete.data;
    }



    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        Node<T>current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null){
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }
        return  sb.toString();
    }
}