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
            if(isEmpty()){
                queue[++top]=value;
                return;
            }
            int i=top;
            for(;i>=0;i--){
                if(value>queue[i]){
                    queue[i+1] = queue[i];
                }else{
                    break;
                }
            }
            queue[i+1] = value;
            top++;
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
    public void print(){
        for (int j=0;j<queue.length;j++){
            System.out.println(queue[j]);
        }
    }

    public static void main(String arg[]){
        PriorityQueue_01 priorityQueue = new PriorityQueue_01(6);
        priorityQueue.insert(7);
        priorityQueue.insert(4);
        priorityQueue.insert(3);
        priorityQueue.insert(2);
        priorityQueue.insert(1);
        priorityQueue.insert(5);
        priorityQueue.print();
    }
}
