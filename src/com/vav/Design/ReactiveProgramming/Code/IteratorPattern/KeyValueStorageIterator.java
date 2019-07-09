package com.vav.Design.ReactiveProgramming.Code.IteratorPattern;

public class KeyValueStorageIterator implements Iterator {
    private KeyValueStorage[] data;
    int position=0;
    public KeyValueStorageIterator(KeyValueStorage[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if(position<=data.length && data[position]!=null)
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        return data[position++];
    }
}
