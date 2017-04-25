package com.vav.CTCI.Chapter1;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Vaibhav on 4/24/17.
 */
public class QX_RemoveDuplicates {
    public static void main(String arg[]){
        System.out.println(removeDuplicatesBF(new String("testeddbybxx")));
        Enumeration<Character> en = removeDuplicatesHashmaps(new String("testeddbybxx"));
        while(en.hasMoreElements()){
            System.out.print(en.nextElement()+"-");
        }
    }
    //1. Replacing the last character with duplicates O(n2), only replaces duplicates not triples or more
    public static String removeDuplicatesBF(String str){
        char[] chars = str.toCharArray();
        int length = str.length();
        char temp;

        for(int i=0;i<chars.length-1;i++){
            for(int j=chars.length-1;j>i;){
                if(chars[i]==chars[j]){
                    --length;
                    temp=chars[j];
                    chars[j]=chars[length];
                    chars[length]=temp;
                }
                --j;
            }
        }
        return new String(chars).substring(0,length);
    }
    //2. Sorting and then replacing last chars with duplicates O(nlog(n))
    public static String removeDuplicatesSorting(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int length = str.length();
        char temp;
        int i=0;
        for(int j=1;j<chars.length-1;j++){
            if(chars[i]!=chars[j]){
               i++;
               chars[i]=chars[j];

            }
        }
        return new String(chars).substring(0,i+1);
    }
    //3. Remove duplicates using hashmaps O(n)
    private static Enumeration removeDuplicatesHashmaps(String s) {
        char[] chars = s.toCharArray();
        Hashtable hashtable = new Hashtable();
        for(int i=0;i<chars.length;i++){
            if(!hashtable.containsKey(chars[i])){
                hashtable.put(chars[i],0);
            }
        }
        return hashtable.keys();
    }
}
