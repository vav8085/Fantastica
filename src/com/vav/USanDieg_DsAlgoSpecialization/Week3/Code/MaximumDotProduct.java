package com.vav.USanDieg_DsAlgoSpecialization.Week3.Code;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by Vaibhav on 1/12/18.
 */
public class MaximumDotProduct {
    public static void main(String arg[]){
        long[] adsProfit = {1,3,-5};
        long[] clicksPerDay = {-2,4,1};
        int number = 3;
        System.out.println(maxDotProduct(adsProfit,clicksPerDay));
    }
    private static long maxDotProduct(long[] a, long[] b) {
        //write your code here
        Arrays.sort(a);
        Arrays.sort(b);
        long result = 0;
        for (int i = 0; i < a.length; i++) {
                result += a[i] * b[i];
        }
        return result;
    }
}
