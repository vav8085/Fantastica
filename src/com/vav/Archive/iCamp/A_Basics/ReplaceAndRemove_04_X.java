package com.vav.Archive.iCamp.A_Basics;

public class ReplaceAndRemove_04_X {

    public void replaceAndRemove(char[] arr, char original, char toRemove, char replacement){
        //{1,5,3,2,6,2,1}  remove 2 and replace 1 by 2 7s
        //We will start from left and use two pointers. One to parse the array and other to replace toRemove
        int move = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=toRemove){
                arr[move] = arr[i];
                move++;
            }else{

            }
        }
    }
}
