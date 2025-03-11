package com.vav.Archive.karumanchi.archieve.Queues_05;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by vaibhav on 12/25/17.
 */
public class Q5_TransferToStack {
    /**
     * We have to transfer to the stack twice once to reverse the order of items and second time to just insert them
     */
    public static void main(String arg[]){
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(2);
        queue.add(7);

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
    }
}
