package com.vav.Design.ReactiveProgramming.Code.IteratorPattern;

/**
 * THis can be any data structure which will be used in aggregate object
 */
public class KeyValueStorage {
    private int key;
    private String value;

    public KeyValueStorage(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
