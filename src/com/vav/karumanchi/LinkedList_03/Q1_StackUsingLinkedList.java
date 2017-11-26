package com.vav.karumanchi.LinkedList_03;

import com.vav.Common.Stacks.LinkedStack;

/**
 * Created by vaibhav on 11/25/17.
 */
public class Q1_StackUsingLinkedList {
    public static void main(String arg[]){
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(10);
        linkedStack.push(20);
        linkedStack.push(30);
        linkedStack.push(40);
        linkedStack.push(50);
        linkedStack.printStackTest();
        linkedStack.pop();
        linkedStack.pop();
        System.out.println();
        linkedStack.printStackTest();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        System.out.println();
        linkedStack.printStackTest();
    }
}
