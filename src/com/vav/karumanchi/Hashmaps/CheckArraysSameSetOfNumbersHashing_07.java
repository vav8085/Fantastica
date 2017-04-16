package com.vav.karumanchi.Hashmaps;

import java.util.Hashtable;
import java.util.Set;

/**
 * Created by Vaibhav on 4/14/17.
 */
public class CheckArraysSameSetOfNumbersHashing_07 {
    public static void main(String arg[]){
        int[] arr1 = {1,5,2,3,4,5,5};
        int[] arr2 = {1,2,3,4,5,5,5};
        System.out.println(checkArraysSameSetOfNumbersHashing(arr1,arr2));
    }

    private static boolean checkArraysSameSetOfNumbersHashing(int[] arr1, int[] arr2) {
        Hashtable hashtable = new Hashtable();
        for(int k=0;k<10;k++){
            hashtable.put(k,0);
        }
        for(int i=0;i<arr1.length;i++){
            int arre1= Integer.parseInt(hashtable.get(arr1[i])+"") ;
            hashtable.put(arr1[i],arre1+1);
        }
        for(int j=0;j<arr2.length;j++){
            int arre2= Integer.parseInt(hashtable.get(arr2[j])+"") ;
                hashtable.put(arr2[j],arre2-1);
        }
        Set<Integer> keys = hashtable.keySet();
        for(Integer key: keys){
            Integer i = (Integer) hashtable.get(key);
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
