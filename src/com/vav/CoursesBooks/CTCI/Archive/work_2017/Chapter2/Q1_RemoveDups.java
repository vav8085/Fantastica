package com.vav.CoursesBooks.CTCI.Archive.work_2017.Chapter2;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

import java.util.Hashtable;

/**
 * Created by Vaibhav on 5/6/2017.
 */
public class Q1_RemoveDups {
    //If we use a doubly linked list we can go backwards and remove just the previous value not before that

    //Brute Force method, I think we can improve it to avoid complete scans by runner using another variable
    public static LinkedList removeDupsBF(LinkedList linkedList){
        Link head = linkedList.getHead();
        Link current = head;
        while(current.getNext()!=null){
            Link runner = head, previous= null;
            current = current.getNext();
            while(runner!=current){
                if(runner.getData().equals(current.getData())){
                    if(previous!=null)
                    previous.setNext(runner.getNext());
                    else linkedList.setHead(runner.getNext());
                }
                previous = runner;
                runner = runner.getNext();
            }
        }
        return linkedList;
    }

    public static LinkedList removeDupsLinkedList(LinkedList linkedList){
        Link head = linkedList.getHead(); Link<Integer> current = head; Link previous = null;
        Hashtable<Integer,Boolean> hashtable = new Hashtable<>();
        while(current!=null){
            if(hashtable.get(current.getData())!=null &&hashtable.get(current.getData())){
                if(previous == null){
                    linkedList.setHead(current.getNext());
                }else{
                    previous.setNext(current.getNext());
                }
                current = current.getNext();
            }else{
                hashtable.put(current.getData(),true);
                previous= current;
                current = current.getNext();

            }
        }
        return linkedList;
    }

    public static void main(String arg[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(5);
        linkedList.printList();
        System.out.println();
        linkedList = removeDupsLinkedList(linkedList);
        linkedList.printList();

    }
}
