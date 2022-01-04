package Structure.Stack;

import java.util.Arrays;

public class Stack {
    private int top;
    private int[] arr;
    private int size;

    public Stack(int size){
        arr = new int[size];
        top = -1;
        this.size = size;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size;
    }

    public void push(int value){
        if (isFull()){
            throw new RuntimeException("Stack overflow");
        }
        top++;
        arr[top] = value;
    }

    public int pop(){
        int result;
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        result = arr[top];
        top--;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top ; i++) {
            sb.append(arr[i] + ", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
