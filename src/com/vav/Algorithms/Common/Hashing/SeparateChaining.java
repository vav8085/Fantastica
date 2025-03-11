package com.vav.Algorithms.Common.Hashing;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * This is a linked list implementation, If we take a sorted linked list then Find and delete become faster
 * because we know how far do we need to search.
 *
 * Created by Vaibhav on 4/13/17.
 */
public class SeparateChaining {
    private LinkedList<Integer>[] hashArray;
    private int size;

    public SeparateChaining(int size){
        this.size = size;
        hashArray = new LinkedList[size];
        for(int i=0;i<hashArray.length;i++){
            hashArray[i] = new LinkedList();
        }
    }
    public int hashFunction(int key){
        return key % size;
    }
    public void insert(int data){
        int key = data;
        int location = hashFunction(key);
        hashArray[location].insertAtEnd(key);
    }
    public void delete(int key){
        int location = hashFunction(key);
        hashArray[location].deleteWithValue(key);
    }
    public boolean find(int key){
        int location = hashFunction(key);
        Link head = hashArray[location].getHead();
        while (head!=null){
            if(head.getData().equals(key)){
                return true;
            }
            head = head.getNext();
        }
        return false;
    }
}

