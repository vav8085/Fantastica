package com.vav.CoursesBooks.epi.strings;

public class BaseConversion_02 {
    public static String convertBase(String input, int base1, int base2){
        int number = 0;
        //Doing String to integer in a base base1
        for(int i=(input.charAt(0)!='-'?0:1);i<input.length();i++){
            number = number * base1 + (Character.isDigit(input.charAt(i))?(input.charAt(i)-'0'):(input.charAt(i)-'A'+ 10));
        }
        //Doing Integer to base base2
        StringBuilder stringBuilder = new StringBuilder();
        while (number!=0){
            if(number%base2>=10){
                stringBuilder.append((char)(number % base2 + 'A' - 10));
            }else{
                stringBuilder.append((char)(number % base2 + '0'));
            }
            number = number / base2;
        }
        return stringBuilder.reverse().toString();
    }
    public static void main(String arg[]){
        System.out.println(convertBase("123",10,16));
    }
}
