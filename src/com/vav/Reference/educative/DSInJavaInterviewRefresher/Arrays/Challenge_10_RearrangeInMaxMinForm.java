package com.vav.Reference.educative.DSInJavaInterviewRefresher.Arrays;

import java.util.Arrays;

public class Challenge_10_RearrangeInMaxMinForm {

    public static int[] rearrangeInMaxMin(int[] input){
        //Sort the array
        Arrays.sort(input);
        int[] output = new int[input.length];
        //Use two pointers and parse from both sides
        int k = 0;
        for(int i=0,j=input.length-1;i<j;i++,j--){
            output[k++] = input[j];
            output[k++] = input[i];
        }
        return output;
    }
    public static void main(String arg[]){
        int[] input = {1,4,7,2,9,5,3,6};
        int[] output = rearrangeInMaxMin(input);

        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}
