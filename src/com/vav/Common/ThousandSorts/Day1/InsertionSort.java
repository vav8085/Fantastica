package com.vav.Common.ThousandSorts.Day1;

/**
 * Created by vaibhav on 6/9/17.
 */
public class InsertionSort {
    public static void main(String arg[]){
        int[] arr = {3,2,1};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void insertionSort(int[] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>=temp){
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = temp;
        }

    }
    private static void swap(int i,int j, int[] arr){
        int k = arr[i];
        arr[i]= arr[j];
        arr[j] = k;
    }
}
