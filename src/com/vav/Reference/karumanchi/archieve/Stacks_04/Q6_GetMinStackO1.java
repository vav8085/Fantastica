package com.vav.Reference.karumanchi.archieve.Stacks_04;

import java.util.Stack;

/**
 * Created by vaibhav on 12/20/17.
 * <p>
 * Lets just make this class a stack class whick uses two java stacks
 */
public class Q6_GetMinStackO1 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    Q6_GetMinStackO1(){
        stack = new Stack();
        minStack = new Stack<>();
    }
    public static void main(String arg[]) {
        Q6_GetMinStackO1 testStack = new Q6_GetMinStackO1();
        testStack.push(2);
        testStack.push(4);
        testStack.push(5);
        System.out.println(testStack.getMin());
        testStack.push(3);
        testStack.push(1);
        testStack.push(7);
        System.out.println(testStack.getMin());
        testStack.pop();
        testStack.pop();
        testStack.pop();
        System.out.println(testStack.getMin());
    }

    public void push(int item) {
        stack.push(item);
        if(minStack.isEmpty()){
            minStack.push(item);
            return;
        }
        if(item<minStack.peek()){
            minStack.push(item);
        }else{
            minStack.push(minStack.peek());
        }
        return;
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }
    public int getMin(){
        return minStack.peek();
    }

}
