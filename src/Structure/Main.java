package Structure;


import Structure.LinkedList.CircularList.CircularList;

public class Main {

    public static void main(String[] args) {
        CircularList<Integer> cl = new CircularList<>();
        cl.insert(123);
        cl.insert(321);
        cl.insert(432);



        System.out.println(cl.remove(123));
        System.out.println(cl);
        System.out.println(cl.remove(321));
        System.out.println(cl);
        System.out.println(cl.remove(432));
        System.out.println(cl);

        System.out.println(cl);
    }
}
