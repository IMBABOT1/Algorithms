package Structure;

import Structure.CircularQueue.CircularQueue;
import Structure.SinglyLinkedList.LinkedList;
import Structure.Temp.Cat;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.appendNode(1);
        list.appendNode(123);
        list.appendNode(1);

        list.nodeExist()
        System.out.println(list);
    }
}
