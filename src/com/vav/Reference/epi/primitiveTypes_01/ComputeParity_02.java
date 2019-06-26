package com.vav.Reference.epi.primitiveTypes_01;

public class ComputeParity_02 {
    public static void main(String arg[]){
        System.out.print(computeParitySubtraction(4));
    }

    /**
     * The parity of a word is 1 if the number if 1s in the word are odd. Otherwise its 0
     *
     * Now when we do an XOR of two bits its same as adding them and do a modulo of 2
     *   0001
     *   0011
     *   0012 taking mod of 2 on each bit will give us 0010 which is same as xor
     *   This can help us calculate the modulo 2 of a number
     *
     *   Complexity O(number of bits in n)
     * @param n
     * @return
     */
    public static long computeParity(long n){
        long sum = 0;

        while(n!=0){
            sum = sum + (n & 1); //First we take an AND of n and 1. so suppose n is 1101 & 0001 = 0001 this makes all bits 0 than last one
                                 //We then add this with sum value which increases by 1 if last bit was one otherwise adds 0 and remains the same
            n = n >>> 1;         //We then move the bits one right so we can work on next bit
        }
        return sum % 2;
    }

    /**
     *
     * @param n
     * @return
     */
    public static long computeParityXor(long n){
        long result = 0;  //We will start with the value of the result as 0

        while(n!=0){
            result = result ^ (n & 1); //First we do an and for n and 1,
                                        // this way we have only last bit set if its there
                                        //then we do an xor with the result, this way the result will be set only if there are odd number of bits in n
            result = result >>>1;       //Finally we shift the bits of result one right
        }
                                        //We don't need to mod sum by 2 because XOR takes care of this
        return result;
    }

    public static long computeParitySubtraction(long n){
        short result = 0;
        while(n!=0){
            result ^= 1;               //result ^ 1 will start will 0000 ^ 0001 = 0001, step 2 -> 0001 ^ 0001 = 0000, step 3 -> 0000 ^ 0001 = 0001
            n&=(n-1);                  //will start with 1101 = 1101 & 1100 = 1100, step 2 -> 1100 & 1010 = 1000, step 3 -> 1000 & 0110 = 0000
        }                              //This erases the lowest set bit in the input. notice that we only need to count set bits here so this works
        return result;
    }
}
