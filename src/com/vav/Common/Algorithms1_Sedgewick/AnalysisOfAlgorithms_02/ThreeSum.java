package com.vav.Common.Algorithms1_Sedgewick.AnalysisOfAlgorithms_02;

import edu.princeton.cs.introcs.Stopwatch;

/**
 * Created by vaibhav on 8/8/17.
 * * An algorithm to find the 3 numbers in a list whos sum adds up to a certain number ( 0 in this solution)
 * This is the brute force approach with O(n3) complexity
 * In this example we only print how many combinations can add up to 0
 */
public class ThreeSum {
    public static int findThreeSum(int[] numbers){
        int count =0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                for(int k=j+1;k<numbers.length;k++){
                    if((numbers[i]+numbers[j]+numbers[k])==0){
                        count++; //Increase the count every time we find a combination that adds up to 0
                    }
                }
            }
        }
        return count;
    }
    public static void main(String arg[]){
        int[] nums = {-10,-20,30,-40,70,-30};
        Stopwatch stopwatch = new Stopwatch();
        System.out.println(findThreeSum(nums));
        System.out.println(stopwatch.elapsedTime());

    }
}
