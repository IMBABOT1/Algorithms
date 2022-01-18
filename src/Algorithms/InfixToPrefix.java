package Algorithms;
import java.util.Stack;

public class InfixToPrefix {

    private static boolean isOperator(char c){
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^'){
            return true;
        }else {
            return false;
        }
    }

    private static int precedence(char c){
        if (c == '^'){
            return 3;
        }else if (c == '*' || c == '/'){
            return 2;
        }else if (c == '+' || c == '-'){
            return 1;
        }else {
            return -1;
        }
    }

    public static String infixToPrefix(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuilder temp = new StringBuilder(infix).reverse();
        String[] reverse = temp.toString().split("");
        String reversed = "";
        String prefix = "";

        for (int i = 0; i < reverse.length ; i++) {
            if (reverse[i].equals(")")){
                reverse[i] = "(";
            }else if (reverse[i].equals("(")){
                reverse[i] = ")";
            }
        }

        for (String s : reverse){
            reversed += s;
        }

        for(int i = 0; i < reversed.length(); i++) {
            if ((reversed.charAt(i) >= 'a' && reversed.charAt(i) <= 'z') ||
                    (reversed.charAt(i) >= 'A' && reversed.charAt(i) <= 'Z')) {
                prefix += reversed.charAt(i);
            }else if (reversed.charAt(i) == '('){
                stack.push(reversed.charAt(i));
            }else if (reversed.charAt(i) == ')'){
                while ((stack.peek() != '(') && (!stack.empty())){
                    char ch = stack.peek();
                    prefix += ch;
                    stack.pop();
                }
                if (stack.peek() == '('){
                    stack.pop();
                }
            }else if (isOperator(reversed.charAt(i))){
                if (stack.empty()){
                    stack.push(reversed.charAt(i));
                }else {
                    if (precedence(reversed.charAt(i)) > precedence(stack.peek())){
                        stack.push(reversed.charAt(i));
                    }else if (precedence(reversed.charAt(i)) == precedence(stack.peek()) && reversed.charAt(i) == '^'){
                        while (precedence(reversed.charAt(i)) == precedence(stack.peek()) && reversed.charAt(i) == '^'){
                            prefix += stack.peek();
                            stack.pop();
                        }
                        stack.push(reversed.charAt(i));
                    }else if (precedence(reversed.charAt(i)) == precedence(stack.peek())){
                        stack.push(reversed.charAt(i));
                    }else {
                        while ((!stack.empty()) && precedence(reversed.charAt(i)) < precedence(stack.peek())){
                            prefix += stack.peek();
                            stack.pop();
                        }
                        stack.push(reversed.charAt(i));
                    }
                }
            }
        }

        while (!stack.empty()){
            prefix += stack.peek();
            stack.pop();
        }

        StringBuilder res = new StringBuilder(prefix).reverse();


        return res.toString();
    }
}
