package com.vav.Reference.CTCI.Archive.work_2017.Chapter1;

/**
 * Created by Vaibhav on 4/23/2017.
 */
public class Q1_CheckStringUnique {
    public static void main(String arg[]){
        String s = "cracking";
        System.out.println(s.length());
        System.out.println(checkIfNoRepetitions(s));
    }
    //USING ARRAY OF BOOLEAN
    public static boolean checkIfNoRepetitions(String s){
        boolean[] arr = new boolean[256];
        for(int j=0;j<s.length();j++){
            if(arr[s.charAt(j)]){
                return false;
            }else{
                arr[s.charAt(j)]=true;
            }
        }
        return true;
    }
    //USING BIT VECTOR
    public static boolean checkIfNoRepetitionsBitVector(String s){

        return true;
    }
}
