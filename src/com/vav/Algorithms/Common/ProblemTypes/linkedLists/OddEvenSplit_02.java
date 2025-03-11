package com.vav.Algorithms.Common.ProblemTypes.linkedLists;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

public class OddEvenSplit_02 {
    /**
     * We need to split all the odd indices and even indices of the linked list and add them to two different linked lists.
     * @param input
     */
    public static void oddEvenSplit(LinkedList<Integer> input){
        int i=1;
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();
        Link<Integer> current = input.getHead();
        if(input.getHead()==null){
            return;
        }
        while (current!=null){
            if(i%2==0){
                evenList.insertAtEnd(current.getData());
            }else{
                oddList.insertAtEnd(current.getData());
            }
            i++;
            current = current.getNext();
        }
        Link<Integer> evenListHead = evenList.getHead();
        Link<Integer> oddListHead = oddList.getHead();

        while (evenListHead!=null){
            System.out.println(evenListHead.getData());
            evenListHead = evenListHead.getNext();
        }
        while (oddListHead!=null){
            System.out.println(oddListHead.getData());
            oddListHead = oddListHead.getNext();
        }
    }
    public static void main(String arg[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        oddEvenSplit(linkedList);

    }
}
