package com.vav.Reference.educative.DSInJavaInterviewRefresher.Arrays;

public class Challenge_09_RearrangePositiveNegative {
    public static int[] rearrangePositiveNegative(int[] input){

        int[] output = new int[input.length];
        int p = 0;
        int i=0;
        for(;i<input.length;i++){
            if(input[i]<0){
                output[p++] = input[i];
            }
        }
        for(int j=0;j<input.length;j++){
            if(input[j]>0){
                output[p++] = input[j];
            }
        }
        return output;
    }
    public static int[] rearrangePositiveNegativeInPlace(int[] input){
        int i=0,j=0;
        for(;i<input.length;i++){
            if(input[i]<0){
                swapij(input,i,j);
                j++;
            }
        }

        return input;
    }

    private static void swapij(int[] input, int i, int j) {
        input[i] = input[i] ^ input[j];
        input[j] = input[i] ^ input[j];
        input[i] = input[i] ^ input[j];
    }

    public static void main(String arg[]){
        int arr[] = {1,-2,3,-4,8,-9,7,-3,-6};
        int[] output = rearrangePositiveNegativeInPlace(arr);
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}
