package com.vav.Reference.educative.DSInJavaInterviewRefresher.Arrays;

public class Challenge_07_SecondMaximumValueInArray {
    public static int secondMaximumValueInArray(int[] input){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>firstMax){
                secondMax = firstMax;
                firstMax = input[i];
            }
        }
        return secondMax;
    }
    public static void main(String arg[]){
        int[] input = { 1,4,7,2,9,6};
        System.out.println(secondMaximumValueInArray(input));
    }
}
