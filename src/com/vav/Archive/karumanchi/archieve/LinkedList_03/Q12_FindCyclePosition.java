package com.vav.Archive.karumanchi.archieve.LinkedList_03;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;

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
        link5.setNext(link1);
        System.out.println(findCyclePosition(link1));
    }

    private static int findCyclePosition(Link<Integer> head) {
        Link<Integer> sloPtr = head;
        Link<Integer> fstPtr = head;
        boolean loopExist = false;
        while (sloPtr!=null && fstPtr!=null && sloPtr.getNext()!=null && fstPtr.getNext()!=null && fstPtr.getNext().getNext()!=null){
            sloPtr = sloPtr.getNext();
            fstPtr = fstPtr.getNext().getNext();
            if(sloPtr.equals(fstPtr)){
                loopExist = true;
                break;
            }
        }
        if(loopExist) {
            sloPtr = head;
            while (!sloPtr.equals(fstPtr)) {
                sloPtr = sloPtr.getNext();
                fstPtr = fstPtr.getNext();
            }
            return fstPtr.getData();
        }else return -1;
    }
}
