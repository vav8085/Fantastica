package com.vav.Algorithms.Common.ProblemTypes.linkedLists;


import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.EmptyListException;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

public class SortingLinkedList_01 {
    /**
     * Interview Camp question
     *
     * We are given a linked list with specific item types and now we need to sort it
     * example 1,2,3,1,1,2,2,3,1,3
     * output  1,1,1,1,2,2,2,3,3,3
     *
     * To solve this problem we will create the number of linked list as we have individual items
     * We then add items to each linked list
     * And then we connect them
     * @param head
     */
    public static LinkedList<Integer> linkedListSorting(Link<Integer> head){
        Link<Integer> current = head;
        int count = 0;
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        while (current!=null){
            switch (current.getData()){
                case 1:
                    list1.insertAtEnd(current.getData());
                    break;
                case 2:
                    list2.insertAtEnd(current.getData());
                    break;
                case 3:
                    list3.insertAtEnd(current.getData());
                    break;
            }
            current = current.getNext();
        }
        try {
            list1.getLastNode().setNext(list2.getHead());
            list2.getLastNode().setNext(list3.getHead());
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
        return list1;
    }
    public static void main(String arg[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(3);
        LinkedList<Integer> result = linkedListSorting(linkedList.getHead());

        Link<Integer> current1 = result.getHead();
        while (current1!=null){
            System.out.println(current1.getData());
            current1 = current1.getNext();
        }

    }
}
