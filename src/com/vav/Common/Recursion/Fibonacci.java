package com.vav.Common.Recursion;

/**
 * Created by Vaibhav on 1/15/18.
 */
public class Fibonacci {
    public static void main(String arg[]){
        System.out.println(printFibonacci(3));
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

    public static final int printFibonacciAccumulator(int num){
        if(num <= 2){
            return 1;
        }else{
            int aux = 1;
            for(int i=1;i<num-1;i++){
                aux =  aux + printFibonacciAccumulator(i);
            }
            return aux;
        }
    }

}
