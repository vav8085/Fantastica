package com.vav.CoursesBooks.Leetcode.warplan.Easy;

/**
 * Created by vaibhav on 2/6/18.
 */
public class MaxSubArray_053 {

    public static void main(String arg[]){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubArray(arr));
    }
    public static int maximumSubArray(int[] arr){
        int sumTillNow = 0;
        int totalSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sumTillNow<0){
                sumTillNow=0;
            }
            sumTillNow = sumTillNow + arr[i];
            if(sumTillNow>totalSum){
                totalSum = sumTillNow;
            }
        }
        return totalSum;
    }
}
