package Algorithms;

import java.util.Arrays;
import java.util.Stack;

public class InfixToPrefix {

    public static String infixToPrefix(String infix){
        Stack<Character> stack = new Stack<>();
        String reverse = new StringBuilder(infix).reverse().toString();
        String[] temp = reverse.split("");

        for (int i = 0; i < temp.length ; i++) {
            if (temp[i].equals(")")){
                temp[i] = "(";
            }else if (temp[i].equals("(")){
                temp[i] = ")";
            }
        }

        return "";
    }
}
