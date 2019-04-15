package com.vav.Revision.Revision1.PriorityQueue;

public class rArrayPriorityQueue {

    private final int MAX;
    private int count;
    private PriorityQItem[] queue;


    public rArrayPriorityQueue(int MAX) {
        this.MAX = MAX;
        queue = new PriorityQItem[MAX];
        count = 0;
    }

    public void print(){
        for(int i=0;i<queue.length;i++){
            if(queue[i]!=null)
            System.out.println(queue[i].getPriority());
        }
    }
    public void insert(PriorityQItem item){
        if(!isFull()){
            if (isEmpty()) {
                queue[++count] = item;
            }else{
                int i=count-1;
               for(;i>-1;i--){
                   if(item.getPriority()<queue[i].getPriority()){
                       queue[i+1] = queue[i];
                   }else{
                       break;
                   }
               }
                queue[i+1] = item;
                count++;
            }
        }else{
            System.out.println("Queue is full, cant insert" +item.getPriority());
        }
    }
    public void remove(){
        if(!isEmpty()) {
            queue[--count] = null;
        }else{
            System.out.println("Cant remove, Queue is empty"+ count);
        }
    }

    public boolean isEmpty(){
        return count==-1?true:false;
    }
    public boolean isFull(){
        return count>=MAX?true:false;
    }

}

class PriorityQItem{
    private int priority;
    private int value;

    public PriorityQItem(int priority, int value){
        this.priority = priority;
        this.value = value;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
