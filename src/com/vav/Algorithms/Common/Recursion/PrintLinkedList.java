package com.vav.Algorithms.Common.Recursion;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
/**
 * Created by Vaibhav on 1/15/18.
 */
public class PrintLinkedList {
    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> link2 = new Link<>(2);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link4 = new Link<>(4);
        link1.setNext(link2);
        link2.setNext(link3);
        link3.setNext(link4);

        printLinkedList(link1);

    }
    public static void printLinkedList(Link root){
        if(root==null){
            return;
        }
        //The statement is coming before recursive call here.
        System.out.println(root.getData());
        printLinkedList(root.getNext());
    }
}
