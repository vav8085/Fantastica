package com.vav.Algorithms.Common.Strings;

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
        //calculating maximum power for x
        int xPow = 1;
        for(int k=0;k<target.length();k++){
            xPow = xPow * X;
        }
        //Check for other substrings in str here. We are looping from end of target length. Start value of substring will be
        //calculated by subtracting target.length from j
        for(int j=target.length();j<str.length();j++){
            int indexToRemove = j-target.length(); //0 in first iteration then 1,2,3...
            hash = (hash - (str.charAt(indexToRemove))* xPow)*X + str.charAt(j);

            if(hash==hashTarget && target.equals(str.substring(indexToRemove+1,j+1))){
                return indexToRemove+1;
            }
        }
        return -1;
    }
}
