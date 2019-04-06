package com.vav.CoursesBooks.iCamp.ArraysAndStrings_01;

public class DutchNationalFlag {
    /**
     * the problem statement is to partition an array around a value so that all the values less than that
     * should be on the left and all the values greater than that go to the right
     *
     * To handle this condition we divide our array into 3 parts
     * 1. end which contains all the elements greater than the input value
     * 2. start which contains all the elements smaller than the input value
     * 3. mid that contain all the elements equal to the input value.
     * {8,9,3,1,3,2,4,3}
     * {}
     * @param input
     * @return
     */
    public static int[] dutchNationalFlag(int value, int[] input){
        for(int s=0,m=0,e=input.length-1;m<=e;){
            if(input[m] < value){
                swap(input,m,s);
                s++;
                m++;
            }else if(input[m] > value){
                swap(input,m,e);
                e--;
            }else{
                m++;
            }
        }
        return input;
    }
    public static void swap(int[] input, int a, int b){
        input[a] = input[a] ^ input[b];
        input[b] = input[a] ^ input[b];
        input[a] = input[a] ^ input[b];
    }
    public static void main(String arg[]){
        int[] input = {8,9,3,1,3,2,4,3};
        int[] output = dutchNationalFlag(3, input);

        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }

    }
}
