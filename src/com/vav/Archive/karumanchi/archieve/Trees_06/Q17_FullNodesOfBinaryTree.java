package com.vav.Archive.karumanchi.archieve.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.Stack;

/**
 * Created by Vaibhav on 10/26/17.
 */
public class Q17_FullNodesOfBinaryTree {
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
        printFullNodes(tree.getRoot());
    }

    private static void printFullNodes(IntegerBinaryTreeNode root) {
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        while(root!=null){
            stack.push(root);
            root=root.getLeftNode();
        }
        while (!stack.isEmpty()){
            IntegerBinaryTreeNode temp = stack.pop();
            if(temp.getLeftNode()!=null&& temp.getRightNode()!=null){
                System.out.println(temp.getData());
            }
            if(temp.getRightNode()!=null){
                root = temp.getRightNode();
                while(root!=null){
                    stack.push(root);
                    root=root.getLeftNode();
                }
            }
        }
    }
}
