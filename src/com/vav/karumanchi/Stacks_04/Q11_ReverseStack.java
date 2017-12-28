package com.vav.karumanchi.Stacks_04;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by vaibhav on 12/22/17.
 */
public class Q11_ReverseStack {
    //We can reverse a stack by using a queue, just save it in queue and then back to stack
    public static void main(String arg[]){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();

        //90 is on top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(70);
        stack.push(90);

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        //10 is on top
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
