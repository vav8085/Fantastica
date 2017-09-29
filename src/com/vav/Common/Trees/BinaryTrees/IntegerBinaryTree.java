package com.vav.Common.Trees.BinaryTrees;

import java.util.Stack;

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
    /*
        1.  We first create a stack
        2.  we then push the root element onto the stack
        3.  Now we loop until the stack is empty and pop top element and print it
        4.  We also push the right element first and then the left element. The right element remain at bottom
        5.  For every node we first print it then push its left node and then push its right node
        6.  This way every time the root is prited then its left subtree and then its right subtres
     */
    public void preorderIterative(IntegerBinaryTreeNode root){

        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        stack.push(root);
      while(!stack.isEmpty()){
          IntegerBinaryTreeNode temp = stack.pop();
          System.out.println(temp.getData());
          if(temp.getRightNode()!=null){
              stack.push(temp.getRightNode());
          }
          if(temp.getLeftNode()!=null){
              stack.push(temp.getLeftNode());
          }
      }
    }
    public void find(int id){

    }
    public void delete(int id){

    }
    public void insert( int id){

    }
}
