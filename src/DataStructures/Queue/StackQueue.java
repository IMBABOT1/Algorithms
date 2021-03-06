package DataStructures.Queue;

import DataStructures.Stack.GenericStack;

import java.util.Arrays;

public class StackQueue<T> {
    private GenericStack<T> first;
    private GenericStack<T> second;
    private int count;
    private int top1;
    private int top2;
    private int count1;

    private Object[] arr;


    public StackQueue(){
        first = new GenericStack<>();
        second = new GenericStack<>();
        count = 0;
        top1 = 0;
        top2 = 0;
        count1 = 0;
    }

    public void enqueue(T element){
        top1++;
        first.push(element);
        count++;
    }

    private void push1(T element){
        top1++;
        first.push(element);
    }


    private void push2(T element){
        top2++;
        second.push(element);
    }

    public T dequeue(){
        T element;
        T temp;
        if (first.isEmpty() && second.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else {
            for (int i = 0; i < count ; i++) {
                temp = pop1();
                push2(temp);
            }
            element = pop2();
            count1++;
            count--;
            for (int i = 0; i < count; i++) {
                temp = pop2();
                push1(temp);
            }
        }
        return element;
    }

    private T pop1(){
        top1--;
        return first.pop();
    }

    private T pop2(){
        top2--;
        return second.pop();
    }

    public T peek(){
        Object[]temp = first.peekElement();
        return (T) temp[count1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[]temp = first.peekElement();
        if (count1 == temp.length -1){
            throw new RuntimeException("Queue is empty");
        }
        for (int i = count1; i <temp.length ; i++) {
            sb.append(temp[i] + "," + " ");
        }

        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");

        return sb.toString();
    }
}
