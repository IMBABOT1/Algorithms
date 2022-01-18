package Algorithms;

import Structure.Stack.Stack;

import java.util.Arrays;

public class InfixToPrefix {

    public static String infixToPrefix(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuilder temp = new StringBuilder(infix).reverse();
        String[] reverse = temp.toString().split("");

        System.out.println(Arrays.toString(reverse));
        for (int i = 0; i < reverse.length ; i++) {
            if (reverse[i].equals(")")){
                reverse[i] = "(";
            }else if (reverse[i].equals("(")){
                reverse[i] = ")";
            }
        }
        System.out.println(Arrays.toString(reverse));

        return "";
    }

}
