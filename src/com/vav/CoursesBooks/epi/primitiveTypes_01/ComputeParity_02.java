package com.vav.CoursesBooks.epi.primitiveTypes_01;

public class ComputeParity_02 {
    public static void main(String arg[]){
        System.out.print(computeParityXor(3));
    }

    /**
     * The parity of a word is 1 if the number if 1s in the word are odd. Otherwise its 0
     *
     * Now when we do an XOR of two bits its same as adding them and do a modulo of 2
     *   0001
     *   0011
     *   0012 taking mod of 2 on each bit will give us 0010 which is same as xor
     *   This can help us calculate the modulo 2 of a number
     * @param n
     * @return
     */
    public static long computeParity(long n){
        long sum = 0;

        while(n!=0){
            sum = sum + (n & 1);
            n = n >>> 1;
        }
        return sum % 2;
    }

    public static long computeParityXor(long n){
        long result = 0;  //We will start with the value of the result as 0

        while(n!=0){
            result = result ^ (n & 1); //First we do an and for n and 1,
                                        // this way we have only last bit set if its there
                                        //then we do an xor with the result, this way the result will be set only if there are odd number of bits in n
            result = result >>>1;       //Finally we shift the bits of result one right
        }
        return result;
    }
}
