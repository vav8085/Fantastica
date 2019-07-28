package com.vav.Reference.educative.DSInJavaInterviewRefresher.Arrays;

import java.util.Arrays;

public class Challenge_03_FindTwoNumbersAddToN {
    public static void main(String arg[]){
        int[] arr = {1,5,2,4,6,8};
        int value = 11;
        int[] output = numbersAddToN(arr,value);
        for(int i=0;i<output.length;i++) {
            System.out.println(output[i]);
        }
    }
    public static int[] numbersAddToN(int[] input, int value){
        Arrays.sort(input);
        for(int i=0,j=input.length-1;i<input.length&&j>=0;){
            if(input[i]+input[j]==value){
                return new int[]{input[i],input[j]};
            }else if(input[i]+input[j]>value){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{};
    }
}
