package com.vav.Randoms;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Vaibhav on 4/24/2017.
 */
public class MissingWords {
    public static void main(String arg[]){
        String[] sb = missingWords("Hi there how are you", "how are you");
        for(int i=0;i<sb.length;i++){
            System.out.println(sb[i]);
        }
    }
    public static String[] missingWords(String s, String t){
       String s1 = s+ " "+t;
       String[] sArr = s1.split(" ");
       Arrays.sort(sArr);
        int i=0;
        for(int j=1;j<sArr.length-1;j++){
            if(!sArr[i].equals(sArr[j])){
                i++;
                sArr[i]=sArr[j];

            }
        }
        return sArr;
    }
}
