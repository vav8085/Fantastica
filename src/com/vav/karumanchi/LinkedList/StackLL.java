package com.vav.karumanchi.LinkedList;

/**
 * Created by Vaibhav on 11/27/2016.
 */
import com.vav.Common.SinglyLinkedList;
public class StackLL {
    public int top;
    SinglyLinkedList list;
    public StackLL(){
        list = new SinglyLinkedList();
        top = -1;
    }
    public void push(int data){
        list.insertStart(data);
        top++;
    }
    public void pop(){
        list.deleteAtStart();
        --top;
    }
    public void print(){
        list.printList();
        System.out.println();
    }
    public void getTop(){
        list.getHead();
    }
}
