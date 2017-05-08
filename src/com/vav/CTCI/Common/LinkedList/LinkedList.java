package com.vav.CTCI.Common.LinkedList;

/**
 * Created by Vaibhav on 5/6/2017.
 */
public class LinkedList<T> {
    private Link head;
    public LinkedList(){
        head=null;
    }
    public void insertAtEnd(T data){
        Link<T> node = new Link(data);
        node.setNext(null);
        if(head==null){
            head = node;
            return;
        }
        Link current = head;
       while(current.getNext()!=null){
           current = current.getNext();
       }
       current.setNext(node);
    }
    public void insertAtStart(T data){
        Link<T> node = new Link(data);
        node.setNext(null);
        if(head==null){
            head = node;

        }else{
            node.setNext(head);
            head = node;
        }
    }
    public void insertAtPosition(T data, int position){
        Link<T> node = new Link(data);
        node.setNext(null);
        Link current = head;
        Link previous = null;
        int count=0;
        if(head == null){
            head = node;
            return;
        }
        if(position ==0){
            node.setNext(head);
            head =node;
            return;
        }
        while(current!=null && count<position){
            previous = current;
            current = current.getNext();
            count++;
        }
        previous.setNext(node);
        node.setNext(current);
    }
    public void printList(){
        Link current = head;
        while(current!=null){
            System.out.print(current.getData()+"->");
            current=current.getNext();
        }
    }
    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        if(position==0){
            head = head.getNext();
            return;
        }
        Link current=head,previous=null; int count=0;
        while(current.getNext()!=null &&count<position){
            previous = current;
            current = current.getNext();
            count++;
        }
        previous.setNext(current.getNext());
    }
    public Link getHead(){
        return head;
    }
    public void setHead(Link head){
        this.head = head;
    }

}
