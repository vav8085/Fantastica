package com.vav.Reference.Leetcode.medium;

public class MaximumSubarraySum_53_2 {
    public static void main(String arg[]){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maximumSubarraySum(arr));
    }
    public static int maximumSubarraySum(int[] input){
        int sumTillNow = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            sumTillNow = (sumTillNow>=0?sumTillNow:0) + input[i];
            maxSum = (sumTillNow>maxSum)?sumTillNow:maxSum;
        }
        return maxSum;
    }
}
