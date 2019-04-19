package com.vav.CoursesBooks.karumanchi.archieve.Queues_05;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by vaibhav on 12/23/17.
 */
public class Q1_ReverseQueue {

    /**
     * The simple technique here is to use a stack and remove an element from queue and push it to the stack
     *
     * After that pop the stack again and push the elements to the queue
     */
    public static void main(String arg[]){
        Queue queue = new ArrayDeque();
        Stack stack = new Stack();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(25);

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()){
            System.out.print(queue.remove()+", ");
        }
    }
}
