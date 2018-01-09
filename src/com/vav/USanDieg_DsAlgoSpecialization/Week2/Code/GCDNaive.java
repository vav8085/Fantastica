package com.vav.USanDieg_DsAlgoSpecialization.Week2.Code;

/**
 * Created by vaibhav on 1/8/18.
 */

public class GCDNaive {
    public static void main(String arg[]){
        System.out.println(gcd_naive(2222, 1111));
    }

    /**
     * The algorithm takes two numbers from input and then start a for loop starting from 2 to d<=a && d<=b
     * we calculate the biggest value of d that can divide both a and b without leaving a remainder.
     *
     * The algorithm wastes a lot of iterations for larger values of a and b
     * @param a
     * @param b
     * @return
     */
    private static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        for(int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }
}
