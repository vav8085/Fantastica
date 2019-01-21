package com.vav.Common.Queues;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

public class LinkedQueue {
    int count=0;
    int maxSize;
    Link front;
    Link rear;
    LinkedList<Integer> linkedList;

    LinkedQueue(){
        linkedList = new LinkedList<>();
    }
    public boolean isEmpty(){
        return linkedList.getHead()==null?true:false;
    }

    public void insert(int data){
        linkedList.insertAtStart(data);
    }
    public void delete(){
        if(isEmpty()){
            return;
        }
        Link current=linkedList.getHead();
        while (current.getNext().getNext()!=null){
            current = current.getNext();
        }
        current.setNext(null);
    }

}

