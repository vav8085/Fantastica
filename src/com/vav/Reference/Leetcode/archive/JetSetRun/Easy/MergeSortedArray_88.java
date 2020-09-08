package com.vav.Reference.Leetcode.archive.JetSetRun.Easy;

public class MergeSortedArray_88 {
    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
//        if(m == 0){
//            nums1[0] = nums2[0];
//        }
//        for(int i=0,j=0;i<nums1.length && j<nums2.length;){
//            if(nums1[i]>=nums2[j]){
//                for(int k=nums1.length-1;k>i;k--){
//                    nums1[k] = nums1[k-1];
//                }
//                nums1[i] = nums2[j];
//                j++;
//            }else if(i>0 && nums1[i-1]>nums1[i]){
//                for(int k=nums1.length-1;k>i;k--){
//                    nums1[k] = nums1[k-1];
//                }
//                nums1[i] = nums2[j];
//                j++;
//            }
//            else{
//                i++;
//            }
//        }
//
//
        return nums1;
    }
    public static void main(String arg[]){
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int[] arr3 = mergeSortedArray(arr1,arr1.length, arr2, arr2.length);

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
