package com.vav.Revision.PrincetonAlgo1.W04;

public class Heap_02 {
    private int size;
    private int currentSize;
    private Node[] arr;

    public Heap_02(int size){
        this.size = size;
        arr = new Node[size];
        currentSize=0;
    }

    public void insert(int key){
        Node node = new Node();
        node.setKey(key);
        arr[currentSize] = node;
        trickleUp(currentSize++);
    }

    private void trickleUp(int nodePosition) {
        Node temp = arr[nodePosition];
        int rootPosition = (nodePosition-1)/2;
        while(nodePosition>0 && arr[nodePosition].getKey()>arr[rootPosition].getKey()){
            arr[nodePosition] = arr[rootPosition];
            nodePosition = rootPosition;
            rootPosition = (nodePosition-1)/2;
        }
        arr[nodePosition] = temp;
    }
    public void delete(int key){

    }
}

class Node{
    private int key;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
