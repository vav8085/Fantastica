package com.vav.Common.Sorting;

/**
 * Created by Vaibhav on 3/11/2017.
 */
public class ShellSort {

    public static void main(String arg[]){
        int arr[] = {10,11,2,1,9,8,7,6,5,4,3};
        arr = shellSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] shellSort(int arr[]){
        int i, j, temp;
        int interval = 1;
        while(interval <= arr.length/3){
            interval = interval *3+1;
            while (interval>0){
                for( i=interval;i<arr.length;i++){
                    j=i;
                    temp = arr[i];
                    while (j>(interval-1) && arr[j-interval]>=temp){
                        arr[j] = arr[j-interval];
                        j=j-interval;
                    }
                    arr[j] = temp;
                }
                interval = (interval-1)/3;
            }
            return arr;
        }
        return arr;

    }
}
