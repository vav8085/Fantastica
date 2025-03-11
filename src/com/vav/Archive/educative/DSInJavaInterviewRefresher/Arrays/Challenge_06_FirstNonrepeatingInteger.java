package com.vav.Archive.educative.DSInJavaInterviewRefresher.Arrays;

import com.vav.Design.ReactiveProgramming.Code.IteratorPattern.Iterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Challenge_06_FirstNonrepeatingInteger {
    public static int firstNonRepeatingInteger(int[] input){
        int output = Integer.MIN_VALUE;
        HashMap<Integer, Integer> integers = new HashMap<>();
        for(int i=0;i<input.length;i++){
            integers.put(input[i],integers.get(input[i])==null?1:integers.get(input[i])+1);
        }
        Set<Integer> keyset = integers.keySet();
        for(Integer key: keyset){
            if(integers.get(key)==1){
                output = key;
                break;
            }
        }
        return output;
    }

    public static void main(String arg[]){
        int[] arr = {2,4,7,1,2,4,1,5};
        System.out.println(firstNonRepeatingInteger(arr));
    }
}
