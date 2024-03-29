package com.vav.Algorithms.Common.Heaps;

/**
 * Created by Vaibhav on 12/14/17.
 */
public class HeapMain {
    public static void main(String arg[]){
        Heap heap = new Heap(6);
        heap.insert(1);
        heap.insert(15);
        heap.insert(4);
        heap.insert(16);
        heap.insert(5);
        heap.insert(2);
        heap.changeKey(1,19);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}
