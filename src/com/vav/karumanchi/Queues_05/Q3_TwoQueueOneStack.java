package com.vav.karumanchi.Queues_05;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by vaibhav on 12/25/17.
 */
public class Q3_TwoQueueOneStack {
    private Queue<Integer> pushQueue;
    private Queue<Integer> popQueue;

    public Q3_TwoQueueOneStack(){
        pushQueue = new ArrayDeque<>();
        popQueue = new ArrayDeque<>();
    }
    public void push(int item){
        pushQueue.add(item);
    }
    public void pop(){
        while (pushQueue.size()!=1) {
            popQueue.add(pushQueue.remove());
        }
        pushQueue.remove();
        while (!popQueue.isEmpty()){
            pushQueue.add(popQueue.remove());
        }
    }
}
