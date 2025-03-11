package com.vav.Archive.CTCI.Archive.work_2017.Chapter1;

/**
 * Created by Vaibhav on 4/23/2017.
 */
public class Q3_URLify {
    public static void main(String arg[]){
        String url = "https://www.google . com";
        ;
        System.out.println(urlify(url.toCharArray(),url.length()));
    }
    public static String urlify(char[] chars, int originalLength){
        int spaceCount=0,newLength;
        char newChars[];
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                spaceCount++;
            }
        }

        newLength = originalLength + spaceCount*2;
        newChars = new char[newLength];
        for(int j=originalLength-1;j>=0;j--){
            if(chars[j]==' '){
                newChars[newLength-1]='0';
                newChars[newLength-2]='2';
                newChars[newLength-3]='%';
                newLength = newLength-3;
            }else{
                newChars[newLength-1]= chars[j];
                newLength--;
            }
        }
        return new String(newChars);
    }
}
