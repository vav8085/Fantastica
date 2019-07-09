package com.vav.Design.ReactiveProgramming.Code.IteratorPattern;

public class KeyValueStorageCollection implements Collection {
    private static final int MAX_COUNT = 10;
    private KeyValueStorage[] data;
    private int count = 0;
    public KeyValueStorageCollection(){
        data = new KeyValueStorage[MAX_COUNT];
    }

    public void addItem(int key, String value){
        if(count>=MAX_COUNT){
            System.out.println("Full, Cannot add more items!");
        }else{
            KeyValueStorage keyValueStorage = new KeyValueStorage(key,value);
            data[count++] = keyValueStorage;
        }
    }

    @Override
    public Iterator getIterator() {
        return new KeyValueStorageIterator(data);
    }
}
