package com.vav.Common.Hashing;

/**
 * Created by Vaibhav on 4/14/17.
 */
public class DirectAddressTable {
    int [] table;
    public DirectAddressTable(){
        for(int i =0;i<table.length;i++)
            table[i]=0;
        table = new int [1000];
    }
    public void insert(int value){
        table[value]=value;
    }
    public boolean search(int value){
        if(table[value]==value){
            return true;
        }
        return false;
    }
    public void delete(int value){
        table[value] = 0;
    }
}

