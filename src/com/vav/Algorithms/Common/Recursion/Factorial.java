package com.vav.Algorithms.Common.Recursion;

/**
 * Created by Vaibhav on 1/15/18.
 */
public class Factorial {
    public static void main(String arg[]){
        System.out.println(printFact(5));;
    }
    public static int printFact(int number){
        if(number==1){
            return 1;
        }
        return printFact(number-1) * number;
    }
}
