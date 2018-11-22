package com.vav.karumanchi.LinkedList_03;

import com.vav.CTCI.Archive.work_2017.Common.LinkedList.Link;

import java.util.HashMap;

/**
 * Created by Vaibhav on 11/26/2017.
 */
public class Q8_CheckCycleUsingHashmaps {
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
        System.out.println(checkCyclicityUsingHashmap(link1));

    }

    private static boolean checkCyclicityUsingHashmap(Link<Integer> root) {
        HashMap<Link,Integer> hashMap = new HashMap<>();
        int i= 1;
        Link current = root;
        while (current!=null){
            if(hashMap.containsKey(current)){
               return true;
            }else
            hashMap.put(current,i);
            i++;
            current = current.getNext();
        }
        return false;
    }
}
