package Expressions;

import java.util.Stack;

public class PrefixToPostfix {


    private boolean isOperand(char c){
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c<= 'Z')){
            return true;
        }
        return false;
    }

    public String prefixToPostfix(String prefix){
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = prefix.length() - 1; i >= 0 ; i--) {
            if (isOperand(prefix.charAt(i))){
                result.append(prefix.charAt(i));
                stack.push(result.toString());
                result.setLength(0);
            }else {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                String exp = op1 + op2 + prefix.charAt(i);
                stack.push(exp);
            }
        }

        return stack.peek();
    }

}
