package com.vav.CoursesBooks.epi.primitiveTypes_01;

public class SwapBits_03 {
    public static void main(String arg[]){
        System.out.print(swapBits(35,1,5));
    }

    /**
     * The method will simply swap i and jth values
     * To achieve this it will first identify if the bits to swap are different, if yes then swap them
     * To swap the bits you have to create a mask for these bits.
     * To create a mask simply move 0001 to right until its at proper place. Do it once for I and once for j
     * Once this complete we have a mask for i and j, simply or them
     *
     * Now to get the final output, XOR this with the input
     * @param input
     * @param i
     * @param j
     * @return
     */
    public static int swapBits(int input, int i, int j){
        if((((input >> i) & 1) ^ ((input >> j) & 1)) !=0){
            int maski = 1 << i;
            int maskj = 1 << j;
            int maskFinal = maski | maskj;
            return input ^ maskFinal;
        }
        return 999; //failed
    }
}
