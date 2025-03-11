package com.vav.Archive.CTCI.Archive.work_2017.Chapter2;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * Created by Vaibhav on 5/9/17.
 */
public class Q2_KthToLast {
    public static int kThToLast(LinkedList<Integer> linkedList,Integer number){
        Link<Integer> head = linkedList.getHead();
        Link<Integer> current = head;
        int count=1;
        while(current.getNext()!=null){
            count++;
            current = current.getNext();
        }
        current=head;
        int node = count-number;
        count=1;
        while (current.getNext()!=null && count<=node){
            count++;
            current = current.getNext();
        }
        return current.getData();
    }
    public static void main(String arg[]){
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(8);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(10);

        System.out.println(kThToLast(linkedList,5));

    }
}
