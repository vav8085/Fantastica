package com.vav.Archive.epi.linkedLists;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;

import java.util.HashMap;

public class Cyclicity_03 {
    public static boolean cyclicityUsingMaps(Link<Integer> head){
        Link<Integer> current = head;
        HashMap<Link<Integer>, Boolean> hashMap = new HashMap<>();
        while (current!=null){
            if(hashMap.containsKey(current)){
                return true;
            }else{
                hashMap.put(current,true);
            }
            current=current.getNext();
        }
        return false;
    }

    public static boolean cyclicityUsingFloydMethod(Link<Integer> head){
        Link<Integer> slow = head;
        Link<Integer> fast = head;
        while (slow!=null && fast!=null && slow.getNext()!=null && fast.getNext()!=null){
            slow=slow.getNext();
            fast = fast.getNext().getNext();
            if(slow.getData()==fast.getData()){
                return true;
            }
        }
        return false;
    }

    public static int findStartCyclicity(Link<Integer> head){
        Link<Integer> slow = head;
        Link<Integer> fast = head;
        boolean isCyclic = false;
        while (slow!=null&& fast!=null && slow.getNext()!=null && fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow.getData()==fast.getData()){
                isCyclic = true;
                break;
            }
        }
        fast = head;
        if(isCyclic) {
            while (slow.getData() != fast.getData()) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
            return slow.getData();
        }else{
            return -1;
        }
    }

    public static void main(String[] arg){
        Link<Integer> listA = new Link<>(1);
        Link<Integer> link3 = new Link<>(2);
        Link<Integer> link5 = new Link<>(3);
        Link<Integer> link7 = new Link<>(4);
        Link<Integer> link9 = new Link<>(5);
        listA.setNext(link3);
        link3.setNext(link5);
        link5.setNext(link7);
        link7.setNext(link9);
        link9.setNext(link3);

        System.out.println(findStartCyclicity(listA));
    }
}
