package com.vav.Archive.karumanchi.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindMaximumElement_01_02 {

    public static void main(String arg[]){
       IntegerBinaryTree integerBinaryTree = new IntegerBinaryTree();
       integerBinaryTree.insert(5);
       integerBinaryTree.insert(4);
       integerBinaryTree.insert(9);
       integerBinaryTree.insert(2);
       integerBinaryTree.insert(6);
       integerBinaryTree.insert(8);
       System.out.println(findMaximumElementRec(integerBinaryTree.getRoot()));

    }
    public static int findMaximumElement(IntegerBinaryTreeNode root){
        Queue<IntegerBinaryTreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        int maxElement= root.getData();
        while(!nodeQueue.isEmpty()){
            IntegerBinaryTreeNode current = nodeQueue.remove();
            if(current.getData()>maxElement){
                maxElement = current.getData();
            }
            if(current.getLeftNode()!=null){
                nodeQueue.add(current.getLeftNode());
            }
            if(current.getRightNode()!=null){
                nodeQueue.add(current.getRightNode());
            }
        }
        return maxElement;
    }
    public static int findMaximumElementRec(IntegerBinaryTreeNode root){
        if(root==null){
            return 0;
        }
        int maxLeft = findMaximumElementRec(root.getLeftNode());
        int maxRight = findMaximumElementRec(root.getRightNode());

        return Integer.max(Integer.max(maxLeft, maxRight),root.getData());
    }
}
