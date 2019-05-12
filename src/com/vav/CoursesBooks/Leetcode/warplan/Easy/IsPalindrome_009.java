package com.vav.CoursesBooks.Leetcode.warplan.Easy;

/**
 * Created by vaibhav on 2/3/18.
 */
public class IsPalindrome_009 {
    public static void main(String arg[]){
       System.out.println(isPalindrome(12321));
    }

    /**
     * We can solve this by saving this number in an array and then checking palindrome
     * but this will take extra space.
     * We can just reverse it and compare it with original to see if its a palindrome
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x){
        int newNumber = 0;
        int lastDigit = 0;
        int oldNumber = 0;
        int y=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            lastDigit = x%10;
            oldNumber = newNumber;
            newNumber = newNumber * 10 + lastDigit;
            if((newNumber-lastDigit)/10!=oldNumber){
                return false;
            }
            x=x/10;
        }
        return newNumber==y;
    }
}
