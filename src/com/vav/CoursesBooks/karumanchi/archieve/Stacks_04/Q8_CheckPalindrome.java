package com.vav.CoursesBooks.karumanchi.archieve.Stacks_04;

/**
 * Created by vaibhav on 12/21/17.
 */
public class Q8_CheckPalindrome {
    public static void main(String arg[]){
        String s = "aabccxccbaa";
        checkStringPalindrome(s);
    }

    private static void checkStringPalindrome(String s) {
       int i =0 , j =s.length();
       while (i<=j && s.charAt(i)==s.charAt(j-1)){
           i++;
           j--;
       }
       if(i>j){
           System.out.println("Is a palindrome");
       }else{
           System.out.println("Not a palindrome");
       }
    }
}
