package com.vav.Archive.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week1;

/**
 * Created by Vaibhav on 2/19/18.
 */
public class MaxPairwiseProduct {

    public static void main(String[] arg){
        System.out.println(getMaxPairwiseProduct(new int[]{7, 5 ,14 ,2, 8 ,8 ,10 ,1 ,2, 3}));
    }

    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        int index = 0;
        long biggest = numbers[index];
        if(numbers.length<2){
            return biggest;
        }
        for (int i = 1; i < n; ++i) {
            if(numbers[index]<numbers[i]){
                biggest = numbers[i];
                index = i;
            }
        }
        long biggest2 = index==0?numbers[1]:numbers[0];
        int index2 = index==0?1:0;
        for (int j = index==0?2:1; j < n; ++j) {
            if(numbers[index2]<numbers[j]){
                if(j==index){
                    continue;
                }
                biggest2 = numbers[j];
                index2 = j;
            }
        }
        return biggest2 * biggest;
    }
}
