package com.vav.karumanchi.Hashmaps;

import java.util.List;

/**
 * Created by Vaibhav on 12/27/2016.
 */
public class SeparateChaining_01 {

    public final static int LOAD_FACTOR=20;
    //Create
    public static HashTable createHashTable(int size){
        HashTable hashTable = new HashTable();
        hashTable.setTableSize(size/LOAD_FACTOR); //Why?
        hashTable.setCount(0);
        for(int i=0;i<hashTable.getTableSize();i++){
            hashTable.getTable()[i].setHeadNode(null);
        }
        return hashTable;
    }
    //search
    public static int hashSearch(HashTable table,int data){
        ListNode temp;
        for(int i=0;i<table.getTableSize();i++){
            if(data == table.getTable()[i].getHeadNode().getData()){

            }
        }
        return 0;
    }
    //Insert
    public static void insertNode(HashTable h,int data){
        ListNode newNode;

    }

}
class ListNode{
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    private int key;
    private int data;
    private ListNode next;
}
class HashTableNode{
    private int blockCount;

    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public ListNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(ListNode headNode) {
        this.headNode = headNode;
    }

    private ListNode headNode;

}
class HashTable{
    private int tableSize;
    private int count;
    private HashTableNode[] table;

    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
        table = new HashTableNode[tableSize];
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public HashTableNode[] getTable() {
        return table;
    }

    public void setTable(HashTableNode[] table) {
        this.table = table;
    }

}
