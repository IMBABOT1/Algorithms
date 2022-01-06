package Structure.SinglyLinkedList;

import java.util.Objects;

public class LinkedList<T> {
    private class Node<T> {
        public int key;
        public T data;
        public Node<T> next;

        public Node(T data) {
            key = -1;
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return data.toString();
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

    public LinkedList() {
        head = null;
    }

    public LinkedList(Node n) {
        head = n;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Node nodeExist(int key) {
        Node<T> temp = null;
        Node<T> ptr = head;

        while (ptr != null) {
            if (ptr.key == key) {
                temp = ptr;
            }
            ptr = ptr.next;
        }
        return temp;
    }

    public void appendNode(T n) {
        Node<T> node = new Node<>(n);
        if (nodeExist(node.key) != null) {
            throw new RuntimeException("Node already exists");
        } else {
            if (head == null) {
                head = node;
                head.key++;
            } else if (head != null) {
                Node<T> ptr = head;
                while (ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = node;
                node.key++;
            }
        }
    }

    public void prependNode(T n) {
        Node<T> node = new Node<>(n);
        if (nodeExist(node.key) != null) {
            throw new RuntimeException("Node already exists");
        } else {
            node.next = head;
            head = node;
            node.key++;
        }
    }

    public void insertNodeAfter(int key, Node n) {
        Node<T> ptr = nodeExist(key);
        if (ptr == null) {
            throw new RuntimeException("Node doesn't exist: " + key);
        } else {
            if (nodeExist(n.key) != null) {
                throw new RuntimeException("Node already exists");
            } else {
                n.next = ptr.next;
                ptr.next = n;
            }
        }
    }

    public Node deleteNodeByKey(int key){
        Node<T> delete = null;
        if (head == null){
            throw new RuntimeException("List is empty");
        }else if (head != null){
            if (head.key == key){
                delete = head;
                head = head.next;
            }else {
                Node<T> temp = null;
                Node<T> prev = head;
                Node<T> current = head.next;
                while (current != null){
                    if (current.key == key){
                        temp = current;
                        current = null;
                    }else {
                        prev = prev.next;
                        current = current.next;
                    }
                }
                if (temp != null){
                    delete = temp;
                    prev.next = temp.next;
                }else if (temp == null){
                    throw new RuntimeException("Node doesn't exist");
                }
            }
        }

        return delete;
    }

    public void updateNodeByKey(int key, T data){
        Node<T> ptr = nodeExist(key);
        if (ptr != null){
            ptr.data = data;
        }else if (ptr == null){
            throw new RuntimeException("Node doesn't exist");
        }
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
