package Structure;

import Structure.Queue.Queue;
import Structure.Stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
