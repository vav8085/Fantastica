package com.vav.karumanchi.Sorting;

/**
 * Created by Vaibhav on 3/11/2017.
 */
public class InsertionSort {
    public static void main(String arg[]){
        int arr[] = {10,11,2,1};
        arr = insertionSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] insertionSort(int[] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>=temp){
                arr[j]=arr[j-1];
                --j;
            }
            arr[j]=temp;

        }
        return arr;
    }
}
