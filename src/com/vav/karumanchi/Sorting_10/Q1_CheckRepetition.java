package com.vav.karumanchi.Sorting_10;

/**
 * Created by vaibhav on 12/12/17.
 */
public class Q1_CheckRepetition {
    public static void main(String arg[]){
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 7;
        arr[7] = 7;
        arr[8] = 8;
        arr[9] = 9;
        System.out.println(checkRepetition(arr));

    }

    /**
     * The brute force solution is using two loops and check for every item if there is a repeating item in rest of the array
     * N^2 complexity.
     * @param arr
     * @return
     */
    private static boolean checkRepetition(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
