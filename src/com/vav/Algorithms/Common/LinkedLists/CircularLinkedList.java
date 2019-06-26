package com.vav.Algorithms.Common.LinkedLists;

/**
 * Created by Vaibhav on 11/25/2016.
 */
public class CircularLinkedList {
    CircularLink head;
    public CircularLinkedList(){
        head = null;
    }
    public void print(){
        CircularLink current = head;
        while(current!=null){
            System.out.print(current.getData()+", ");
            current = current.getNext();
            if(current==head)
                break;
        }
    }
    public void insertAtStart(int data){
        CircularLink link = new CircularLink(data);
        CircularLink current = head;
        if(head==null){
            head = link;
            link.setNext(link);
        }else{
            link.setNext(head);
            while(current.getNext()!=head){
                current=current.getNext();
            }
            current.setNext(link);
            head=link;
        }

    }
    public void insertAtEnd( int data){
        CircularLink link = new CircularLink(data);
        CircularLink current = head;
        while (current.getNext()!=head){
            current = current.getNext();
        }
        current.setNext(link);
        link.setNext(head);
    }
    public void insertAtPosition(int data){

    }
    public void deleteAtStart(){
        CircularLink current = head;
        while(current.getNext()!=head){
            current= current.getNext();
        }
        current.setNext(head.getNext());
        head = head.getNext();

    }
    public void deleteAtEnd(){
        CircularLink current = head;
        while (current.getNext().getNext()!=head){
            current = current.getNext();
        }
        current.setNext(head);

    }
    public void deleteAtPostion(){

    }
}

class CircularLink {

    int data;
    CircularLink next;

    public CircularLink(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircularLink getNext() {
        return next;
    }

    public void setNext(CircularLink next) {
        this.next = next;
    }


}
