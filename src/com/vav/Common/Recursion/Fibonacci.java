package com.vav.Common.Recursion;

/**
 * Created by Vaibhav on 1/15/18.
 */
public class Fibonacci {
    public static void main(String arg[]){
        System.out.println(printFibonacci(7));
    }
    public static final int printFibonacci(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return printFibonacci(num-1) + printFibonacci(num-2);
    }
}
