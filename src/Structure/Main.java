package Structure;

import Structure.Stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(10);
        stack.push(15);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(10);
        stack.push(15);



        // Displaying the Stack
        System.out.println("The Stack is: " + stack);

        System.out.println(stack);
    }
}
