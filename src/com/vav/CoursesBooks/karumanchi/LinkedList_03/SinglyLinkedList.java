package com.vav.CoursesBooks.karumanchi.LinkedList_03;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList(){

    }
    public void insert(int data){
        Node node = new Node();
        node.setData(data);
        if(head==null){
            head = node;
        }else{
            while (head.getNext()!=null){
                head = head.getNext();
            }
            head.setNext(node);
        }
    }
    public void print(){
        while (head!=null){
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.setData(data);
        if(head!=null)
            node.setNext(head.getNext());
        head = node;
    }
    public void deleteNode(int position){
        Node current = head;
        Node previous = head;
        
    }
}
class Node{
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
