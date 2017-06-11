package com.vav.Common.ThousandSorts.Day1;

/**
 * Created by vaibhav on 6/9/17.
 */
public class BubbleSort {
    public static void main(String arg[]){
        int[] arr = {3,2,1};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);

                }
            }
        }
        return arr;
    }
    private static void swap(int i,int j, int[] arr){
        int k = arr[i];
        arr[i]= arr[j];
        arr[j] = k;
    }
}
