package com.vav.Revision.PrincetonAlgo1.W04;

public class PriorityQueue_01 {
    int[] queue;
    int top = -1;
    int size = 0;
    public PriorityQueue_01(int size){
        queue = new int[size];
        this.size = size;
    }
    public void insert(int value){
        if(!isFull()){
            for(int i=top;i>=0;i--){
                if(queue[top]>value){
                    
                }
            }
        }
    }
    public void delete(){
        if(!isEmpty()){
            top--;
        }
    }
    public boolean isFull(){
        return top>=size?true:false;
    }
    public boolean isEmpty(){
        return top==-1?true:false;
    }
}
