package com.vav.Common.PriorityQueue;

/**
 * Created by vaibhav on 9/22/17.
 */
public class ArrayPriorityMain {
    public static void main(String arg[]){
        ArrayPriorityQ arrayPriorityQ = new ArrayPriorityQ(5);
        arrayPriorityQ.enqueue(5);
        arrayPriorityQ.enqueue(4);
        arrayPriorityQ.enqueue(3);
        arrayPriorityQ.enqueue(2);
        System.out.println(arrayPriorityQ.dequeue());
        System.out.println(arrayPriorityQ.dequeue());
        System.out.println(arrayPriorityQ.dequeue());
        System.out.println(arrayPriorityQ.dequeue());


    }
}
