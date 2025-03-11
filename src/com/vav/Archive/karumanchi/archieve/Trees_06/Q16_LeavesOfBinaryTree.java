package com.vav.Archive.karumanchi.archieve.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.Stack;

/**
 * Created by Vaibhav on 10/26/17.
 */
public class Q16_LeavesOfBinaryTree {
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
        tree.insert(91);
        tree.insert(78);
        tree.insert(79);
//        tree.insert(90);
//        tree.insert(57);
//        tree.insert(58);
//        tree.insert(59);
//        tree.insert(60);
//        tree.insert(600);
        printLeaves(tree.getRoot());

    }

    private static void printLeaves(IntegerBinaryTreeNode root) {
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            IntegerBinaryTreeNode temp = stack.pop();
            if(temp.getLeftNode()==null && temp.getRightNode()==null){
                System.out.println(temp.getData());
            }
            if(temp.getRightNode()!=null){
                stack.push(temp.getRightNode());
            }
            if(temp.getLeftNode()!=null){
                stack.push(temp.getLeftNode());
            }
        }
    }
}
