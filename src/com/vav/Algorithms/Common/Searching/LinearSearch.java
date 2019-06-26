package com.vav.Algorithms.Common.Searching;

/**
 * Created by vaibhav on 1/14/18.
 */
public class LinearSearch {

    public static void main(String arg[]){
        int[] arr = {5,4,6,7,9,2,3,1};
        System.out.print(linearSearchIterative(arr,4));
    }
    public static boolean linearSearchIterative(int[] arr, int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return true;
            }
        }
        return false;
    }
    public static boolean linearSearchRecursive(int[] arr,int start, int end, int term){
        if(start>end){
            return false;
        }
        if(arr[start]==term){
            return true;
        }
        return linearSearchRecursive(arr,start+1,end,term);
    }
}
