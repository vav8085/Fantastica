package com.vav.Revision.Revision_04_17_2019.Arrays;

public class MoveZeroesToEnd {
    /**
     * Move from the end of the array and replace the last item when you see a zero
     * @param input
     * @return
     */
    public static int[] moveZeroesToEnd(int[] input){
        for(int i=input.length-1,j=input.length-1;i>=0;i--){
            if(input[i]==0){
                swap(i,j,input);
                j--;
            }
        }
        return input;
    }

    private static void swap(int i, int j, int[] arr) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String arg[]){
        int[] input = {1,4,0,6,7,2,0,0,3,5};
        int[] output = moveZeroesToEnd(input);
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}
