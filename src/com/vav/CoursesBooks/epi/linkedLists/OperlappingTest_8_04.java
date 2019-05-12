package com.vav.CoursesBooks.epi.linkedLists;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;

import java.util.HashMap;
import java.util.List;

public class OperlappingTest_8_04 {

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

        Link<Integer> listB = new Link<>(2);
        Link<Integer> link4 = new Link<>(4);
        Link<Integer> link6 = new Link<>(6);
        listB.setNext(link4);
        link4.setNext(link6);
        link6.setNext(link5);

        System.out.println(testForOverlappingList(listA,listB));
    }
    public static Integer testForOverlappingListHashmap(Link<Integer> head1, Link<Integer> head2){
        HashMap<Link<Integer>, Boolean> hashMap = new HashMap<>();
        Link<Integer> current1 = head1;
        while (current1!=null){
            hashMap.put(current1,true);
            current1 = current1.getNext();
        }

        Link<Integer> current2 = head2;
        while (current2!=null){
            if(hashMap.containsKey(current2)){
                return current2.getData();
            }
            current2 = current2.getNext();
        }
        return -1;
    }

    /**
     * The lists will overlap only if they have the same tails, to find this traverse both lists.
     * Along with that count the number of nodes in each list.
     * Go to start of the longer list and traverse the difference
     * Now traverse both lists until you find the first common node.
     * @param listOne
     * @param listTwo
     * @return
     */
    public static int testForOverlappingList(Link<Integer> listOne, Link<Integer> listTwo){
        Link<Integer> currentOne1 = listOne;
        Link<Integer> currentTwo1 = listTwo;
        int countOne = 1;
        int countTwo = 1;
        while (currentOne1.getNext()!=null){
            countOne++;
            currentOne1 = currentOne1.getNext();
        }
        while (currentTwo1.getNext()!=null){
            countTwo++;
            currentTwo1 = currentTwo1.getNext();
        }
        if(currentOne1.getData()!=currentTwo1.getData()){
            //overlap does not exist
            return -1;
        }
        currentOne1 = listOne;
        currentTwo1 = listTwo;

        boolean listOneBigger = (countOne>countTwo)?true:false;
        int difference = Math.abs(countOne-countTwo);
        if(listOneBigger){
            while (difference!=0){
                currentOne1 = currentOne1.getNext();
                difference--;
            }
        }else{
            while (difference!=0){
                currentTwo1 = currentTwo1.getNext();
                difference--;
            }
        }
        while (currentOne1.getData()!=currentTwo1.getData()){
            currentOne1 = currentOne1.getNext();
            currentTwo1 = currentTwo1.getNext();
        }

        return currentOne1.getData();
    }
}
