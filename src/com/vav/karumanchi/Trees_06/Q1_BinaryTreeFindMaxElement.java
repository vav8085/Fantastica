package com.vav.karumanchi.Trees_06;

import com.vav.Common.Trees.BinaryTrees.*;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Vaibhav on 10/4/17.
 *
 * To find the max element in the binary tree
 *
 * 1.   Because we do not have a BST we have to parse all nodes and save the max element found every time in a variable
 * 2.   We can go preorder and
 */
public class Q1_BinaryTreeFindMaxElement {
    static IntegerBinaryTree tree;

    public static void main(String arg[]){
        tree = new IntegerBinaryTree();
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);
        tree.insert(18);
        tree.insert(20);
        tree.insert(5);
        tree.insert(11);
        tree.insert(25);
        tree.preorder(tree.getRoot());
        System.out.println("-------MAX------");
        System.out.println(findMaxIterative(tree.getRoot()));

    }
    public static int findMaxIterative(IntegerBinaryTreeNode root){
        int max = root.getData();
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            IntegerBinaryTreeNode temp;
            temp = stack.pop();
            if(temp.getData()>=max){
                max = temp.getData();
            }
            if(temp.getRightNode()!=null){
                stack.push(temp.getRightNode());
            }
            if(temp.getLeftNode()!=null){
                stack.push(temp.getLeftNode());
            }
        }

        return max;
    }

}
