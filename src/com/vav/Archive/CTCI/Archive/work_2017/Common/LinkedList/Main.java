package com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList;

/**
 * Created by Vaibhav on 5/6/2017.
 */
public class Main {
    public static void main (String arg[]){
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtStart('C');
        linkedList.insertAtStart('B');
        linkedList.insertAtStart('A');
        linkedList.insertAtEnd('D');
        linkedList.insertAtPosition('Z',0);
        linkedList.deleteAtPosition(2);
        linkedList.printList();
    }
}
