package com.vav.Archive.Leetcode.easy;

import java.util.HashMap;
import java.util.List;

public class ClimbingStairs_070 {
    public static void main(String arg[]){

    }
    public static int climbingStairs(int size){
        return climbStairs(size, new HashMap<>());
    }
    private static int climbStairs(int size, HashMap<Integer, Integer> memory){
        if(size ==2){
            return 2;
        }
        if(size ==1){
            return 1;
        }
        if(memory.get(size)!=null){
            return memory.get(size);
        }
        int output = climbStairs(size-1,memory) + climbStairs(size-2,memory);
        memory.put(size, output);
        return output;
    }
}
