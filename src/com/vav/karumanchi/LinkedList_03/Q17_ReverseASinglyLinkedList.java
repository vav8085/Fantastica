package com.vav.karumanchi.LinkedList_03;

import com.vav.CTCI.Archive.work_2017.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 12/8/17.
 */
public class Q17_ReverseASinglyLinkedList {

    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> link2 = new Link<>(2);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link4 = new Link<>(4);
        Link<Integer> link5 = new Link<>(5);
        link1.setNext(link2);
        link2.setNext(link3);
        link3.setNext(link4);
        link4.setNext(link5);
        link5.setNext(null);
        Link<Integer> newRoot = reverseLinkedList(link1);
        while (newRoot!=null){
            System.out.println(newRoot.getData());
            newRoot = newRoot.getNext();
        }
    }

    private static Link<Integer> reverseLinkedList(Link<Integer> root) {
        Link previous = root;
        Link current = root.getNext();
        previous.setNext(null);
        Link temp;
        while (current!=null){
            temp = current;
            current = current.getNext();
            temp.setNext(previous);
            previous = temp;
        }
        return previous;
    }


}
