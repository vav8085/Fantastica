package com.vav.Reference.Leetcode.warplan.Easy;

/**
 * Created by Vaibhav on 2/5/18.
 */
public class SearchInsertPosition_035 {
    public static void main(String arg[]){
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int index=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
            if(nums[i]>target)
                return i;
        }
        return index;
    }
}
