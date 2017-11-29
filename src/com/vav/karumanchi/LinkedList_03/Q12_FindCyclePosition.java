package com.vav.karumanchi.LinkedList_03;

import com.vav.CTCI.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 11/28/17.
 */
public class Q12_FindCyclePosition {
    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> link2 = new Link<>(2);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link4 = new Link<>(4);
        Link<Integer> link5 = new Link<>(5);
        link1.setNext(link2);
        link2.setNext(link3);
        link3.setNext(link4);
        link4.setNext(link5);
        link5.setNext(null);
        System.out.println(findCyclePosition(link1));
    }

    private static int findCyclePosition(Link<Integer> head) {
        Link<Integer> sloPtr = head;
        Link<Integer> fstPtr = head.getNext();

        while (sloPtr!=null && fstPtr!=null && sloPtr.getNext()!=null && fstPtr.getNext()!=null && fstPtr.getNext().getNext()!=null){
            if(sloPtr.equals(fstPtr)){
                sloPtr = head;
                while (true){
                    if (sloPtr.equals(fstPtr.getNext())){
                        return fstPtr.getData();
                    }
                    sloPtr = sloPtr.getNext();
                    fstPtr = fstPtr.getNext();
                }
            }
            sloPtr = sloPtr.getNext();
            fstPtr = fstPtr.getNext().getNext();
        }
        return -1;
    }
}
