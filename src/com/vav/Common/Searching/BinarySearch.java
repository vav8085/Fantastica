package com.vav.Common.Searching;

/**
 * Created by Vaibhav on 1/15/18.
 */
public class BinarySearch {

    public static void main(String arg[]){
        int[] arr = {1,3,5,9,11,15,17};
        System.out.println(binarySearchRecursive(arr,0,arr.length-1,11));
    }

    public static int binarySearchRecursive(int[] arr,int start, int end, int searchTerm){
        if(start>end) {
            return -1;
        }
            int mid = start + (end - start) / 2;
            if (arr[mid] == searchTerm) {
                return mid;
            }
            if (arr[mid] > searchTerm) {
                return binarySearchRecursive(arr, start, mid - 1, searchTerm);
            }
            return binarySearchRecursive(arr, mid + 1, end, searchTerm);
        }

}
