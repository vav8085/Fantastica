package com.vav.Common.Hashing;

/**
 * Created by Vaibhav on 1/1/2018.
 */
public class DoubleHashingMap {
    private int size;
    private Data[] hashArray;
    private Data deletePlaceholder;
    public DoubleHashingMap(int size){
        this.size = size;
        hashArray = new Data[size];
        deletePlaceholder = new Data(-1);
    }
    public int hashFunction(int key){
        return key % size;
    }
    public int SecondaryHashFunction(int key){ //Step size is recalculated using this hash function
        return 5 - (key % 5);
    }

    public void insert(Data data){
        int key = data.getKey();
        int location = hashFunction(key);
        int stepSize= SecondaryHashFunction(key);

        while (hashArray[location]!=null && hashArray[location].getKey()!=-1){
            location = location+stepSize;
            if(location>=hashArray.length){
                location = location % size;
            }
        }
        hashArray[location]=data;
    }
    public boolean find(int key){
        int location = hashFunction(key);
        int stepSize = SecondaryHashFunction(key);

        while(hashArray[location]!=null){
            if(hashArray[location].getKey()==key){
                return true;
            }
            location = location+stepSize;
            if(location>=hashArray.length){
                location = location % hashArray.length;
            }
        }
        return false;
    }
    public void delete(int key){
        int location = hashFunction(key);
        int stepSize = SecondaryHashFunction(key);

        while(hashArray[location]!=null){
            if(hashArray[location].getKey()==key){
                hashArray[location] = deletePlaceholder;
            }
            location = location+stepSize;
            if(location>=hashArray.length){
                location = location % hashArray.length;
            }
        }
    }
}
