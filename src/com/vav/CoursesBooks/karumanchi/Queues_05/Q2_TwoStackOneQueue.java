package com.vav.CoursesBooks.karumanchi.Queues_05;

import java.util.Stack;

/**
 * Created by vaibhav on 12/24/17.
 */
public class Q2_TwoStackOneQueue {
    Stack<Integer> insertStack;
    Stack<Integer> removeStack;

    public Q2_TwoStackOneQueue(){
        insertStack = new Stack<>();
        removeStack = new Stack<>();
    }
    public void isEmpty(){
        removeStack.isEmpty();
    }
    public void insert(int item){
        while(!removeStack.isEmpty()){
            insertStack.push(removeStack.pop());
        }
        insertStack.push(item);
    }
    public void remove(){
        if(removeStack.isEmpty()){
            while (!insertStack.isEmpty()){
                removeStack.push(insertStack.pop());
            }
        }
        removeStack.pop();
    }

    public static void main(String arg[]){
        Q2_TwoStackOneQueue queue = new Q2_TwoStackOneQueue();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.remove();
        queue.remove();
        queue.remove();
    }
}
