package com.vav.USanDieg_DsAlgoSpecialization.Week3.Code;

/**
 * Created by vaibhav on 1/11/18.
 */
public class MinimumChange {
    public static void main(String arg[]){
        System.out.print(getChange(40));
    }
    private static int getChange(int m) {
        //write your code here
        int arr[] = new int[3];
        arr[0]=25;
        arr[1]=20;
        arr[2]=5;
        int count=0;
        int reminder=m;
        for(int i=0;i<arr.length && reminder!=0;i++){
            if(arr[i]!=1) {
                count = count +  reminder / arr[i];
                reminder = reminder % arr[i];
            }else{
                count=count+ reminder;
            }
        }

        return count;
    }
}

