package com.vav.Algorithms.Common.Queues;

public class Queue {

    int count=0;
    int front = 0;
    int rear = -1;
    int arr[];

    public Queue(int size){
        arr = new int[size];
    }

    public boolean isEmpty(){
        return count==0?true:false;
    }
    public boolean isFull(){
        return count == arr.length?true:false;
    }
    public void insert(int value){
            if(isFull()) {
                return;
            }
            if(rear==arr.length-1) {
                rear = -1;
            }
            arr[++rear] = value;
            count++;
        }

    public void delete(){
        if(isEmpty()){
            return;
        }
        if(front == arr.length){
            front = 0;
        }
        arr[front++] = -9999;
        count--;
    }
    public int size(){
        return arr.length;
    }

}
