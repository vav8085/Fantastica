package com.vav.Reference.epi.primitiveTypes_01;

public class CountBits_01 {

    public static void main(String[] arg){
        System.out.println(countBits(7));
    }

    /**
     * To count bits in any number that are set to 1
     *
     * To achieve this we have to do two things
     * 1. do an & operation with 1 of this number, this will return 1 only when there is a 1 as first digit
     * 2. If 1 is found then increase the count
     * 3. Now move all the bits in the number 1 bit right and again check
     * @param number
     * @return
     */
    public static int countBits(int number) {
        int count = 0;

        while(number!=0){
            count = count + (number&1); //number & 1 will return 1 only when last digit of number is 1
            number = number>>>1; //shift the bits of nunber right by 1
        }
        return count;
    }
}
