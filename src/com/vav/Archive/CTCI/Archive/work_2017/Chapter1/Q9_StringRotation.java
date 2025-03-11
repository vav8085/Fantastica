package com.vav.Archive.CTCI.Archive.work_2017.Chapter1;

/**
 * Created by Vaibhav on 6/12/17.
 */
public class Q9_StringRotation {
    public static void main(String arg[]){
        String s1 = "MYHOME";
        String s2 = "MEMYHO";
        System.out.println(isRotatedString(s1,s2));
    }
    public static boolean subString(String s1, String s2){
        if(s1.indexOf(s2)>=0){
            return true;
        }else return false;
    }
    public static boolean isRotatedString(String s1, String s2){
        String s1s1 = s1 + s1;
        if(s1.length()==s2.length()) {
            if (subString(s1s1, s2)) {
                return true;
            } else return false;
        }else return false;
    }
}
