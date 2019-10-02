package com.vav.Algorithms.Campaign.Ita.Chapter02_GettingStarted.P2_1_2;

public class ReverseInsertionSort {
    public static void main(String arg[]){
        int[] arr = {1,2,3,4,5};
        int[] output = reverseInsertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(output[i]);
        }
    }
    public static int[] reverseInsertionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int temp = a[i];
            int j=i-1;
            while(j>0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        return a;
    }
}
