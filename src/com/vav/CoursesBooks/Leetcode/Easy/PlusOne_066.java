package com.vav.CoursesBooks.Leetcode.Easy;

/**
 * Created by Vaibhav on 2/8/18.
 */
public class PlusOne_066 {

    public static void main(String arg[]){
        int arr[] = {1};
        int result[] = plusOne(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
        public static int[] plusOne(int[] digits) {
            int carry=1;
            for(int i=digits.length-1;i>=0;i--){
                digits[i] = digits[i]+carry;
                if(digits[i]>=10){
                    digits[i]=digits[i]%10;
                    carry=1;
                }else{
                    carry=0;
                }        }
            if(carry==1){
                int[] dightsNew = new int[digits.length+1];
                dightsNew[0]=1;
                for(int j=0;j>digits.length-1;j++){
                    dightsNew[j+1] = digits[j];
                }
                return dightsNew;
            }
            return digits;
        }

}
