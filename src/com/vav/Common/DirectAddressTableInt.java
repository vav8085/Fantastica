package com.vav.Common;

/**
 * Created by Vaibhav on 12/12/2016.
 */
public class DirectAddressTableInt {
    private int data;
    int[] table;
    public DirectAddressTableInt(int size){
        table = new int[size];
    }
    public void add(int key, int value){
        table[key] = value;
    }

}

