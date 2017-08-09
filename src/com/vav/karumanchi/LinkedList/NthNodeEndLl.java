package com.vav.karumanchi.LinkedList;

import com.vav.Common.LinkedLists.SinglyLinkedList;

/**
 * Created by Vaibhav on 12/7/2016.
 */
public class NthNodeEndLl {
     private  static SinglyLinkedList singlyLinkedList= new SinglyLinkedList();
    public static void main(String arg[]){
        singlyLinkedList.insertStart(5);
        singlyLinkedList.insertStart(4);
        singlyLinkedList.insertStart(3);
        singlyLinkedList.insertStart(2);
        singlyLinkedList.insertStart(1);
        singlyLinkedList.nThNodeFromEndTwoIter(3);
    }


}
