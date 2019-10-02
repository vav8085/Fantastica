package com.vav.Algorithms.Campaign.Basics.Iteration;

/**
 * For Loop:
 *     arr = {2,4,1,5,3,2}
 * for(int i=0;i<arr.length;i++){
 *
 * }
 *
 * Notice few things here:
 * 1.  The length of the array always remains the same. Above array has 6 elements and they remain 6 throughout the loop.
 *
 * 2.  i start from either 0 or 1 and we go till length.
 *
 * 3.  When i start from 0 the start element is 0 and the end element becomes arr.length-1. i.e If you define arr.length in terms of i
 *     it becomes 0->5 instead of 0->6 which can be represented as n-1.
 *     *   To loop including the last element go from 0 -> length-1 that is i<arr.length or i<=arr.length-1
 *     *   To loop excluding the last element go from 0 -> length-2 that is i<arr.length-1 or i<=arr.length-2
 *
 * 4.  When i start from 1 the start element is 1 and the end element remains arr.length. But if you define arr.length in terms of i
 *     it remains 6 which is returned by arr.length.
 *
 * 5.  In a for loop the increment step is always executed except when break or return
 *
 * 6.  Declaring a variable inside the for loop and outside it can have effect on the final value.
 *
 * 7.  When executing a loop in reverse the last value will be 0 so you run from i=array.length-1 --> i>=0 to run all the
 *     length. The value after iteration is -1
 */
public class Iteration {
    public static void main(String arg[]){
        int arr[] = {2,4,1,5,3,2};
        int i=0;
        for(;i<arr.length;i++){
            if(i==1){
                break;
            }
            System.out.println(i);
        }
        /**
         * Always check the value of the variable i at the end of the loop. If you are incrementing to n  i<array.length(n) then the final value of
         *     i will be n and not n-1 in a for loop. because it gets incremented by 1 during final iteration
         */
        System.out.println("final value "+i);
    }

    public static int findMid(int[] arr){
        /**
         * To find the mid of the array you first need to find whether its even or odd numbered
         * For odd numbered array you always do (arr.length-1)/2 to find the mid value. you can iterate from 0 -> mid and mid+1 -> array.length-1
         * *    For 5 it will be 2 so you can go 0-1-2 and 3-4
         * *    For 3 it will be 0-1 and 2
         * *    For 1 it will be
         */
    }
}
