package com.vav.CoursesBooks.karumanchi.archieve.Stacks_04;

import java.util.Stack;

/**
 * Created by vaibhav on 12/20/17.
 *
 * This soultion just stores value in min stack when its less than the value on its top
 *
 * It removes the value with our stack value and minstack value are same.
 */
public class Q7_GetMinStackO1Optimal {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    Q7_GetMinStackO1Optimal(){
        stack = new Stack();
        minStack = new Stack<>();
    }
    public static void main(String arg[]) {
        Q7_GetMinStackO1Optimal testStack = new Q7_GetMinStackO1Optimal();
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
        }
        return;
    }
    public void pop(){
        if(stack.peek().equals(minStack.peek()))
        minStack.pop();
        stack.pop();
    }
    public int getMin(){
        return minStack.peek();
    }

}
