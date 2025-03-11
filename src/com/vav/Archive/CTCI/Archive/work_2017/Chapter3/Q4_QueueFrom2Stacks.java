package com.vav.Archive.CTCI.Archive.work_2017.Chapter3;
import com.vav.Archive.CTCI.Archive.work_2017.Common.GenStack.*;

/**
 * Created by Vaibhav on 8/25/17.
 * We can solve this problem by having two stacks, one for push and one for pop
 * We can transfer all the items from push stack to pop stack whennever we wait to pop the bottommost item
 * We can transfer all the items from pop stack to the push stack whenever we want to push a new item to the stack.
 */
public class Q4_QueueFrom2Stacks<T> {
        private GenStack enqueueStack;
        private GenStack dequeueStack;
    public Q4_QueueFrom2Stacks(int size){
        enqueueStack = new GenStack(size);
        dequeueStack = new GenStack(size);
    }
    public T dequeue() throws Exception {
        while(!enqueueStack.isEmpty()) {
            try {
                dequeueStack.push(enqueueStack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (T) dequeueStack.pop();
    }
    public void enqueue(T item) throws Exception {
        while(!dequeueStack.isEmpty()){
            try {
                enqueueStack.push(dequeueStack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        enqueueStack.push(item);

    }
    public static void main(String arg[]){
        Q4_QueueFrom2Stacks<Integer> q4_queueFrom2Stacks = new Q4_QueueFrom2Stacks(3);
        try {
            q4_queueFrom2Stacks.enqueue(1);
            q4_queueFrom2Stacks.enqueue(2);
            System.out.println(q4_queueFrom2Stacks.dequeue());
            q4_queueFrom2Stacks.enqueue(3);
            q4_queueFrom2Stacks.enqueue(4);
            System.out.println(q4_queueFrom2Stacks.dequeue());
            System.out.println(q4_queueFrom2Stacks.dequeue());
            System.out.println(q4_queueFrom2Stacks.dequeue());
            q4_queueFrom2Stacks.enqueue(10);
            q4_queueFrom2Stacks.enqueue(20);
            q4_queueFrom2Stacks.enqueue(30);
            //q4_queueFrom2Stacks.enqueue(40);
            System.out.println(q4_queueFrom2Stacks.dequeue());
            System.out.println(q4_queueFrom2Stacks.dequeue());
            System.out.println(q4_queueFrom2Stacks.dequeue());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
