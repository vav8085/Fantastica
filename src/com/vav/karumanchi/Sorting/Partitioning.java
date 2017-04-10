package com.vav.karumanchi.Sorting;

/**
 * Created by Vaibhav on 4/9/2017.
 */
public class Partitioning {
    static int arr[] = {10,11,2,1,9,8,7,6,5,4,3};
    public static void main(String arg[]){
       // mergeSort.mergeSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int partition = partitionit(arr[0],arr[arr.length-1],arr.length/2);
    }

    private static int partitionit(int start, int end, int partition) {
        int left = start-1;
        int right = end+1;
        while(left<right && arr[left++]<arr[partition]);
        while (right>left && arr[right--]>arr[partition]);


        return arr[partition];
    }

}
