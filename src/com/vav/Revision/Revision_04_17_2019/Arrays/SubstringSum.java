package com.vav.Revision.Revision_04_17_2019.Arrays;

public class SubstringSum {
    public int largestSubstringSum(int[] input){ //-1,-3,-2,4,-1,5,-3,1
        int sumTillNow = 0;
        int maxSum = 0;

        for(int i=0;i<input.length;i++){
            sumTillNow = sumTillNow + input[i];
            if(sumTillNow<0){
                sumTillNow =0;
            }
            if(maxSum < sumTillNow){
                maxSum = sumTillNow;
            }
        }
        return maxSum;
    }
}
