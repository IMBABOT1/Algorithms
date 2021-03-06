package DataStructures.LinkedList;

public class DoublyLinkedList<E> {

    private static class Node<E>{
        E element;
        Node<E> next;
        Node<E> prev;


        public Node(E element){
            this.element = element;
        }


        @Override
        public String toString() {
            return element.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node node = (Node) obj;
            return node.equals(obj);
        }
    }

    int size;
    Node<E> first;
    Node<E> last;

    public DoublyLinkedList(){
        size = 0;

    }

    public void insertInEnd(E element){
       Node<E> node = new Node<>(element);
        if (first == null){
           first = last = node;
       }else {
            last.next = node;
            node.prev = last;
            last = node;
            size++;
        }
    }

    public void insertInBegin(E element){
        Node<E> node = new Node<>(element);
        if (first == null){
            first = last = node;
        }else {
            first.prev = node;
            node.next = first;
            first = node;
            size++;
        }
    }


    public E deleteFromBegin(){
        Node<E> delete = first;
        if (first == null){
            return null;
        }else {
            first = delete.next;
            first.prev = null;
            size--;
        }
        return (E) delete;
    }


    public E deleteFromEnd(){
        Node<E> delete = last;
        if (first == null){
            return null;
        }else {
            last.prev.next = null;
            last = last.prev;
            size--;
        }

        return (E) delete;
    }

    public E deleteFromPosition(int position){
        Node<E> temp = first;
        int i = 0;
        if (position == 1){
            deleteFromBegin();
        }else if (position == size){
            temp = last;
            deleteFromEnd();
        }else {
            while (i < position - 1){
                temp = temp.next;
                i++;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
        return (E) temp;
    }

    public void insertInPosition(E element, int position){
        Node<E> node = new Node<>(element);
        Node<E> current = first;
        int i = 0;
        if (position > size) {
            throw new RuntimeException("Invalid index: " + position);
        }else if (position == 0){
            insertInBegin(element);
        }else if (position == size){
            insertInEnd(element);
        }else {
            while (i < position - 1) {
                current = current.next;
                i++;
            }
            node.prev = current;
            node.next = current.next;
            current.next = node;
            node.next.prev = node;
        }
        size++;
    }

    public void reverse(){
        Node<E> current = first;
        Node<E> next;

        while (current != null){
            next = current.next;
            current.next = current.prev;
            current.prev = next;
            current = next;
        }
        current = first;
        first = last;
        last = current;
    }



    public boolean isEmpty(){
        return size == 0;
    }


    @Override
    public String toString() {
        if (isEmpty()) return null;
        Node<E> current = first;
        StringBuilder sb = new StringBuilder("[");

        while (current != null){
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? "]" : ", ");
        }

        return sb.toString();
    }
}