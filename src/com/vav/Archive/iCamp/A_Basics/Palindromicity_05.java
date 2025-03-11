package com.vav.Archive.iCamp.A_Basics;

public class Palindromicity_05 {


    public static boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        System.out.println(isPalindrome("abcba"));
    }
}
