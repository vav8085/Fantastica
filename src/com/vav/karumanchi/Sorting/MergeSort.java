package com.vav.karumanchi.Sorting;

/**
 * Created by Vaibhav on 3/25/2017.
 */
public class MergeSort {
    private int[] array;
    private int[] tempArray;
    private int length;

    public static void main(String arg[]){
        MergeSort mergeSort = new MergeSort();
        int arr[] = {10,11,2,1,9,8,7,6,5,4,3};
        mergeSort.mergeSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private void mergeSort(int[] arr) {
        array = arr;
        length = arr.length;
        tempArray = new int[length];
        doMergeSort(0,length-1);
    }

    private void doMergeSort(int lowerIndex, int upperIndex) {
        if(lowerIndex < upperIndex){
            int middle = lowerIndex + (upperIndex -lowerIndex)
        }
    }
}
