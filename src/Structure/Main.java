package Structure;


import Structure.DoublyLinkedList.DoublyLinkedList;
import Structure.LinkedList.SinglyLinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sl = new SinglyLinkedList<>();
        sl.insert(312);
        sl.insert(312);
        sl.insert(654);

        System.out.println(sl);

        sl.remove(312);

        System.out.println(sl);
        System.out.println(sl.remove(654));
        System.out.println(sl);
    }
}
