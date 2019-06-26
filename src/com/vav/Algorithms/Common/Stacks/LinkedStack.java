package com.vav.Algorithms.Common.Stacks;

import com.vav.Algorithms.Common.LinkedLists.SinglyLinkedList;

/**
 * Created by vaibhav on 11/25/17.
 */
public class LinkedStack {
    SinglyLinkedList stackList;

    public LinkedStack(){
        stackList = new SinglyLinkedList();
    }
    public void push(int item){
        stackList.insertEnd(item);
    }
    public boolean isEmpty(){
        return stackList.getHead()!=null?true:false;
    }
    public void pop(){
        stackList.deleteAtEnd();
    }
    public void peek(){
    }
    public void printStackTest(){
        stackList.printList();
    }
}

