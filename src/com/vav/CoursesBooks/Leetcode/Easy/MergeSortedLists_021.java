package com.vav.CoursesBooks.Leetcode.Easy;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 2/4/2018.
 */
public class MergeSortedLists_021 {
    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> linkx = link1;
        link1.setNext(new Link<>(3));
        link1 = link1.getNext();
        link1.setNext(new Link<>(5));
        link1 = link1.getNext();
        link1.setNext(new Link<>(7));

        Link<Integer> link2 = new Link<>(2);
        Link<Integer> linky = link2;
        link2.setNext(new Link<>(4));
        link2 = link2.getNext();
        link2.setNext(new Link<>(6));
        link2 = link2.getNext();
        link2.setNext(new Link<>(8));
        link2 = link2.getNext();
        link2.setNext(new Link<>(10));
        link2 = link2.getNext();
        link2.setNext(new Link<>(12));
        link2 = link2.getNext();
        link2.setNext(new Link<>(14));

        Link<Integer> head = mergeTwoSortedList(linkx,linky);

        while (head!=null){
            System.out.println(head.getData());
            head = head.getNext();
        }


    }
    public static Link<Integer> mergeTwoSortedList(Link<Integer> l1,Link<Integer> l2){
        Link<Integer> lNew = new Link<>(9999);
        Link<Integer> linkx = lNew;
        while (l1!=null && l2!=null){
            if(l1.getData()>l2.getData()){
                lNew.setNext(l2);
                l2 = l2.getNext();
            }else{
                lNew.setNext(l1);
                l1 = l1.getNext();
            }
            lNew = lNew.getNext();
        }
        while (l1!=null){
            lNew.setNext(l1);
            l1 = l1.getNext();
            lNew = lNew.getNext();
        }
        while (l2!=null){
            lNew.setNext(l2);
            l2 = l2.getNext();
            lNew = lNew.getNext();
        }
        return linkx.getNext();
    }
}
