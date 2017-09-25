package com.vav.Common.Trees.BinaryTrees;

/**
 * Created by Vaibhav on 9/24/2017.
 */
public class IntegerBinaryTree {
    private IntegerBinaryTreeNode root;

    public int maxNode(){

        return -99999;
    }

    public void preorder(IntegerBinaryTreeNode root){
        if(root!=null) {
            System.out.println(root.getData());
            preorder(root.getLeftNode());
            preorder(root.getRightNode());
        }

    }

    public void find(int id){

    }
    public void delete(int id){

    }
    public void insert( int id){

    }
}
