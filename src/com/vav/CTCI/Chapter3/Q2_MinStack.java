package com.vav.CTCI.Chapter3;

/**
 * Created by Vaibhav on 6/19/17.
 */
public class Q2_MinStack {
    public static void main(String arg[]){
        Q2_MinStack stack = new Q2_MinStack(10);
        stack.push(5);
        stack.push(3);
        stack.push(20);
        stack.push(4);
        stack.push(10);
        stack.push(15);
        stack.push(7);
        System.out.println(stack.getMin());
    }

    StackElement[] stackArr;
    int top;

    public Q2_MinStack(int size){
        stackArr = new StackElement[size];
        top = -1;
    }
    public void push(int value){
        if(top==-1) {
            stackArr[++top] = new StackElement(value,value);
        }else {
            StackElement sc = new StackElement(value,stackArr[top].min);
            stackArr[++top] = sc;
        }
    }
    public void pop(){
        stackArr[top--] = null;
    }
    public int getMin(){
        return stackArr[top].min;
    }

}

class StackElement{
    int value;
    int min;
    public StackElement(int value,int min){
        this.value = value;
        this.min = getMin(value,min);
    }
    private int getMin( int value, int min){
        if(value<=min){
            return value;
        } else return min;
    }
}
