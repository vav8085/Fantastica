package com.vav.Common.Searching;

/**
 * Created by Vaibhav on 1/15/18.
 */
public class BinarySearch {

    public static void main(String arg[]){
        int[] arr = {1,3,5,8,11,15,20,27};
        System.out.println(binarySearchRecursive(arr,0,arr.length,1));
    }

    public static int binarySearchRecursive(int[] arr,int start, int end, int searchTerm){
        if(end<=start){
            return start-1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == searchTerm ){
            return mid;
        }
        else if(searchTerm<arr[mid]){
            return binarySearchRecursive(arr,start, mid, searchTerm);
        }else{
            return binarySearchRecursive(arr,mid+1, end, searchTerm);
        }
    }
}
