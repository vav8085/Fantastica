package com.vav.Reference.epi.strings;

public class StringToInteger_01 {

    /**
     * To solve this problem you should know 2 things:
     * 1. If you want to convert a character into integer you substract '0' from it. This is because
     * ASCII of '0' is 48 and when we substract '0' from a number we get its integer value
     *
     *
     * @param str
     * @return
     */
    public static int stringToInteger(String str){
        int number = 0;
        for(int i=str.charAt(0)=='-'?1:0;i<str.length();i++){
            int digit = str.charAt(i) - '0';
            number = number * 10 + digit;
        }
        if(str.charAt(0)=='-'){
            number = number*-1;
        }
        return number;
    }

    /**
     * The way we will approach this problem is by taking % 10 of the number every time to find out its units digit
     * And then we can take / 10 to fetch its tenth place and above digits
     * @param value
     * @return
     */
    public static String integerToString(int value){
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;
        if(value<0){
            isNegative = true;
        }
        while (value!=0){
            int unitsDigit = value % 10;
            //sb.append(Math.abs(unitsDigit));
            sb.append((char) ('0'+ Math.abs(unitsDigit)));
            value = value / 10;
        }
        if(isNegative){
            sb.append("-");
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String arg[]){
        System.out.println(stringToInteger("-123"));
        System.out.println(integerToString(-1234));
    }
}
