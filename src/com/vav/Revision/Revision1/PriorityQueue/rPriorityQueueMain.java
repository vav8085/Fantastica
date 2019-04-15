package com.vav.Revision.Revision1.PriorityQueue;

public class rPriorityQueueMain {
    public static void main(String arg[]){
        rArrayPriorityQueue queue = new rArrayPriorityQueue(5);
        queue.insert(new PriorityQItem(5,5));
        queue.insert(new PriorityQItem(2,5));
        queue.insert(new PriorityQItem(4,5));
        queue.insert(new PriorityQItem(3,5));
        queue.insert(new PriorityQItem(1,5));
        queue.insert(new PriorityQItem(6,5));
//        queue.remove();
//        queue.remove();
        queue.print();

    }
}
