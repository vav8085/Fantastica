package com.vav.Common.Recursion;

import com.vav.CTCI.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 1/15/18.
 */
public class PrintLinkedListReverse {

    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> link2 = new Link<>(2);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link4 = new Link<>(4);
        link1.setNext(link2);
        link2.setNext(link3);
        link3.setNext(link4);

        printLinkedListReverse(link1);

    }
    public static void printLinkedListReverse(Link root){
        if(root.getNext()!=null)
        printLinkedListReverse(root.getNext());
        //The print statement is coming after the recursive call here.
        System.out.println(root.getData());
    }
}

