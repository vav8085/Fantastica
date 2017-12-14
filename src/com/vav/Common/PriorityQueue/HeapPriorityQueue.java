package com.vav.Common.PriorityQueue;

import com.vav.Common.Heaps.Heap;

/**
 * Created by Vaibhav on 12/14/17.
 */
public class HeapPriorityQueue {

    private Heap heap;

    HeapPriorityQueue(int size){
        heap = new Heap(size);
    }
    public void insert(int item){
        heap.insert(item);
    }
    public int remove(){
        return heap.remove();
    }

}
