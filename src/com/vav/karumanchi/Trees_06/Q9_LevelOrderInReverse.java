package com.vav.karumanchi.Trees_06;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by vaibhav on 10/11/17.
 */
public class Q9_LevelOrderInReverse {
    static IntegerBinaryTree tree;

    public static void main(String arg[]) {
        tree = new IntegerBinaryTree();
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);
        tree.insert(18);
        tree.insert(20);
        tree.insert(5);
        tree.insert(11);
        tree.insert(25);
        tree.insert(44);
        levelOrderInReverse(tree.getRoot());
    }
    public static void levelOrderInReverse(IntegerBinaryTreeNode root){
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()){
            IntegerBinaryTreeNode temp = queue.poll();
            stack.push(temp);
            if(temp.getLeftNode()!=null){
                queue.add(temp.getLeftNode());
            }
            if(temp.getRightNode()!=null){
                queue.add(temp.getRightNode());
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().getData()+"-");
        }
    }
}
