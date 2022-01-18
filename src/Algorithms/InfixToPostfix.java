package Algorithms;

import java.util.Stack;

public class InfixToPostfix {

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

    public static String InfixToPostfix(String infix) {
       String postfix = "";
       Stack<Character> s = new Stack<>();
        for(int i=0;i<infix.length();i++) {
            if((infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z')
                    ||(infix.charAt(i) >= 'A' && infix.charAt(i) <= 'Z')) {
                postfix+=infix.charAt(i);
            }
            else if(infix.charAt(i) == '(')
            {
                s.push((infix.charAt(i)));
            }
            else if((infix.charAt(i) == ')')) {
                {
                    while ((s.peek() != '(') && (!s.empty())) {
                        char temp = s.peek();
                        postfix += temp;
                        s.pop();
                    }
                    if (s.peek() == '(') {
                        s.pop();
                    }
                }
            }
            else if(isOperator(infix.charAt(i)))
            {
                if(s.empty())
                {
                    s.push(infix.charAt(i));
                }
                else
                {
                    if(precedence(infix.charAt(i))>precedence(s.peek()))
                    {
                        s.push(infix.charAt(i));
                    }
                    else if((precedence(infix.charAt(i))==precedence(s.peek()))&&(infix.charAt(i) =='^'))
                    {
                        s.push(infix.charAt(i));
                    }
                    else
                    {
                        while((!s.empty())&&( precedence(infix.charAt(i))<=precedence(s.peek())))
                        {
                            postfix+=s.peek();
                            s.pop();
                        }
                        s.push(infix.charAt(i));
                    }
                }
            }
        }
        while(!s.empty())
        {
            postfix+=s.peek();
            s.pop();
        }
        return postfix;
    }
}
