package com.vav.karumanchi.Sorting.Problems;

/**
 * Created by Vaibhav on 3/28/17.
 */
public class CheckRepititiveNumbersP1P2 {
    public static void main(String arg[]){
        printDuplicatesBF(new int[]{1,1,1,2,2,34,5,6,7,7});
    }
    public static void printDuplicatesBF(int[] arr){
        int number,count;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
    }
}
