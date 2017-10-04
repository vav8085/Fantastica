package com.vav.Common.Trees.BinaryTrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Vaibhav on 9/24/2017.
 */
public class IntegerBinaryTree {
    private IntegerBinaryTreeNode root;

    public IntegerBinaryTreeNode getRoot() {
        return root;
    }

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
    public void inorder(IntegerBinaryTreeNode root){
        if(root!=null){
            inorder(root.getLeftNode());
            System.out.println(root.getData());
            inorder(root.getRightNode());
        }
    }
    /*
        1.  Create a stack
        2.  keep pushing the elements to the stack until you reach null
        3.  now pop an element from the stack, print it and check if it has a right node
        4.  if not then pop another element from the stack, print it and check if it has a right node
        5.  If right node is found then make it root and push it and all left nodes to the stack
        6.  while loop will keep following the steps 3,4 and 5

     */
    public void inorderIterative(IntegerBinaryTreeNode root){
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        while(root!=null){
            stack.push(root);
            root = root.getLeftNode();
        }
        while(!stack.isEmpty()){
            root = stack.pop();
            System.out.println(root.getData());
            if(root.getRightNode()!=null){
                root = root.getRightNode();
                while(root!=null){
                    stack.push(root);
                    root = root.getLeftNode();
                }
            }
        }
    }
    public void postOrder(IntegerBinaryTreeNode root){
        if(root!=null){
            postOrder(root.getLeftNode());
            postOrder(root.getRightNode());
            System.out.println(root);
        }
    }

    public void postOrderIterative2Stack(IntegerBinaryTreeNode root){
        Stack<IntegerBinaryTreeNode> stack1 = new Stack<>();
        Stack<IntegerBinaryTreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            IntegerBinaryTreeNode temp = stack1.pop();
            stack2.push(temp);
            if(temp.getLeftNode()!=null){
                stack1.push(temp.getLeftNode());
            }
            if(temp.getRightNode()!=null){
                stack1.push(temp.getRightNode());
            }
        }
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop().getData());

        }
    }
    public void levelOrderTraversal(IntegerBinaryTreeNode root){
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            IntegerBinaryTreeNode temp  = queue.remove();
            System.out.println(temp.getData());
            if(temp.getLeftNode()!=null){
                queue.add(temp.getLeftNode());
            }
            if(temp.getRightNode()!=null){
                queue.add(temp.getRightNode());
            }
        }
    }

    public void find(int id){

    }
    public void delete(int id){

    }
    public void insert(int id){
        IntegerBinaryTreeNode node = new IntegerBinaryTreeNode();
        node.setData(id);
        if(root==null){
            root = node;
            return;
        }
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            IntegerBinaryTreeNode temp  = queue.remove();
            if(temp.getLeftNode()!=null){
                queue.add(temp.getLeftNode());
            }else {
                temp.setLeftNode(node);
                break;
            }
            if(temp.getRightNode()!=null){
                queue.add(temp.getRightNode());
            }else {
                temp.setRightNode(node);
                break;
            }
        }
    }
}
