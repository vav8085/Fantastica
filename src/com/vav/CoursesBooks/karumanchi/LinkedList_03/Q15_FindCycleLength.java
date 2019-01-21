package com.vav.CoursesBooks.karumanchi.LinkedList_03;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 11/30/17.
 */
public class Q15_FindCycleLength {

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
        link5.setNext(link3);
        System.out.println(findCycleLength(link1));
    }

    private static int findCycleLength(Link<Integer> head) {
        Link<Integer> sloPtr = head;
        Link<Integer> fstPtr = head;
        boolean loopFound = false;

        while (sloPtr!=null && fstPtr !=null
                && sloPtr.getNext()!=null
                && fstPtr.getNext()!=null
                && fstPtr.getNext().getNext()!=null){
            sloPtr = sloPtr.getNext();
            fstPtr = fstPtr.getNext().getNext();

            if(sloPtr.equals(fstPtr)){
                loopFound = true;
                break;
            }

        }
        if(loopFound){
            sloPtr = head;
            while (!sloPtr.equals(fstPtr)){
                sloPtr = sloPtr.getNext();
                fstPtr = fstPtr.getNext();
            }
        }
        int loopLength=1;
        Link<Integer> current = fstPtr.getNext();
        while (!current.equals(fstPtr)){
            current = current.getNext();
            loopLength++;
        }
        return loopLength;
    }
}
