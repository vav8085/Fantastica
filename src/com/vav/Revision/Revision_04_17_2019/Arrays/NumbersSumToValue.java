package com.vav.Revision.Revision_04_17_2019.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class NumbersSumToValue {
    /**
     * We need to find the numbers that sum to a value
     * We can sort the input and then go from both ends
     *
     * If the sum is more than the value we reduce right pointer
     *
     * If the sum is less than the value we increase the front pointer
     *
     * @param input
     */
    public static int[] numbersSumToValue(int value, int[] input){
        Arrays.sort(input);
        for(int i=0, j=input.length-1;i<j;){
            int sum = input[i] + input[j];
            if(sum < value){
                i++;
            }else if(sum > value){
                j--;
            }else{
                return new int[]{input[i], input[j]};
            }
        }
        return input;
    }
    public static int[] numbersSumToValueMaps(int value, int[] input){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            map.put(input[i],0);
        }
        for(int j=0;j<input.length;j++){
            if(map.containsKey(value-input[j])){
                return new int[] {input[j], value-input[j]};
            }
        }
        return input;
    }
    public static void main(String arg[]){
        int input[] = {1,3,9,11,2,4,8};
        int value = 11;
        int[] output = numbersSumToValueMaps(value, input);

        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}
