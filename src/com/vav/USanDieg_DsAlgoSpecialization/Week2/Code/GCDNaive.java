package com.vav.USanDieg_DsAlgoSpecialization.Week2.Code;

/**
 * Created by vaibhav on 1/8/18.
 */
public class GCDNaive {
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
