package com.vav.Reference.Leetcode.arrays.green;

import java.util.ArrayList;
import java.util.List;

/**
 * Think of this problem as a place full of hills and plains. 0 is plain and then comes hills of various heights
 * The maximum water that can fill between two hills can maximum be of the height of the lowest hill.
 *
 * In the solution we calculate every unit of the water above a single value
 * So we go over the values and see how much unit of water can accumulate over each one of them
 * e.g. 1,0,2 has two hills of height 1 and 2 and water can accumulate between then of maximum height 1 which is min(1,2) - 0
 * if the example was 3,0,2,3
 * water accumulated over 3 = min(0,3) - 3 = negative ie no water
 * water accumulated over 0 = min(3,3) - 0 = 3 units
 * over 2 = min(3,3) - 2 = 1 unit
 *
 * Notice that we always consider the highest hills on left and right. no matter how many valleys are in between.
 *
 * Solution is just based on this idea. For each height/value just find out left highest hill and right highest hill
 * accumulated water is calculated by min(left_max,right_max) - height(i) where i is the current height/value.
 */
public class TrappingRainWater_42 {
    public static void main(String arg[]){
        int value = totalWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
            System.out.print(value);
    }
    public static int totalWater(int[] input){
        int output = 0;
        for(int i=0;i<input.length;i++){
            int left_max = 0;
            int right_max = 0;
            for(int j=i-1;j>0;j--){
                left_max = Integer.max(input[j],left_max);
            }
            for(int k=i+1;k<input.length-1;k++){
                right_max = Integer.max(input[k],right_max);
            }
            if(Integer.min(left_max,right_max)-input[i]>0){
                output = output + Integer.min(left_max,right_max)-input[i];
            }
        }
        return output;
    }
    public static int totalWaterDP(int[] input){
        int output = 0;
        int[] leftMax = new int[input.length];
        int[] rightMax = new int[input.length];

        for(int i=1;i<input.length;i++){
            leftMax[i] = Integer.max(input[i], leftMax[i-1]);
        }
        return output;
    }
}
