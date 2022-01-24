package Expressions;

import java.util.Stack;

public class PostfixToInfix {

    private  boolean isOperand(char c){
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c<= 'Z')){
            return true;
        }
        return false;
    }

    private  boolean isOperator(char c){
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^'){
            return true;
        }else {
            return false;
        }
    }

    public  String postfixToInfix(String postfix){
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < postfix.length() ; i++) {
            if (isOperand(postfix.charAt(i))){
                result.append(postfix.charAt(i));
                stack.push(result.toString());
                result.setLength(0);
            }
            else {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                stack.push("(" + op2 + postfix.charAt(i) + op1 + ")");
            }
        }
        return stack.peek();
    }
}
