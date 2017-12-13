package com.vav.Common.Heaps;

/**
 * Created by Vaibhav on 12/13/17.
 */
public class Heap {
    private Node[] heapArray; //An array that is used to store the heap of nodes
    private int maxSize; //Maximum size of the heap
    private int currentSize; // Current size of the heap

    Heap(int size){
        heapArray = new Node[size];
        maxSize = size;
        currentSize = 0;
    }
    public boolean isEmpty(){
        return currentSize==0?true:false;
    }
    public boolean insert(int key){
        if(currentSize<maxSize){    // when current size reaches max size just return false saying that item not inserted
            Node newNode = new Node(key);   // Create a nre node with key
            heapArray[currentSize] = newNode;   //Add the new node to the end of the array
            trickleUp(currentSize++);   //Trickle the tree so newNode can get to its correct position
            return true;
        }else{
            return false;
        }
    }

    /**
     *  The important thing to know here is that the the root position of the node is the rootPosition = (nodePosition-1)/2
     *
     *  Trickleup function will help us move the newNode to its correct position
     *
     * @param nodePosition
     */
    private void trickleUp(int nodePosition) {
        Node temp = heapArray[nodePosition];
        int rootPosition = (nodePosition-1)/2;
        while(nodePosition>0 && heapArray[rootPosition].getKey()<heapArray[nodePosition].getKey()){
            heapArray[nodePosition] = heapArray[rootPosition];
            nodePosition = rootPosition;
            rootPosition = (rootPosition-1)/2;
        }
        heapArray[nodePosition] = temp;
    }

    /**
     * Remove always removes the topmost node in the tree. This is also the first element in the array.
     *
     * Removing an item creates a hole on top that need to be filled. For this we just copy the last element in the
     * array and trickle it down to its correct position.
     */
    private Node remove(){
        heapArray[0] = heapArray[--currentSize];
        trickleDown(heapArray[0]);
        return heapArray[0];
    }

    private void trickleDown(Node root) {
        
    }

}

class Node {
    /*
    *   This can be data or the key to the data. While prioritizing we prioritize the items using their keys.
    *   If this is data it will get sorted using its value that is key itself, if its an object it will get sorted
    *   using this key.
    * */
    private int key;

    Node(int key){
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}