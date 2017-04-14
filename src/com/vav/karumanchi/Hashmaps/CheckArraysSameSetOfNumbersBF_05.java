package com.vav.karumanchi.Hashmaps;

/**
 * Created by Vaibhav on 4/14/17.
 */
public class CheckArraysSameSetOfNumbersBF_05 {
    public static void main(String arg[]){
        int[] arr1 = {1,2,3,4,5,5};
        int[] arr2 = {5,4,2,3,1};
        System.out.println(checkArraysSameSetOfNumbersBFNoDups(arr1,arr2));
    }
    public static boolean checkArraysSameSetOfNumbersBFNoDups(int[] arr1, int[] arr2){
        //!!!!!!second part not done
        //We will simply compare each element of array 1 with array 2 && then of array 2 with array 1
        //12345, 54321
        boolean flag= false;
        for(int i =0;i<arr1.length;i++){
            flag=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    flag=true;
                    continue;
                }else{
                    if(!flag){flag=false;}
                }
            }
            if(flag==false){
                return false;
            }
        }

        return flag;
    }


}
