package com.vav.Archive.educative.DSInJavaInterviewRefresher.Arrays;

public class Challenge_05_MinimumValueInArray {
    public static int minimumValueInArray(int[] arr){
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String arg[]){
        System.out.println(minimumValueInArray(new int[]{3,6,2,8,1,9}));
    }
}
