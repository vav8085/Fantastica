package com.vav.Archive.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week2.Code;

/**
 * Created by Vaibhav on 1/9/18.
 */
public class GCDOptimised {
    public static void main(String arg[]){
        System.out.println(calculateGCD(40,30));
    }
    /**
     * This is more optimised method where we use a logic that GCD(A, B) is same as GCD(A%B, B)
     * We can use a recursive function and give it remainder of A and B every time until it reaches 0
     * @param a
     * @param b
     * @return
     */
    public static int calculateGCD(int a, int b){
        if(b==0){
            return a;
        }
        int remainder = a%b;
        return calculateGCD(b,remainder);
    }
}
