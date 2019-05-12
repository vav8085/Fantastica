package com.vav.CoursesBooks.Leetcode.warplan.Easy;

/**
 * Created by Vaibhav on 2/5/18.
 */
public class NeedleInHaystack_028 {
    public static void main(String arg[]){
        String haystack = "mississippi";
        String needle = "issippi";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle){
        if(haystack.length()==0 &&0==needle.length())
            return 0;
        if(haystack.length()<needle.length()){
            return -1;
        }
        int windowSize = needle.length();
        for(int i=0;i<haystack.length();i++){
            int possibleValue=i;
            int j=0;
            for(int k=i;j<windowSize && k<haystack.length();j++,k++){
                if(haystack.charAt(k)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==needle.length()){
                return possibleValue;
            }
        }

        return -1;
    }

    //Clean solution on Leetcode:
    public int strSta(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
