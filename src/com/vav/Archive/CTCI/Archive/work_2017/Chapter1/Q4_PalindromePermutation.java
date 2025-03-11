package com.vav.Archive.CTCI.Archive.work_2017.Chapter1;

import java.util.HashMap;

/**
 * Created by vaibhav on 6/11/17.
 */
public class Q4_PalindromePermutation {
    public static void main(String arg[]){
        String str = "carxxxrac";
        System.out.println(permutationPalindrome(str));
    }
    //In this problem the only thing we need to take care is the count of even and odd characters

    //With the help of hashmaps
    public static boolean permutationPalindrome(String s){
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int oddCount = 0;
        for(int i = 0;i<chars.length;i++){
            hashMap.put(chars[i],(hashMap.get(chars[i])!=null)?(hashMap.get(chars[i])+1):1);
        }
        for(Character c: hashMap.keySet()){
            if(hashMap.get(c)%2!=0){
                oddCount++;
            }
        }
        if(oddCount>1){
            return false;
        }else return true;

    }
}
