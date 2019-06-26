package com.vav.Algorithms.Common.Recursion;

import com.vav.Reference.CTCI.Archive.work_2017.Common.LinkedList.Link;

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
    static void printLinkedListReverse(Link head){
        if(head==null){
            return;
        }
        printLinkedListReverse(head.getNext());
        System.out.println(head.getData());
    }
}

