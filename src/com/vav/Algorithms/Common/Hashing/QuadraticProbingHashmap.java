package com.vav.Algorithms.Common.Hashing;

/**
 * Created by Vaibhav on 1/1/2018.
 */
public class QuadraticProbingHashmap {
    private Data[] hashArray;
    private int size;
    private Data deletePlaceholder;

    public QuadraticProbingHashmap(int size){
        this.size = size;
        hashArray = new Data[size];
        deletePlaceholder = new Data(-1);
    }
    public int hashFunction(int key){
        return key % size;
    }
    public void insert(Data data){
        int key = data.getKey();
        int location = hashFunction(key);
        int i=1;
        while (hashArray[location]!=null && hashArray[location].getKey()!=-1){
           location = location + i^2;
           i++;
           if(location>=hashArray.length){
               location= location % size; //suppose size = 59 then location % 59 will be 59 % 59 = 0
           }
        }
        hashArray[location] = data;
    }
    public boolean find(int key){
        int location = hashFunction(key);
        int i=1;
        while (hashArray[location]!=null){
            if(hashArray[location].getKey()==key){
                return true;
            }
            location = location + i^2;
            i++;
            if(location>=hashArray.length){
                location= location % size; //suppose size = 59 then location % 59 will be 59 % 59 = 0
            }
        }
        return false;
    }
    public void delete(int key){
        int location = hashFunction(key);
        int i=1;
        while (hashArray[location]!=null){
            if(hashArray[location].getKey()==key){
                hashArray[location]=deletePlaceholder;
            }
            location = location + i^2;
            i++;
            if(location>=hashArray.length){
                location= location % size; //suppose size = 59 then location % 59 will be 59 % 59 = 0
            }
        }
    }
}

