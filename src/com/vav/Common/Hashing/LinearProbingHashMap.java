package com.vav.Common.Hashing;

/**
 * Created by vaibhav on 12/28/17.
 */
public class LinearProbingHashMap {

    private Data[] hashArray;
    private int size;
    private Data deletedPlaceholder;

    public LinearProbingHashMap(int size){
        this.size = size;
        hashArray = new Data[size];
        deletedPlaceholder = new Data(-1);
    }

    /**
     * Here hashfunction takes key which is the value of the actual data that needs to be mapped to hashArray
     * for strings and similar data our hash function will also calculate this key.
     * @param key
     * @return
     */
    public int hashFunction(int key){
        return key % size;
    }
    public void insert(Data data){
        int key = data.getKey();
        int hashedValue = hashFunction(key); //hashvalue = location
        while (hashArray[hashedValue]!=null && hashArray[hashedValue].getKey()!=-1){ //if current cell is occupied or nothing deleted here
            ++hashedValue; //then go to next value
            if(hashedValue==hashArray.length) // I have put this condition because i dont know if wrapping arround is necessary every loop iteration
            hashedValue = hashedValue % size; // this is for wrapping around if you reach last array value, this will return 0
        }
        hashArray[hashedValue] = data; // insert the data at this location
    }
    public void delete(int key){
        int hashValue = hashFunction(key);
        while (hashArray[hashValue]!=null){
            if(hashArray[hashValue].getKey()==key){
                hashArray[hashValue]=deletedPlaceholder;
                return;
            }
                ++hashValue;
                if(hashValue==size)
                    hashValue = hashValue % size;
        }
    }
    public boolean find(int key){
        int hashVal = hashFunction(key);
        while (hashArray[hashVal]!=null){
            if(hashArray[hashVal].getKey()==key){
                return true;
            }
            ++hashVal;
            if(hashVal==size)
                hashVal = hashVal % size;
        }
        return false;
    }
}

class Data{
    private int key;

    public Data(int key){
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
