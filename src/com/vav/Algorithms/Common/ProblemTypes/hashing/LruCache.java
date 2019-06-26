package com.vav.Algorithms.Common.ProblemTypes.hashing;

import com.vav.Algorithms.Common.Queues.LinkedQueue;

import java.util.*;

public class LruCache {
    private Deque<Integer> deque;
    private HashSet<Integer> lruMap;
    private int size;

    public LruCache(int size) {
        lruMap = new HashSet<>();
        deque = new LinkedList<>();
        this.size = size;
    }
    public void addItem(int item){
        if(lruMap.contains(item)){
            Iterator<Integer> iterator = deque.iterator();
            int i=0; int index=0;
            while (iterator.hasNext()){
                if(iterator.next()==item){
                    index = i;
                    break;
                }
                i++;
            }
            deque.remove(index);

        }else{
            //if item is not contained then we have to add it so we will check for size
            if(lruMap.size()>=size){
                int last = deque.removeLast();
                lruMap.remove(last);
            }
        }
        deque.push(item);
        lruMap.add(item);
    }
}
