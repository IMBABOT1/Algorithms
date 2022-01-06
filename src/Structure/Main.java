package Structure;


import Structure.DoublyLinkedList.DoublyLinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dls = new DoublyLinkedList<>();
        dls.insert(1);
        dls.insert(2);
        dls.insert(123);

        System.out.println(dls);
        System.out.println(dls.remove(2));
        System.out.println(dls);
        System.out.println(dls.remove(1));
        System.out.println(dls);
        System.out.println(dls.remove(123));
        System.out.println(dls);
        dls.insert(1);
        dls.insert(2);
        dls.insert(123);
        dls.insert(1);
        dls.insert(2);
        dls.insert(123);
        dls.insert(1);
        dls.insert(2);
        dls.insert(123);
        System.out.println(dls);

        System.out.println(dls.remove(1234));
    }
}
