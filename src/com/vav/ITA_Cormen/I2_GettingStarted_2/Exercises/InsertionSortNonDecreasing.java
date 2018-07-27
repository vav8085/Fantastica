package com.vav.ITA_Cormen.I2_GettingStarted_2.Exercises;

public class InsertionSortNonDecreasing {
    public static int[] insertionSortNonDecreasing(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]<=temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String arg[]){
        int[] arr = {1,2,3,4,5};
        int[] arrSorted = insertionSortNonDecreasing(arr);
        for(int i=0;i<arrSorted.length;i++){
            System.out.println(arrSorted[i]);
        }
    }
}
