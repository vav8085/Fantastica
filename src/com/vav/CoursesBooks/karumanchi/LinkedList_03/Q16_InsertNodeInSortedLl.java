package com.vav.CoursesBooks.karumanchi.LinkedList_03;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 11/30/17.
 */
public class Q16_InsertNodeInSortedLl {

    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> link2 = new Link<>(2);
        //Link<Integer> link3 = new Link<>(3);
        Link<Integer> link4 = new Link<>(4);
        Link<Integer> link5 = new Link<>(5);
        Link<Integer> link6 = new Link<>(6);

        link1.setNext(link2);
        link2.setNext(link4);
        link4.setNext(link5);
        link5.setNext(link6);
        link6.setNext(null);
        Link<Integer> head = insertNodeInSortedLl(link1,3);
        while (head!=null){
            System.out.print(head.getData());
            head = head.getNext();
        }

    }
    public static Link<Integer> insertNodeInSortedLl(Link<Integer> head, int nodeData){
        Link<Integer> nodeToInsert = new Link<>(nodeData);

        Link<Integer> current = head;
        Link<Integer> previous = current;
        if(head==null){
            return nodeToInsert;
        }
        while (current!=null){
            previous = current;
            current = current.getNext();
            if(previous.equals(head) && nodeData < previous.getData()){
                nodeToInsert.setNext(previous);
                head = nodeToInsert;
                return head;
            }
            if(previous.getData()<nodeData && current!=null?current.getData() > nodeData:true){
                previous.setNext(nodeToInsert);
                nodeToInsert.setNext(current);
                return head;
            }
        }
        return head;
    }
}
