package com.vav.CoursesBooks.epi.linkedLists;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;

public class DeleteKthNodeFromEnd_07 {

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

        deletekthNodeFromEnd(listA,4);
        while (listA!=null){
            System.out.println(listA.getData());
            listA=listA.getNext();
        }
    }
    public static void deletekthNodeEnd2Iterations(Link<Integer> head, int k){
        Link<Integer> current = head;
        int length = 0;
        while (current!=null){
            length++;
            current = current.getNext();
        }
        int nodePositionFromStart = length-k;
        current=head;
        Link<Integer> previous = current;
        while (nodePositionFromStart!=0){
            previous = current;
            current = current.getNext();
            nodePositionFromStart--;
        }
        previous.setNext(current.getNext());
    }
    public static void deletekthNodeFromEnd(Link<Integer> head, int k){
        int j=k;
        Link<Integer> dummy = head;
        Link<Integer> front = dummy;
        Link<Integer> rear = dummy;
        while (j!=0){
            front = front.getNext();
            j--;
        }
        while (front.getNext()!=null){
            front = front.getNext();
            rear = rear.getNext();
        }
        rear.setNext(rear.getNext().getNext());
    }
}
