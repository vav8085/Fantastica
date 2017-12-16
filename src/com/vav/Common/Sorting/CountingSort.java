package com.vav.Common.Sorting;

/**
 * Created by vaibhav on 12/15/17.
 */
public class CountingSort {

    public static void main(String arg[]){

    }
    public static int[] countingSort(int[] inputArr){

        int[] outputArr = new int[inputArr.length];

        int[] countingArr = new int[10]; //The size of countingArr should be the maximum value in inputArr but lets take it 10 for now

        for(int i=0;i<countingArr.length;i++){
            countingArr[i]=0;
        }
        for(int j=0;j<inputArr.length;j++){
            ++countingArr[inputArr[j]]; //increasing the value for index of element corresponding to inputarray by one
        }
        for(int k=1;k<inputArr.length;k++){
            countingArr[k] = countingArr[k] + countingArr[k-1]; //adding values to the previous and saving it
        }
        for(int l=0;l<outputArr.length;l++){
            outputArr[countingArr[inputArr[l]]-1] = inputArr[l];
            --countingArr[inputArr[l]];
        }
        return outputArr;
    }
}
