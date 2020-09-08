package com.vav.Reference.Leetcode.archive.JetSetRun.Easy;

/**
 * Created by vaibhav on 2/6/18.
 */

/**
 * Problem:
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 Example:

 Input: "Hello World"
 Output: 5
 */
public class LengthOfLastWord_058 {
    public static void main(String arg[]){
        System.out.println(lengthOfLastWord("H"));
    }

    /**
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s){
        int length = s.length();
        int size =0;
        for(int i=length-1;i>=0;i--){
            if(s.charAt(i)==' ' && size==0){
                continue;
            }
            else if(s.charAt(i)!=' '){
                size++;
            }else
                return size;
        }
        return size;
    }
}
