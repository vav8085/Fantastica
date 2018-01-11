package com.vav.USanDieg_DsAlgoSpecialization.Week3.Code;

import com.vav.Common.Sorting.BubbleSort;

/**
 * Created by Vaibhav on 1/11/18.
 */
public class LargestNumber {

    public static void main(String arg[]){
        int[] arr = {2,3,5,6,7,9,7};
        //because bubble sort is not D&C this is a Greedy Naive Approach will use n^2 complexity.
        int[] arr2 = BubbleSort.bubbleSort(arr);
        for(int i=arr2.length-1;i>-1;i--) {
            System.out.print(arr2[i]);
        }
    }

}
