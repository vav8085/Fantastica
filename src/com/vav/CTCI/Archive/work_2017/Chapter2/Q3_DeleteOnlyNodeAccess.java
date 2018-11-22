package com.vav.CTCI.Archive.work_2017.Chapter2;

import com.vav.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * Created by Vaibhav on 5/9/17.
 */
public class Q3_DeleteOnlyNodeAccess {
    //Simply copy all the values of the nodes after this node backwards
    public static void deleteOnlyNodeAccess(Link previous) {
        Link current = previous.getNext();
        while (previous != null) {
            if (current != null) {
                previous = current;
                current = current.getNext();
            } else {
                previous = null;
            }
        }
    }

    public static void main(String arg[]) {
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
        deleteOnlyNodeAccess(linkedList.getHead().getNext().getNext().getNext());
        linkedList.printList();
    }
}
