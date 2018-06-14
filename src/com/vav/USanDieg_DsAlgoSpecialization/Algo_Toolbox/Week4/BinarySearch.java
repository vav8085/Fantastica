package com.vav.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week4;

/**
 * Created by vaibhav on 1/17/18.
 */
public class BinarySearch {
    public static void main(String arg[]){
        int arr[] = {2,4,6,8,10};
        System.out.println(binarySearchRecursive(arr,0,arr.length-1,8));
    }
    public static final int binarySearchRecursive(int[] arr, int start, int end, int searchTerm){
        if(start>end) {
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==searchTerm){
            return mid;
        }
        if(searchTerm>arr[mid])
            return binarySearchRecursive(arr,mid+1,end,searchTerm);

            return binarySearchRecursive(arr,start,mid-1,searchTerm);
    }
}
