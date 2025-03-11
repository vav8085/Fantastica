package com.vav.Archive.karumanchi.LinkedList_03;

public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList(){

    }
    public void insert(int data){
        Node node = new Node();
        node.setData(data);
        Node current = head;
        if(head==null){
            head = node;
        }else{
            while (current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(node);
        }
    }
    public void print(){
        Node current = head;
        while (current!=null){
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println();
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.setData(data);
        if(head!=null)
            node.setNext(head.getNext());
        head = node;
    }
    public void insertAtLocation(int data, int location){
        Node node = new Node();
        node.setData(data);
        Node current = head;
        Node previous = current;
        int currentlocation = 1;
        if(location==1){
            node.setNext(head);
            head = node;
        }
        while (current!=null){
            if(currentlocation == location){
                break;
            }
            currentlocation++;
            previous = current;
            current = current.getNext();
        }
        previous.setNext(node);
        node.setNext(current);
    }
    public void deleteNode(int position){
        Node current = head;
        Node previous = current;
        int currentPosition = 1;
        if(position==1){
            head = head.getNext();
            return;
        }
        while(current!=null){
            if(currentPosition==position){
                break;
            }
            currentPosition++;
            previous = current;
            current = current.getNext();
        }
        if(current!=null)
            previous.setNext(current.getNext());
    }
    public static void main(String arg[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);
        singlyLinkedList.insert(4);
        singlyLinkedList.insert(5);
        singlyLinkedList.insert(6);
        singlyLinkedList.print();
        singlyLinkedList.deleteNode(4);
        singlyLinkedList.print();
        singlyLinkedList.insertAtLocation(4,4);
        singlyLinkedList.print();

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
