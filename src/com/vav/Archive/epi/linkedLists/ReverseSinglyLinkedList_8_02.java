package com.vav.Archive.epi.linkedLists;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;

public class ReverseSinglyLinkedList_8_02 {
    public static void main(String arg[]){
        Link<Integer> listA = new Link<>(1);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link5 = new Link<>(5);
        Link<Integer> link7 = new Link<>(7);
        Link<Integer> link9 = new Link<>(9);
        listA.setNext(link3);
        link3.setNext(link5);
        link5.setNext(link7);
        link7.setNext(link9);
        Link<Integer> listResult = reverse(listA);
        while (listResult!=null){
            System.out.println(listResult.getData());
            listResult=listResult.getNext();
        }
    }
    public static Link<Integer> reverse(Link<Integer> head){
        Link<Integer> current = head;
        Link<Integer> previous = current;
        previous.setNext(null);
        current = current.getNext();
        while (current!=null){
            Link<Integer> temp = current;
            current = current.getNext();
            temp.setNext(previous);
            previous=temp;
        }
        return previous;
    }
}
