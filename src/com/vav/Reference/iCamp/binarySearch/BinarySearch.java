package com.vav.Reference.iCamp.binarySearch;

public class BinarySearch {

    public static void main(String arg[]){
        int[] arr = {1,2,3,5,6,7,8,9,10,11};
        int[] dupArr ={1,2,3,4,4,5,6,7,8};
        int results = binarySearch(5, arr);
        System.out.println(results);

        int dupIndex = findFirstDuplicateItem(4,dupArr);
        System.out.println(dupIndex);
    }

    public static int binarySearch(int value, int[] inputArray){
        int start = 0;
        int end = inputArray.length-1;
        while(start<=end){
            int mid = start+((end-start)>>2);
            if(value == inputArray[mid]){
                return inputArray[mid];
            }else if(value<inputArray[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    //1233456
    public static int findFirstDuplicateItem(int value, int[] inputArray){
        int start=0;
        int end = inputArray.length-1;
        while (start<=end){
            int mid = start+((end-start)>>2);
            if(inputArray[mid]>value || (inputArray[mid-1]==value && mid>0 && inputArray[mid]==value)){
                end = mid-1;
            }else if(inputArray[mid]<value){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int findClosestElement(int value, int[] inputArray){
        int start =0;
        int result = Integer.MAX_VALUE;
        int end = inputArray.length-1;
        while(start<=end){
            int mid = start+((end-start)>>2);
            result = findClosestValue(inputArray,value,mid,result);
            if(value == inputArray[mid]){
                return inputArray[mid];
            }else if(value<inputArray[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return result;
    }

    private static int findClosestValue(int[] inputArray, int value, int mid, int result) {
        if(Math.abs(inputArray[result]-value)>Math.abs(inputArray[mid]-value)){
            return mid;
        }else{
            return result;
        }
    }
}
