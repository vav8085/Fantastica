package com.vav.Algorithms.Common.PriorityQueue;

/**
 * Created by vaibhav on 9/22/17.
 */
public class ArrayPriorityQ {
    private int max;
    private long[] queueArr;
    private int count;

    public ArrayPriorityQ(int size){
        max = size;
        count=0;
        queueArr = new long[max];
    }

    public void enqueue(int item){
        int i;
        if(!isFull()){
            if(isEmpty()){
                queueArr[count++] = item;
            }else{
                for(i=count-1;i>-1;i--){
                    if(item>queueArr[i]){
                        queueArr[i+1] = queueArr[i];
                    }else{
                        break;
                    }
                }
                queueArr[i+1] = item;
                count++;
            }
        }else{
            System.out.println("The queue is full!");
        }
    }
    public long dequeue(){
        if(!isEmpty())
        return queueArr[--count];
        else return -99999;
    }
    public long peek(){
        return queueArr[count-1];
    }
    public boolean isFull(){
        return count>=max?true:false;
    }
    public boolean isEmpty(){
        return count==-1?true:false;
    }
}
