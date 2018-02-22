package com.vav.Common.DivideAndConquer;

/**
 * Created by Vaibhav on 2/22/18.
 */
public class LinearSearch {
    public static void main(String arg[]){
        int[] arr = {5,3,2,1,7,4};

        System.out.println(linearSearchRecursive(arr,0,arr.length-1,10));
    }

    /**
     *
     * Worst case is T(N) where element is not found and we have to go through entire array
     *
     * @param A
     * @param low
     * @param high
     * @param key
     * @return
     */
    public static boolean linearSearchRecursive(int A[], int low, int high,int key){
        if(A[low]==key){
            return true;
        }
        if(low>=high){
            return false;
        }
        return linearSearchRecursive(A,++low,high,key);
    }
}
