package com.vav.Archive.educative.DSInJavaInterviewRefresher.Arrays;

public class Challenge_01 {
    public static void main(String arg[]){
        int[] arr = {1,2,3,4,5,7,9};
        int[] brr = removeEven(arr);
        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i]);
        }
    }
    //First count the number of odd integers
    //Create a new array of size of number of odd integers and create a pointer to iterate over it
    //Copy the even integers to new array
    //return new array
    public static int[] removeEven(int[] input) {
        // Write - Your - Code- Here
        int oddCount = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0){
                oddCount++;
            }
        }
        int[] output = new int[oddCount];
        int outputIndex=0;
        for(int j=0;j<input.length;j++){
            if(input[j]%2!=0){
                output[outputIndex++] = input[j];
            }
        }

        return output; // change this and return the correct result array
    }
}
