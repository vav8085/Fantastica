package com.vav.karumanchi.Hashmaps;

import java.util.Arrays;

/**
 * Created by Vaibhav on 4/14/17.
 */
public class ChackArraysSameSetOfNumbersSorting_06 {
    public static void main(String arg[]){
        int[] arr1 = {1,2,3,4,5,5};
        int[] arr2 = {5,4,2,3,1};
        System.out.println(checkArraysSameSetOfNumbersSorting(arr1,arr2));
    }

    private static boolean checkArraysSameSetOfNumbersSorting(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return false;
    }

}
