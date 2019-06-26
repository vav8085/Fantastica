package com.vav.Algorithms.Common.Sorting;

/**
 * Created by Vaibhav on 3/11/2017.
 */
public class SelectionSort {
    public static void main(String arg[]){
        int arr[] = {10,11,2,1};
        arr = selectionSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
//    public static int[] selectionSort(int arr[]){
//        int temp;
//        for(int i=0;i<arr.length;i++){
//            int flag = i;
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[flag]){
//                    flag=j;
//                }
//                temp=arr[i];
//                arr[i]=arr[flag];
//                arr[flag]=temp;
//            }
//        }
//        return arr;
//    }
    public static int[] selectionSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest]= temp;
        }
        return arr;
    }
}
