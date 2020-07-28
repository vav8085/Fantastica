package com.vav.Algorithms.Strategies.ProblemTypes.Arrays;

public class MedianOfSortedArrays_04 {
    public static void main(String arg[]){

    }

    /**
     * Now the question is
     * how to find median?
     * What is median?
     * Median is the center number that can divide a set into two equal parts.
     * So if our set is {1,2,3,4,5,6,7} which is odd, the median is 7 here
     * if our set is {1,2,3,4,5,6} then the median will be the average of center two numbers => (3+4)/2 = 3.5
     *
     * Now that's how we find median in math but what about computers?
     *
     * The concept remain the same but computer cant see 7 and 3,4. It has to find them out.
     * Which is the only work required in this problem.
     *
     * How to find them?
     * In case of a single array(0->n-1) we can just find its center element which will be at (n-1)/2th position if its odd
     * and the average of values at (n-1)/2 and (n+1)/2 locations in case of odd.
     * So if we take above example in case of even we can see
     * n= 6 = arr.length
     * (n-1)/2 = 2. element at 2 is 3
     * (n+1)/2 = 3. element at 3 is 4
     * (3+4)/2 = 3.5 is our solution and is the median.
     *
     * Now comes this problem statement where we need to find the median of two sorted arrays.
     *
     * Question comes
     * Can it be the average of median of each of them?
     * {1,3,5} {2,4,8}
     * {1,2,4} {3,11,12} median 2 and 11 = 11+2/2 = 6.5 it can be written as {1,2,3,4,11,12}  3+4/2 = 3.5
     *
     * So we can say that finding median using above way works in some cases but not in other cases.
     *
     * So the approach actually needs two arrays merged and remain sorted. then we can consider it as a single array and find its median
     *
     * 
     * @param arr
     * @param brr
     */
    public void medianOfTwoSortedArraysEqualSize(int[] arr, int[] brr){

    }

}
