package com.vav.karumanchi.Sorting;

/**
 * Created by Vaibhav on 3/11/2017.
 */
public class BubbleSort {
    public static void main(String arg[]){
        int arr[] = {10,11,2,1};
        arr = bubbleSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] bubbleSort(int arr[]){
        int temp;
        for(int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
