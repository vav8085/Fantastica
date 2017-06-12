package com.vav.CTCI.Chapter2;

import com.vav.CTCI.Common.LinkedList.Link;
import com.vav.CTCI.Common.LinkedList.LinkedList;

/**
 * Created by Vaibhav on 6/12/17.
 */
public class Q4_Partition {
    public static void main(String arg[]){
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(7);
        linkedList.insertAtEnd(3);
        LinkedList newLinkedList = partitionList(linkedList, 5);

        Link current = newLinkedList.getHead();
        while (current!=null){
            System.out.println(current.getData()+"-");
            current = current.getNext();
        }

    }
    //We can create two linked lists from current linked list , it will need single parsing to set values > or < given value
    public static LinkedList partitionList(LinkedList<Integer> linkedList, int value){
        Link<Integer> baseHead = linkedList.getHead();
        LinkedList smallList = new LinkedList();
        LinkedList largeList = new LinkedList();
        while (baseHead!=null){
            if(baseHead.getData()>=value){
                largeList.insertAtEnd(baseHead.getData());
            }else{
                smallList.insertAtEnd(baseHead.getData());
            }
            baseHead = baseHead.getNext();
        }
        Link smallCurrent = smallList.getHead();

        while (smallCurrent.getNext()!=null){
            smallCurrent = smallCurrent.getNext();
        }
        if(smallList.getHead()!=null) {
            smallCurrent.setNext(largeList.getHead());
            return smallList;
        }else{
            return largeList;
        }
    }
}
