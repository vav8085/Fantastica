package com.vav.Algorithms.Common.Recursion;

public class SumOfNNaturalNumbers {
    /**
     * This is a more generic algorithm. It returns the sum of all the natural numbers from a specific value
     * We can find 1-> n , 2-> n etc by passing different values of from
     * @param n
     * @param from
     * @return
     */
    public static int sumOfNNaturalNumbersStart(int n, int from){
        if(from == n){
            return n;
        }
        return from + sumOfNNaturalNumbersStart(n, from+1);
    }

    /**
     * In this algorithm we are considering that sum(n) = sum(n-1) + n
     * @param n
     * @return
     */
    public static int sumOfNaturalNumbersEnd(int n){
        if(n==1){
            return 1;
        }else{
            return sumOfNaturalNumbersEnd(n-1) + n;
        }
    }
    public static int sumOfNaturalNumbersHalf(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 3;  //imagine a triangle with blocks for each number , 1 block for 1, 2 blocks for 2. For 2 numbers it will be:
                        // 0
                        //00
                        // = 3 blocks so we will return 3
                        // Also note that the sum of first 2 natural numbers 1 and 2 is 3
        }else if(n%2==1){
            //  0
            // 00 lets tke an example of n=3
            //000
                            //  0
                            //                                      00
                            //0 0                                   0
            return 3* sumOfNaturalNumbersHalf((n-1)/2) + sumOfNaturalNumbersHalf((n+1)/2);
        }else{
            return 3* sumOfNaturalNumbersHalf(n/2) + sumOfNaturalNumbersHalf(n/2 - 1);
        }
    }

    public static void main(String arg[]){
        System.out.println(sumOfNNaturalNumbersStart(5,1));
        System.out.println(sumOfNaturalNumbersEnd(5));
        System.out.println(sumOfNaturalNumbersHalf(5));
    }
}
