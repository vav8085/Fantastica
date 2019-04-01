package com.vav.CoursesBooks.iCamp.A_Basics;

import java.util.*;

public class FindDuplicates_01 {
    public static void main(String arg[]){
        int[] arr = new int[]{8,3,0,2,5,5};
        System.out.println(findDuplicatesSorting(arr));
    }

    /**
     * n^2 complexity
     * @param arr
     * @return
     */
    public static final boolean findDuplicatesBruteForce(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * n(logn) complexity
     * @param arr
     * @return
     */
    public static final boolean findDuplicatesSorting(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }

    /**
     * n complexity
     * @param arr
     * @return
     */
    public static final boolean findDuplicatesHashing(int[] arr){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return false;
            }else{
                map.put(arr[i],true);
            }
        }
        return false;
    }
}
