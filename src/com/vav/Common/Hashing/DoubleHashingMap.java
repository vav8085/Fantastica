package com.vav.Common.Hashing;

/**
 * Created by Vaibhav on 1/1/2018.
 */
public class DoubleHashingMap {
    private int size;

    public int hashFunction(int key){
        return key % size;
    }
    public int SecondaryHashFunction(int key){ //Step size is recalculated using this hash function
        return 5 - (key % 5);
    }
}
