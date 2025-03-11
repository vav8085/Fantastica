package com.vav.Archive.CTCI.Archive.work_2017.Chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vaibhav on 4/25/17.
 */
public class Q6_StringCompression {
    public static void main(String arg[]){
        System.out.println(stringCompression("aabbabddefffff"));
    }
    //USING HASHMAPS
    public static String stringCompression(String s){
        char[] sChar = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(char c: sChar){
            charMap.put(c,charMap.get(c)!=null?charMap.get(c)+1:1);
        }
        String s1= new String();
        for(Character c:charMap.keySet()){
            s1=s1+c+charMap.get(c);
        }
        return s1;
    }
    //USING SORTING
    public static String stringCompressionSorting(String s){

        return s;
    }
}
