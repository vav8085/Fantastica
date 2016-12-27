package com.vav.Leetcode;

import java.util.HashMap;

/**
 * Created by z179905 on 12/27/16.
 */
public class TwoSum_01 {
    public static void twoSumBf(int nums[],int target){
                for(int i=0;i<nums.length;i++){
                    for(int j=i+1;j<nums.length;j++){
                        if(target==(nums[j]+nums[i])){
                            System.out.print(i+","+j);

                        }
                    }
                }
    }
    public static void twoSumHashMaps2N(int nums[],int target){
        HashMap twoSumMap = new HashMap(nums.length);
        for(int i=0;i<nums.length;i++){
            twoSumMap.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int number = target-nums[j];
            if(twoSumMap.containsKey(number)){
                System.out.print(j+","+twoSumMap.get(number));
                return;
            }
        }
    }
    public static void twoSumHashMapsN(int nums[],int target){
        for(int i=0;i<nums.length;i++){

        }
    }

}
