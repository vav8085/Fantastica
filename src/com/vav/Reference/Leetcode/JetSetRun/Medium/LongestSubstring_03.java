package com.vav.Reference.Leetcode.JetSetRun.Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstring_03 {
    public static void main(String arg[]){
        System.out.println(longestSubstring("abcdbcab"));
    }

    /**
     * So we can iterate over the string characters and store them in a hashmap
     * as soon as we find a repeating character we move left pointer by one
     * @param input
     * @return
     */
    public static int longestSubstring(String input){ //abcbcbb -> 3, bbbb -> 1
        ArrayList<Character> finalList = new ArrayList<>();
        ArrayList<Character> tempList = new ArrayList<>();
        for(int i=0,j=0;j<input.length();j++){
            if(!tempList.contains(input.charAt(j))) {
                tempList.add(input.charAt(j));
                finalList = (ArrayList<Character>) tempList.clone();
            }
            else {
                while (tempList.get(i)!=input.charAt(j)){
                    tempList.remove(i);
                }
                tempList.remove(i);
                tempList.add(input.charAt(j));
            }
        }
        return finalList.size();
    }
}
