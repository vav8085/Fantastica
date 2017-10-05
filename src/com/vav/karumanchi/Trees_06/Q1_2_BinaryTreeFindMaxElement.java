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
public class Q1_2_BinaryTreeFindMaxElement {
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
        System.out.println("-------PRE ORDER------");
        tree.preorder(tree.getRoot());
        System.out.println("-------IN ORDER------");
        tree.inorder(tree.getRoot());
        System.out.println("-------POST ORDER------");
        tree.postOrder(tree.getRoot());
        System.out.println("-------LVL ORDER------");
        tree.levelOrderTraversal(tree.getRoot());
        System.out.println("-------MAX------");
        System.out.println(findMaxRecursive(tree.getRoot()));

    }

    /**
     * 1.   The concept is simple, just do any traversal and parse through all nodes to find the max.
     *
     * @param root
     * @return
     */
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

    /**
     * 1.   The concept of finding the max value is by traversing the tree and finding the max value in left subtree
     *      and max in right subtree
     * 2.   After getting these values we need to compare the left max to right max and then the bigger vlue to the root.
     * */

    public static int findMaxRecursive(IntegerBinaryTreeNode root){
        int root_val, left_val, right_val, max_val = Integer.MIN_VALUE;
        if(root!=null){
            root_val = root.getData();
            left_val = findMaxRecursive(root.getLeftNode());
            right_val = findMaxRecursive(root.getRightNode());

            if(left_val >=right_val){
                max_val = left_val;
            }else max_val = right_val;

            if(max_val>=root_val){
                max_val = max_val;
            }else {
                max_val = root_val;
            }
            return max_val;
        }
        return max_val;
    }

}
