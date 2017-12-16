package com.vav.Common.Sorting;

/**
 * Created by vaibhav on 12/15/17.
 */
public class CountingSort {

    public static void main(String arg[]){
        int arr[] = new int[]{ 1, 3, 1, 7, 5, 5, 9, 7 };
        int brr[] = countingSort(arr);
        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i]);
        }
    }
    public static int[] countingSort(int[] inputArr){
        // { 1, 3, 1, 7, 5, 5, 9, 7 }
        int[] outputArr = new int[inputArr.length];

        int[] countingArr = new int[10]; //The size of countingArr should be the maximum value in inputArr but lets take it 10 for now

        for(int i=0;i<countingArr.length;i++){
            countingArr[i]=0;
        }
        for(int j=0;j<inputArr.length;j++){
            ++countingArr[inputArr[j]]; //increasing the value for index of element corresponding to inputarray by one
        }
        for(int k=1;k<countingArr.length;k++){
            countingArr[k] = countingArr[k] + countingArr[k-1]; //adding values to the previous and saving it
        }
        for(int l=0;l<outputArr.length;l++){
            // in case of l=0, inputArr[0] = 1, countArr[1] = 2, outputArr[1] = 1
            // in case of l=1, inputArr[1] = 3, countArr[3] = 3-1 = 2, outputArr[2] = 3
            // in case of l=3, inputArr[3] = 1, countArr[1] = 1-1 = 0, outputArr[0] = 1
            // in case of l=4, inputArr[4] = 7, countArr[7] = 6-1 = 5, outputArr[5] = 7
            outputArr[countingArr[inputArr[l]]-1] = inputArr[l];
            --countingArr[inputArr[l]];
        }
        return outputArr;
    }
}
