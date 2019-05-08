package com.vav.CoursesBooks.Leetcode.Easy;

import java.util.Arrays;

/**
 * Created by vaibhav on 2/5/18.
 */
public class RemoveElement_027 {
    public static void main(String arg[]){
        int[] arr = {3,2,2,3,3,4,4,5};
        int[] arr2 = removeElement(arr,3);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
        public static int[] removeElement(int[] nums, int val) {
            int last = nums.length-1;
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    nums[i]=nums[last];
                    last--;
                }
            }
            return nums;
        }

}
