package com.vav.CTCI.Archive.work_2017.Chapter1;

import java.util.Arrays;

/**
 * Created by Vaibhav on 4/25/17.
 * This question is same as String permutations Q2
 */
public class QX_StringAnagrams {
    public static void main(String arg[]){
        System.out.println(checkAnagrams("carrr","car"));
    }
    //USING SORTING
    public static boolean checkAnagrams(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }else {
            char[] s1Chars = s1.toCharArray();
            char[] s2Chars = s2.toCharArray();
            Arrays.sort(s1Chars);
            Arrays.sort(s2Chars);
            for(int i=0;i<s1Chars.length;i++){
                if(s1Chars[i]!=s2Chars[i]){
                    return false;
                }
            }
            return true;
        }

    }
}
