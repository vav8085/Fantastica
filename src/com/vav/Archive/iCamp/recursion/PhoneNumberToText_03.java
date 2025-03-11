package com.vav.Archive.iCamp.recursion;

import java.util.ArrayList;

/**
 * ToDo add conditions for 0 and 1
 */
public class PhoneNumberToText_03 {
    public static void main(String arg[]){
        ArrayList<ArrayList<Character>> masterList = new ArrayList<>();
        ArrayList<Character> child1 = new ArrayList<>();
        child1.add('a');
        child1.add('b');
        child1.add('c');
        ArrayList<Character> child2 = new ArrayList<>();
        child2.add('d');
        child2.add('e');
        child2.add('f');
        masterList.add(child1);
        masterList.add(child2);
        ArrayList<Character> buffer = new ArrayList<>(2);
        phoneNumberToString(masterList,buffer,0,0);
    }
    public static void phoneNumberToString(ArrayList<ArrayList<Character>> numbers, ArrayList<Character> buffer, int index, int bufferIndex){
        if(bufferIndex==2){
            printBuffer(buffer);
            return;
        }
        if(index == 2){
            return;
        }
        ArrayList<Character> chars = numbers.get(index);
        for(Character ch : chars){
            buffer.add(bufferIndex,ch);
            phoneNumberToString(numbers,buffer, index+1,bufferIndex+1);
            buffer.remove(bufferIndex);
        }
    }

    private static void printBuffer(ArrayList<Character> buffer) {
        for(Character ch1 : buffer){
            System.out.println(ch1);
        }
    }
}
