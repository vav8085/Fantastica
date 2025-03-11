package com.vav.Archive.iCamp.A_Basics;

public class MoveZeroesToEnd_04 {

    public static void main(String arg[]){
        int arr[] =         {1,0,2,5,0,0,6,9,0,10};
        //Output should me  {1,2,5,6,9,10,0,0,0,0}
        int output[] = moveZeroesToEnd(arr);
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }

    /**
     * To solve this problem we have to again go from last and find a number that is 0. If we find it we will replace the last number with it
     * and then reduce the last pointer by 1
     * @param input
     * @return
     */
    public static int[] moveZeroesToEnd(int input[]){
        int lastValue = input.length-1;
        for(int i=input.length-1;i>=0;i--){
            if(input[i]==0){
                input[i] = input[i] ^ input[lastValue];
                input[lastValue] = input[i] ^ input[lastValue];
                input[i] = input[i] ^ input[lastValue];
                lastValue--;
            }
        }
        return input;
    }
}
