package com.vav.Reference.epi.linkedLists;

import com.vav.Reference.CTCI.Archive.work_2017.Common.LinkedList.Link;

public class MergeSortedLists_8_01 {
    public static void main(String arg[]){
        Link<Integer> listA = new Link<>(1);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link5 = new Link<>(5);
        Link<Integer> link7 = new Link<>(7);
        Link<Integer> link9 = new Link<>(9);
        listA.setNext(link3);
        link3.setNext(link5);
        link5.setNext(link7);
        link7.setNext(link9);

        Link<Integer> listB = new Link<>(2);
        Link<Integer> link4 = new Link<>(4);
        Link<Integer> link6 = new Link<>(6);
        Link<Integer> link8 = new Link<>(8);
        Link<Integer> link10 = new Link<>(10);
        listB.setNext(link4);
        link4.setNext(link6);
        link6.setNext(link8);
        link8.setNext(link10);


        Link<Integer> listResult = mergeSortedLists(listA,listB);

        while (listResult!=null){
            System.out.println(listResult.getData());
            listResult=listResult.getNext();
        }

    }
    public static Link mergeSortedLists(Link<Integer> a, Link<Integer> b){
        Link<Integer> result = new Link(0);
        Link<Integer> current = result;
        while(a!=null && b!=null){
            if(a.getData()>b.getData()){
                current.setNext(b);
                b = b.getNext();
            }else{
                current.setNext(a);
                a=a.getNext();
            }
            current = current.getNext();
        }
        if(a!=null){
            current.setNext(a);
        }
        if (b!=null){
            current.setNext(b);
        }
        return result.getNext();
    }
}
