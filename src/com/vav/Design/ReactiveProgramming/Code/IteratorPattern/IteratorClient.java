package com.vav.Design.ReactiveProgramming.Code.IteratorPattern;

public class IteratorClient {
    public static void main(String arg[]){
        KeyValueStorageCollection collection = new KeyValueStorageCollection();
        collection.addItem(1,"John");
        collection.addItem(2,"Romeo");
        collection.addItem(3,"Jason");

        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()){
            System.out.println(((KeyValueStorage) iterator.next()).getValue());
        }
    }
}
