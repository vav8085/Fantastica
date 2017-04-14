package com.vav.karumanchi.Hashmaps;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Vaibhav on 4/14/17.
 */
public class RemoveDuplicatesHashing_04 {
    public static void main(String arg[]){
        String s = "abbcddpapywyw";
         Enumeration e = removeDuplicatesHashmaps(s);
         while (e.hasMoreElements())
        System.out.print(e.nextElement()+", ");
    }

    private static Enumeration  removeDuplicatesHashmaps(String s) {
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
