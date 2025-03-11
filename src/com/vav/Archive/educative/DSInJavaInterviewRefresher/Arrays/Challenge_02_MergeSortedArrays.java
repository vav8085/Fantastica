package com.vav.Archive.educative.DSInJavaInterviewRefresher.Arrays;

public class Challenge_02_MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr, int[] brr){
        int[] result = new int[arr.length + brr.length];
        int i=0,j=0,k=0;
        for(;i<arr.length&&j<brr.length;){
            if(arr[i]<brr[j]){
                result[k]=arr[i];
                i++;
            }else{
                result[k]=brr[j];
                j++;
            }
            k++;
        }
        while(i<=arr.length-1){
            result[k] = arr[i];
            i++;
            k++;
        }
        while(j<=brr.length-1){
            result[k] = brr[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String arg[]){
        int[] arr = {1,3,5,7,9};
        int[] brr = {2,4,6};
        int[] result = mergeSortedArrays(arr,brr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
