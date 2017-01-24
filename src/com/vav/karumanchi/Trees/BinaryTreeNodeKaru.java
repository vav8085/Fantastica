package com.vav.karumanchi.Trees;

/**
 * Created by Vaibhav on 1/23/2017.
 */
public class BinaryTreeNodeKaru {

    private int data;
    private BinaryTreeNodeKaru left, right;

    public BinaryTreeNodeKaru(int data){
        this.data=data;
        left=right=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNodeKaru getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNodeKaru left) {
        this.left = left;
    }

    public BinaryTreeNodeKaru getRight() {
        return right;
    }

    public void setRight(BinaryTreeNodeKaru right) {
        this.right = right;
    }

}
