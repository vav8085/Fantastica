package com.vav.Common.DivideAndConquer;

/**
 * Created by Vaibhav on 2/22/18.
 */
public class BinarySearch {

    public static void main(String arg[]) {
        int arr[] = {1,3,5,7,9};
        System.out.println(binarySearch(arr,0,arr.length-1,21));
    }

    /**
     * {1,3,5,7,9}
     * key = 4
     *
     * @param A
     * @param low
     * @param high
     * @param key
     * @return
     */
    public static boolean binarySearch(int[] A, int low, int high, int key) {
        if (low > high) {
            return false;
        }
        int mid = low+(high - low) / 2;
        if (A[mid] == key) {
            return true;
        }
        if (key > A[mid]) {
            return binarySearch(A, mid + 1, high, key);
        } else {
            return binarySearch(A, low, mid - 1, key);
        }

    }
}
