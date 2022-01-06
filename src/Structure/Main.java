package Structure;


import Structure.SinglyLinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(1);
        list.insert(123);

        System.out.println(list.remove(1));;
        System.out.println(list.contains(1));
        list.remove(123);
        System.out.println(list.size());
        list.remove(1);

        System.out.println(list);
    }
}
