package Expressions;

import java.util.Stack;

public class PostfixToPrefix {


    private static boolean isOperand(char c){
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c<= 'Z')){
            return true;
        }
        return false;
    }


    public static String postfixToPrefix(String postfix){
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < postfix.length() ; i++) {
            if (isOperand(postfix.charAt(i))){
                result.append(postfix.charAt(i));
                stack.push(result.toString());
                result.setLength(0);
            }else {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                stack.push(postfix.charAt(i) + op2 + op1);
            }
        }

        return stack.peek();
    }
}
