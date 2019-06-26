package com.vav.Reference.iCamp.recursion;

public class PrintCombinations_02 {
    public static void main(String arg[]){
        printCombinationsOfThree(new int[]{1,2,3,4,5,6},new int[3],0,0);
    }
    public static void printCombinationsOfThree(int[] input, int[] buffer, int inputIndex, int bufferIndex){
        if(bufferIndex == buffer.length){
            printIt(buffer);
            return;
        }
        if(inputIndex == input.length){
            return;
        }
        for(int i=inputIndex;i<input.length;i++){
            buffer[bufferIndex] = input[i];
            printCombinationsOfThree(input,buffer,inputIndex+1,bufferIndex+1);
        }
    }

    private static void printIt(int[] buffer) {
        for(int j=0;j<buffer.length;j++){
            System.out.println(buffer[j]);
        }
    }
}
