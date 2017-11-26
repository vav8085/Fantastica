package com.vav.karumanchi.LinkedList_03;

import com.vav.CTCI.Common.LinkedList.Link;
import com.vav.CTCI.Common.LinkedList.LinkedList;

/**
 * Created by vaibhav on 11/26/17.
 */
public class Q5_NthFromEndOneIter {
    public static void main(String arg[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        System.out.println(nthNodeFromEndOneIter(ll.getHead(),1));

    }

    private static int nthNodeFromEndOneIter(Link head, int position) {
        Link<Integer> firstPointer = head,secondPointer = head;
        int count = 0,count2=0;
        while(firstPointer!=null || secondPointer!=null){
            if(firstPointer!=null){
                count++;
                firstPointer=firstPointer.getNext();
            }else{
                if(count2!=(count-position)){
                    secondPointer = secondPointer.getNext();
                    count2++;
                }else{
                    break;
                }
            }
        }
        return secondPointer.getData();
    }
}
