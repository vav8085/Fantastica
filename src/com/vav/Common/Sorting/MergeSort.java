package com.vav.Common.Sorting;

/**
 * Created by Vaibhav on 3/25/201   7.
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
            int middle = lowerIndex + (upperIndex -lowerIndex);
            //call doMergeSort from lower to mid
            doMergeSort(lowerIndex,middle);
            //call doMergeSort from mid to high
            doMergeSort(middle+1,upperIndex);
            //merging parts
            merge(lowerIndex,middle,upperIndex);
        }
    }

    private void merge(int lowerIndex, int middle, int upperIndex) {
        for(int i=0;i<=upperIndex;i++){
            tempArray[i]=array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        while(i<=middle && j<=upperIndex){
            if(tempArray[i]<=tempArray[j]){
                array[k]=tempArray[i];
                i++;
            }else{
                array[k]=tempArray[j];
                j++;
            }
            k++;
        }
        while(tempArray[i]<=middle){
            array[k]=tempArray[i];
            i++;
            k++;
        }
    }
}
