package com.vav.Algorithms.Common.Queues;

import com.vav.Reference.CTCI.Archive.work_2017.Common.LinkedList.Link;

public class QueueTest {

    public static void main(String arg[]){
//        Queue queue = new Queue(4);
        LinkedQueue queue = new LinkedQueue();

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
        queue.delete();
//        queue.delete();
//        queue.delete();
//        queue.delete();
//        queue.delete();
//        queue.delete();
//        queue.insert(5);
//        queue.insert(6);
//        queue.insert(7);
//        queue.delete();
//        queue.delete();


        Link current = queue.linkedList.getHead();
        while (current!=null){
            System.out.println(current.getData());
            current = current.getNext();
        }

    }
}
