package com.vav.Common.ThousandSorts.Day1;

/**
 * Created by vaibhav on 6/9/17.
 */
public class SelectionSort {
    public static void main(String arg[]) {
        int[] arr = {3, 2, 1};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    public static void selectionSort(int[] arr) {
        int min;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = arr[j];
                }
            }
            swap(min, i,arr);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
