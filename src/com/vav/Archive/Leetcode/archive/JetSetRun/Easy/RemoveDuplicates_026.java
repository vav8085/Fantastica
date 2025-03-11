package com.vav.Archive.Leetcode.archive.JetSetRun.Easy;

/**
 * Created by vaibhav on 2/5/18.
 */
public class RemoveDuplicates_026 {

    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
