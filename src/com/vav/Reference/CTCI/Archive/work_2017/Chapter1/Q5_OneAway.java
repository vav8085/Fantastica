package com.vav.Reference.CTCI.Archive.work_2017.Chapter1;

/**
 * Created by Vaibhav on 6/12/17.
 */
public class Q5_OneAway {
    public static void main(String arg[]){
        String string1 = "Hello";
        String string2 = "Helloo";
        System.out.println(oneAway(string1, string2));

    }
    //There can be only 3 operations here
    //1. Inserting an item - This will increase character count by 1, we also have to check for any edit
    //2. Deleting an item - This will reduce character count by 1, we also have to check for any edit
    //3. Updating an item - This will have same count but one of the character will get modified
    //  This can be checked by comparing both strings character by character in a for loop

    public static boolean oneAway(String s1, String s2){
        int length1 = s1.length();
        int length2 = s2.length();

        if(length1==length2){
            //Strings are equal so check for update
            for(int i=0;i<length1;i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return true;
                }
            }
            return false;
        }else{
            if(length1==(length2+1)){
                return differentLengthCompare(s1,s2);
            }else if(length1==(length2-1)){
                return differentLengthCompare(s2,s1);
            }else return false;
        }
    }
    public static boolean differentLengthCompare(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        while (index1<s1.length() && index2< s2.length()){
            if(s1.charAt(index1)!=s2.charAt(index2)){
                if(index1!=index2){
                    return false;
                }
                index2++;

            }else{
                index1++;
                index2++;
            }
        }
        return true;
    }
}
