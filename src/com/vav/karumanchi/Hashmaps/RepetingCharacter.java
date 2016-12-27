package com.vav.karumanchi.Hashmaps;

/**
 * Created by Vaibhav on 12/25/2016.
 */
public class RepetingCharacter {

    public static void findRepetingCharacterHashmaps(char[] inputArr){
        //256 ascii chars
        char[] saveArray = new char[256];
        char ch='0';
        for(int i=0;i<saveArray.length;i++){
            saveArray[i]=0;
        }
        for(int j=0;j<inputArr.length;j++){
            if(saveArray[inputArr[j]]==1){
                System.out.println(inputArr[j]);
                break;
            }else{
                saveArray[inputArr[j]]++;
            }
        }

    }
}
