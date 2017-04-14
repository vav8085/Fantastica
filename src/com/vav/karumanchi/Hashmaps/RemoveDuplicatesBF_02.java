package com.vav.karumanchi.Hashmaps;

/**
 * Created by Vaibhav on 4/13/17.
 */
public class RemoveDuplicatesBF_02 {
    public static void main(String arg[]){
        String s = "abbcddpapywyw";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;
        for(int i=0;i<chars.length;i++){
            for(int j =chars.length-1;j>i;j--){
                if(chars[i]==chars[j]){
                    --n;
                    char temp=chars[n];
                    chars[n]=chars[j];
                    chars[j]=temp;
                }
            }
        }
        String str = new String(chars);
        return str.substring(0,n);

    }

}
