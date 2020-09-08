package com.vav.Reference.Leetcode.archive.JetSetRun.Easy;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumDepthBinaryTree_104 {

    /**
     * 1.   To solve this problem we have to go level order and count the number of levels
     * 2.   Counting the number of levels of a binary tree can be done by adding a dummy node at the end of every level
     * 3.   Whenever we will get this dummy node we will assume that we have parsed all the nodes of that level and we will
     *      another dummy node at the end of the queue.
     * 4.   We can keep doing this infinitely but sometime while parsing we have to find out that we have reached the end
     *      this will happen only when the last node is a dummy node, and leftNode and right node of the dummy node are both nulls
     * @param root
     * @return
     */
    public static int maximumDepth(IntegerBinaryTreeNode root){
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque();
        final int DUMMY_DATA = -9999;
        IntegerBinaryTreeNode dummyNode = new IntegerBinaryTreeNode();
        dummyNode.setData(DUMMY_DATA);
        int count = 1;
        queue.add(root);
        queue.add(dummyNode);
        while(!queue.isEmpty()){
            IntegerBinaryTreeNode currentNode = queue.remove();
            if(currentNode.getData()==DUMMY_DATA){
                if(queue.isEmpty() && currentNode.getLeftNode()==null && currentNode.getRightNode() ==null){
                    return count;
                }
                count++;
                queue.add(dummyNode);
            }else{
                if(currentNode.getLeftNode()!=null){
                    queue.add(currentNode.getLeftNode());
                }
                if(currentNode.getRightNode()!=null){
                    queue.add(currentNode.getRightNode());
                }
            }
        }
        return count;
    }
    public static void main(String arg[]){

        IntegerBinaryTree tree = new IntegerBinaryTree();
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);
        tree.insert(18);
        tree.insert(20);
        tree.insert(5);
        tree.insert(11);
        tree.insert(25);
        tree.insert(44);
        System.out.println(maximumDepth(tree.getRoot()));
    }
}
