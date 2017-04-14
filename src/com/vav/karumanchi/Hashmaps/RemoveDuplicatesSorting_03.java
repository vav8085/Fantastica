package com.vav.karumanchi.Hashmaps;

import com.vav.Common.Sorting.MergeSort;

import java.util.Arrays;

/**
 * Created by Vaibhav on 4/13/17.
 */
public class RemoveDuplicatesSorting_03 {
    public static void main(String arg[]){
        String s = "abbcddpapywyw";
        System.out.println(removeDuplicatesUsingSortingInplace(s));
    }
    public static String removeDuplicatesUsingSorting(String s){
        char[] chars = s.toCharArray();
        //Arrays.sort(chars);
        System.out.println(chars);
        int n = chars.length-1;
        for(int i=0;i<n;i++){
            if(chars[i+1]==chars[i]){
                chars[i+1]='0';
            }
        }
        String s1=new String(chars);
        return s1.replace("0","");
    }
    public static String removeDuplicatesUsingSortingInplace(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        int i = 0;
        for (int j = 1; j < chars.length; j++) {
            if (chars[j] != chars[i]) {
                i++;
                chars[i] = chars[j];
            }
        }
        String s1=new String(chars);
        String s2 = s1.substring(0,i+1);
        return s2;

    }
}
