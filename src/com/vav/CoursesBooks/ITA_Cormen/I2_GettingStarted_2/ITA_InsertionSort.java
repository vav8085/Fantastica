package com.vav.CoursesBooks.ITA_Cormen.I2_GettingStarted_2;

public class ITA_InsertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>=temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int k = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = k;
                }
            }
        }
        return arr;
    }
    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minimum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minimum]){
                    minimum = j;
                }
            }
            int k = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = k;
        }
        return arr;
    }

    public static void main(String arg[]){
        int arr[] = {5,4,3,2,1};
        arr = insertionSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
