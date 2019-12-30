package com.vav.Reference.Leetcode.JetSetRun.Easy;

/**
 * Created by vaibhav on 2/3/18.
 */
public class RomanToInteger_013 {
    public static void main(String arg[]){
        System.out.println(romanToInteger("MM"));
    }
    public static int romanToInteger(String s){
        char[] romanArray = s.toCharArray();
        int sum=0;

        for(int i=romanArray.length-1;i>=0;i--){
            switch (romanArray[i]){
                case 'M':
                    sum=sum+1000;
                    break;
                case 'D':
                    if(i!=romanArray.length-1){
                        if(romanArray[i+1]=='M'){
                            sum=sum-500;
                            break;
                        }
                    }
                        sum=sum+500;
                    break;
                case 'C':
                    if(i!=romanArray.length-1){
                        if(romanArray[i+1]=='M' || romanArray[i+1]=='D'){
                            sum=sum-100;
                            break;
                        }
                    }
                    sum=sum+100;
                    break;
                case 'L':
                    if(i!=romanArray.length-1){
                        if(romanArray[i+1]=='M' || romanArray[i+1]=='D' || romanArray[i+1]=='C'){
                            sum=sum-50;
                            break;
                        }
                    }
                    sum=sum+50;
                    break;
                case 'X':
                    if(i!=romanArray.length-1){
                        if(romanArray[i+1]=='M' || romanArray[i+1]=='D' || romanArray[i+1]=='C' || romanArray[i+1]=='L'){
                            sum=sum-10;
                            break;
                        }
                    }
                    sum=sum+10;
                    break;
                case 'V':
                    if(i!=romanArray.length-1){
                        if(romanArray[i+1]=='M' || romanArray[i+1]=='D' || romanArray[i+1]=='C' || romanArray[i+1]=='L'
                                || romanArray[i+1]=='X'){
                            sum=sum-5;
                            break;
                        }
                    }
                    sum=sum+5;
                    break;
                case 'I':
                    if(i!=romanArray.length-1){
                        if(romanArray[i+1]=='M' || romanArray[i+1]=='D' || romanArray[i+1]=='C' || romanArray[i+1]=='L'
                                || romanArray[i+1]=='X' || romanArray[i+1]=='V'){
                            sum=sum-1;
                            break;
                        }
                    }
                    sum=sum+1;
                    break;

            }
        }

        return sum;
    }
}
