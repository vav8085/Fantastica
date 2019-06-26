package com.vav.Reference.iCamp.A_Basics;

import java.util.Arrays;

public class NumbersSumToValue_02 {
    /**
     * We are trying to find the numbers that sum to a value from an array
     * The strategy is to sort the array and then go from both sides and take the sum
     * if the sum is greater than the number than decrease the value from end and retry
     * otherwise decrease the value from start and retry
     * when start >= end then exit
     * @param value
     * @param arr
     * @return
     */
    public static int[] numbersThatSumTo(int value, int[] arr){
        Arrays.sort(arr);
        for(int i=0,j=arr.length-1; i<j;){
            if(arr[i]+arr[j]==value){
                return new int[]{arr[i], arr[j]};
            }else if(arr[i]+arr[j]<value){
                i++;
            }else{
                j--;
            }
        }
        return arr;
    }
    public static void main(String arg[]){
        int arr[] = {2,8,4,9,11,21};
        int result[] = numbersThatSumTo(13,arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
