package Algorithms;

import Structure.Stack.Stack;

import java.util.Arrays;

public class InfixToPrefix {

    public static String infixToPrefix(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuilder temp = new StringBuilder(infix).reverse();
        String[] reverse = temp.toString().split("");
        String res = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < reverse.length ; i++) {
            if (reverse[i].equals(")")){
                reverse[i] = "(";
            }else if (reverse[i].equals("(")){
                reverse[i] = ")";
            }
        }
        res = String.join(",", reverse);
        res = res.replace(",", "");
        System.out.println(res);

        for (int i = 0; i < res.length() ; i++) {
            if ((res.charAt(i) >= 'a' && res.charAt(i) <= 'z')||
                    (res.charAt(i)>= 'A' && res.charAt(i) <= 'Z')){
                sb.append(res.charAt(i));
            }
        }

        System.out.println(sb);



        return sb.toString();
    }

}
