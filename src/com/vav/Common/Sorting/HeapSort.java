package com.vav.Common.Sorting;

import com.vav.Common.Heaps.Heap;

/**
 * Created by Vaibhav on 12/14/17.
 */
public class HeapSort {

    public static void main(String arg[]){
        int[] arr = {15,12,16,7,8,2,1};
        int[] outputArr = heapSort(arr);
        for(int i=arr.length;i>0;i--){
            System.out.println(outputArr[i]);
        }
    }

    public static int[] heapSort(int[] inputArray){
        Heap heap = new Heap(inputArray.length);
        for(int i=0;i<inputArray.length;i++){
            heap.insert(inputArray[i]);
        }
        for(int j=0;j<inputArray.length;j++){
            inputArray[j] = heap.remove();
        }
        return inputArray;
    }
}
