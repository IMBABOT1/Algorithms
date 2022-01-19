import Structure.Stack.LinkedStack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        System.out.println(linkedStack);
        linkedStack.push(123);
        linkedStack.push(321);
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack);
    }
}
