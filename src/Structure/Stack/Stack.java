package Structure.Stack;

import java.util.Arrays;

public class Stack<T> {
    private int top;
    private Object[] arr;
    private int size;

    public Stack(int size){
        arr = new Object[size];
        top = -1;
        this.size = size;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size;
    }

    public void push(T value){
        if (top == size){
            Object[] temp = new Object[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        top++;
        arr[top] = value;
        size = top;
    }

    public T pop(){
        T result;
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        result = (T) arr[top];
        top--;
        return result;
    }

    public int count(){
        return (top+1);
    }

    public T peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return (T) arr[top];
    }

    public void change(int position, T value){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }else if (position > top){
            throw new RuntimeException("Invalid position: " + position);
        }else {
            arr[position] = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        if (top == -1){
            sb.append("[]");
        }else {
            for (int i = 0; i <= top; i++) {
                sb.append(arr[i] + ", ");
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
