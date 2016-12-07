package com.vav.Common;

/**
 * Created by Vaibhav on 11/23/2016.
 */
public class DoublyLinkedList {
    DoublyLink head;
    public DoublyLinkedList(){
        head = null;
    }
    public void print(){
        DoublyLink current = head;
        while(current!=null){
            System.out.print(current.getData()+", ");
            current = current.getNext();
        }
    }
    public void insertAtStart(int data){
        DoublyLink link = new DoublyLink(data);
        if(head!=null) {
            link.setNext(head);
            link.setPrevious(null);
            head.setPrevious(link);
            head=link;
        }else{
            link.setPrevious(null);
            link.setNext(null);
            head=link;
        }
    }
    public void insertAtEnd(int data){
        DoublyLink link = new DoublyLink(data);
        link.setNext(null);
        DoublyLink current = head;
        while(current.getNext()!=null){
            current = current.getNext();
        }
        current.setNext(link);
        link.setPrevious(current);

    }
    public void insertAtPosition(int data, int position){
        DoublyLink link = new DoublyLink(data);
        DoublyLink current = head;
        int count = 0;
        if(head==null){
            link.setPrevious(null);
            link.setNext(null);
            head = link;
        }
        if(position==0){
            link.setNext(head);
            link.setPrevious(null);
            head=link;
        }else{
            while(current.getNext()!=null && count<position){
                current = current.getNext();
                count++;
            }
            if(current.getNext()!=null) {
                current.getPrevious().setNext(link);
                link.setPrevious(current.getPrevious());
                link.setNext(current);
                current.setPrevious(link);
            }else{
                current.setNext(link);
                link.setPrevious(current);
            }

        }
    }
    public void deleteAtStart(){
        head = head.getNext();
        head.setPrevious(null);
    }
    public void deleteAtEnd(){
        DoublyLink current = head;
        while(current.getNext()!=null){
            current= current.getNext();
        }
        current.getPrevious().setNext(null);
        current=null;
    }
    public void deleteAtPosition(int position){
        DoublyLink current = head;
        int count =0;
        while(current.getNext()!=null && count<position){
            current = current.getNext();
            count++;
        }
        if(count<=position)
        current.getPrevious().setNext(current.getNext());
        else
            current.getPrevious().setNext(null);
    }

}

class DoublyLink{
    private int data;
    private DoublyLink previous;
    private DoublyLink next;
    public DoublyLink(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLink getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLink previous) {
        this.previous = previous;
    }

    public DoublyLink getNext() {
        return next;
    }

    public void setNext(DoublyLink next) {
        this.next = next;
    }
}