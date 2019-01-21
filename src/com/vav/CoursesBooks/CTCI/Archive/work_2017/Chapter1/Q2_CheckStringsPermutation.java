package com.vav.CoursesBooks.CTCI.Archive.work_2017.Chapter1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Vaibhav on 4/23/2017.
 */
public class Q2_CheckStringsPermutation {
    public static void main(String arg[]) {
        String s1 = "topology";
        String s2 = "potology";
        System.out.println(checkStringsPermutationHashing(s1, s2));
    }

    //1. Can improve complexity by checking the size of strings first O(nlog(n))
    public static boolean checkStringsPermutationSorting(String s1, String s2) {
        return sort(s1).equals(sort(s2));
    }

    public static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    //2. Using hashmaps by keeping count of each character O(n)
    public static boolean checkStringsPermutationHashing(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            HashMap<Character, Integer> hashMap = new HashMap();
            for (int i = 0; i < s1.length(); i++) {
                hashMap.put(s1.charAt(i), (hashMap.get(s1.charAt(i)) != null) ? (hashMap.get(s1.charAt(i)) + 1) : 1);
            }
            for (int j = 0; j < s2.length(); j++) {
                hashMap.put(s2.charAt(j), (hashMap.get(s2.charAt(j)) != null) ? (hashMap.get(s2.charAt(j)) - 1) : 0);
            }
            for(Character c: hashMap.keySet()){
                if(hashMap.get(c)!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
