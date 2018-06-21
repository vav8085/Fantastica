package com.vav.Leetcode.Easy;

/**
 * Created by Vaibhav on 3/19/2018.
 */
public class AddBinary_67 {
    public static void main(String arg[]){
        System.out.print(addBinary("110","11"));
    }
    public static String addBinary(String a, String b){
        /**
         * To solve this we need to know each digit of both the binary numbers to sum them
         * We can start from end of the strings and keep adding numbers and finally add carry to it
         * if one of the string is shorter we will assume that it has zeros there
         */
        StringBuilder sumString = new StringBuilder();
        int i= a.length()-1;
        int j= b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            sum = sum +((i>=0)? (a.charAt(i--)-'0'):0);
            sum = sum +((j>=0)? (b.charAt(j--)-'0'):0);
            sumString.append(sum%2);
            carry = sum / 2;
        }
        if(carry==1)
            sumString.append(carry);
        return sumString.reverse().toString();
    }
}
