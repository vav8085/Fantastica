package com.vav.Leetcode.Easy;

import com.vav.CTCI.Archive.work_2017.Common.LinkedList.Link;

public class RemoveDuplicatesSortedList_83 {

    /**
     * We can do this with the help of 2 pointers current and previous
     *
     * We will keep traversing the list with the help of current. As soon as we will get a node whose value does not match
     * the value of previous we will assign previous.next = current and previous = current and keep going current = current.next
     * until previous.data == current.data
     * @param head
     * @return
     */
    public static Link<Integer> removeDuplicates(Link<Integer> head){
        Link<Integer> current = head;
        Link<Integer> previous = head;

        while(current.getNext()!=null){
            current = current.getNext();
            if(current.getData()!=previous.getData()){
                previous.setNext(current);
                previous = current;
            }
        }
        previous.setNext(null);
        return head;
    }
    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> link2 = new Link<>(1);
        Link<Integer> link3 = new Link<>(1);
        Link<Integer> link4 = new Link<>(2);
        Link<Integer> link5 = new Link<>(2);
        Link<Integer> link6 = new Link<>(3);
        Link<Integer> link7 = new Link<>(3);
        Link<Integer> link8 = new Link<>(3);
        link1.setNext(link2);
        link2.setNext(link3);
        link3.setNext(link4);
        link4.setNext(link5);
        link5.setNext(link6);
        link6.setNext(link7);
        link7.setNext(link8);

        Link newHead = removeDuplicates(link1);
        while (newHead!=null){
            System.out.print(newHead.getData()+"->");
            newHead = newHead.getNext();
        }


    }
}
