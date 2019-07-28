package com.vav.Reference.educative.DSInJavaInterviewRefresher.Arrays;

public class TwoDimensionalArray_01 {
    public static void main(String arg[]){
        //declaration
        int[][] twoDArray = new int[4][5];
        for(int i=0;i<twoDArray.length;i++){
            for(int j=0;j<twoDArray[i].length;j++){ //You can find the inside array using array[i]
                twoDArray[i][j] = j;
                System.out.println(twoDArray[i][j]); //To parse the inside array you will need both i and j
            }
        }
    }
}
