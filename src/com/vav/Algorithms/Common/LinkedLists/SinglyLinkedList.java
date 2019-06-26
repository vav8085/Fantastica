package com.vav.Algorithms.Common.LinkedLists;

/**
 * Created by Vaibhav on 11/9/2016.
 */
public class SinglyLinkedList {
    private Link head;

    public SinglyLinkedList() {
        head = null;
    }

    public void printList() {
        Link current = head;
        while (current != null) {
            System.out.print(current.getData() + ", ");
            current = current.getNext();
        }
    }

    public void insertStart(int data) {
        Link link = new Link(data);
        link.setNext(head);
        head = link;
    }

    public void insertEnd(int data) {
        Link link = new Link(data);
        if(head==null){
            head=link;
            return;
        }
        Link current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(link);

    }

    public void insertAtLocation(int data, int location) {
        Link link = new Link(data);
        Link current = head;
        Link previous = current;
        int currentLocation = 0;
        if (location == 0) {
            link.setNext(head);
            head = link;
        } else {
            while (current != null && currentLocation < location) {
                previous = current;
                current = current.getNext();
                currentLocation++;
            }
            previous.setNext(link);
            link.setNext(current);
        }
    }

    public void deleteAtStart() {
        head = head.getNext();
    }

    public void deleteAtEnd() {
        Link current = head;
        Link previous = null;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        if(previous!=null)
        previous.setNext(null);
        else head=null;

    }

    public void deleteAtLocation(int location) {
        Link current = head;
        Link previous = current;
        int currentLocation = 0;
        if (location == 0) {
            head = head.getNext();
        } else {
            while (current.getNext() != null && currentLocation < location) {
                currentLocation++;
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
        }
    }
    public Link getHead(){
        return head;
    }

    public void nThNodeFromEndTwoIter(int n){
        Link current = head;
        int countOfNodes = 1;
        int position=0;
        while (current.getNext()!=null){
            countOfNodes++;
            current= current.getNext();
        }
        if(countOfNodes<n){
            System.out.println("Node out of range!");
        }else{
            position = countOfNodes-n+1;
            countOfNodes=1;
            current=head;
            while (countOfNodes<position){
                current=current.getNext();
                countOfNodes++;
            }
            System.out.print(current.getData());
        }

    }
    public void nThNodeFromEndDirectAddressTable(){

    }
    public boolean cycleDetectionBf(){

        Link current = head;
        Link previous = current;
        while(previous!=null){
            while (current!=null){
                if(current.getNext()==previous){
                    return true;
                }
                current=current.getNext();
            }
            previous = previous.getNext();
            current= previous;
        }

        return false;
    }
    public boolean cycleDetectionHashTable(){
        Link current = head;
        while(current.getNext()!=null){
            current = current.getNext();
        }
            return false;
    }

}



 class Link {
    private int data;
    private Link next;

    public Link(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }


}
