package com.vav.karumanchi.LinkedList_03;

import com.vav.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

import java.util.HashMap;

/**
 * Created by vaibhav on 11/26/17.
 */
public class Q3_NthNodeFromEndHashmap {
    public static void main(String arg[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        System.out.println(nthNodeFromEndHashMap(ll.getHead(),4));

    }

    private static int nthNodeFromEndHashMap(Link head, int position) {
        HashMap<Integer,Link> hashMap = new HashMap<>();
        int count=1;
        Link current = head;
        while (current!=null){
            hashMap.put(count,current);
            count++;
            current=current.getNext();
        }
        return count>position?(int) hashMap.get(count-position).getData():-1;
    }
}
