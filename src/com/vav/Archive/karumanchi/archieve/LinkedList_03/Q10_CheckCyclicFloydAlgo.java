package com.vav.Archive.karumanchi.archieve.LinkedList_03;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 11/26/2017.
 */
public class Q10_CheckCyclicFloydAlgo {
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
        System.out.println(checkCyclicityFloydAlgo(link1));
    }
    private static boolean checkCyclicityFloydAlgo(Link<Integer> head) {
        Link<Integer> sloPtr = head;
        Link<Integer> fastPtr = head.getNext();

        while(sloPtr!=null && fastPtr!=null && fastPtr.getNext().getNext()!=null && sloPtr.getNext()!=null && fastPtr.getNext() !=null){
            if(sloPtr.equals(fastPtr)){
                return true;
            }
            sloPtr = sloPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        return false;
    }
}
