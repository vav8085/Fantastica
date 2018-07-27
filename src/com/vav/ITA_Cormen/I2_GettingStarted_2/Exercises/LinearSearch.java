package com.vav.ITA_Cormen.I2_GettingStarted_2.Exercises;

public class LinearSearch {
    /**
     * Loop invariants for linearSearch
     * @param arr
     * @param value
     * @return
     */
    public static boolean lieanrSearch(int arr[], int value){
        for(int i=0;i<arr.length;i++){
            if(value==arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String arg[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(lieanrSearch(arr,6));
    }
}
