package com.vav.Reference.Leetcode.JetSetRun.Easy;

public class ClimbingStairs_70 {
    public static void main(String arg[]){
        System.out.print(climbStairs(4));
    }
    public static int climbStairs(int n) {
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }else return climbStairs(n-2) + climbStairs(n-1);
    }
}
