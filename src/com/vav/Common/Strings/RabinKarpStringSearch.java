package com.vav.Common.Strings;

public class RabinKarpStringSearch {
    private static final int X = 53;
    public int rabinKarpStringSearch(String str, String target){
        //First we will identify the initial hash of the str and the hash of our target
        //We will do this by looping over str and target for the length of our target
        int hashTarget=0, hash=0;
        for(int i=0;i<target.length();i++){
            hashTarget = hashTarget*X + target.charAt(i);
            hash = hash*X + str.charAt(i);
        }
        //If initial hashes match then check each character in both strings and if they also match then return 0th index
        if(hash==hashTarget){
            if(target.contentEquals(str.substring(0,target.length()-1))){
                return 0;
            }
        }
        //Check for other substrings in str here
        //ToDo CHeck other strings
    }
}
