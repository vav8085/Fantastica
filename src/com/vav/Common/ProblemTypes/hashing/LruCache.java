package com.vav.Common.ProblemTypes.hashing;

import java.util.HashMap;

public class LruCache {
    private Integer headKey, tailKey;
    private HashMap<Integer, Item> lruMap;
    private int size;

    public LruCache(int size) {
        lruMap = new HashMap<>();
        this.size = size;
    }
    
}

class Item{
    private Item left;
    private Item right;
    private int value;

    public Item(int value){
        this.value = value;
    }

    public Item getLeft() {
        return left;
    }

    public void setLeft(Item left) {
        this.left = left;
    }

    public Item getRight() {
        return right;
    }

    public void setRight(Item right) {
        this.right = right;
    }
}
