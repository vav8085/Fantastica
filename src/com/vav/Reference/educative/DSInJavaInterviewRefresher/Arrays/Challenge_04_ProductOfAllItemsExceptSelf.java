package com.vav.Reference.educative.DSInJavaInterviewRefresher.Arrays;

public class Challenge_04_ProductOfAllItemsExceptSelf {
    public int[] productOfAllExceptSelf(int[] input){
        int[] output = new int[input.length];

        for(int i=0;i<output.length;i++){
            output[i] = 1;
        }
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){
                output[i] = output[i] * input[j];
            }
        }
    }
}
