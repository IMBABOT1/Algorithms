package Structure;

import Structure.Stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(11);

        System.out.println(stack);
    }
}
