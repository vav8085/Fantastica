package com.vav.karumanchi.Queues_05;

/**
 * Created by vaibhav on 12/25/17.
 */
public class Q4_MaximumSumSlidingWindow {

    // we can solve this using two loops
    // in outer loop we can go from 0 to n-w+1
    //n=4, w=2, 0->3 so windown will move 3 times from 0->1->2->3
    //if w was 3 it will move 2 times 0->1->2
    public static void main(String arg[]){
        int[] arr = new int[]{10,4,5,-1,7,-2,9};
        printLargestSum(arr);
    }

    private static void printLargestSum(int[] arr) {
        int windowLength = 3;
        int max=0;
        for(int i=0;i<arr.length-windowLength+1;i++){
            int sum=0;
            for(int j=i;j<i+windowLength;j++){
                sum = sum+arr[j];
            }
            max = max>sum?max:sum;
        }
        System.out.print(max);
    }
}
