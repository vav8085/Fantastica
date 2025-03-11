package com.vav.Archive.educative.DSInJavaInterviewRefresher.Arrays;

public class Challenge_08_RightRotate {
    public static int[] rightRotate(int[] input){
        int lastElement = input[input.length-1];
        for(int i=input.length-1;i>0;i--){
            input[i] = input[i-1];
        }
        input[0] = lastElement;
        return input;
    }
    public static void main(String arg[]){
        int[] input = {1,2,3,4,5};
        int[] output = rightRotate(input);

        for(int i=0;i<input.length;i++){
            System.out.println(output[i]);
        }
    }
}
