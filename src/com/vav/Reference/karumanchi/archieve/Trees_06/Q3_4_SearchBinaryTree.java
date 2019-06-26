package com.vav.Reference.karumanchi.archieve.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.Stack;

/**
 * Created by Vaibhav on 10/5/17.
 */
public class Q3_4_SearchBinaryTree {
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
        System.out.println(searchBinaryTreeIterative(tree.getRoot(),99));
    }

    public static boolean searchBinaryTreeRecursive(IntegerBinaryTreeNode root, int value){
        boolean found = false, foundLeft = false, foundRight = false;
        if(root!=null){
            if(root.getData()==value){
                found = true;
            }
            foundLeft = searchBinaryTreeRecursive(root.getLeftNode(),value);
            foundRight = searchBinaryTreeRecursive(root.getRightNode(),value);
        }
        return found || foundLeft || foundRight;
    }

    /**
     * Lets use in order traversal this time
     * @param root
     * @param value
     * @return
     */
    public static boolean searchBinaryTreeIterative(IntegerBinaryTreeNode root, int value){
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        while(root!=null){
            stack.push(root);
            root = root.getLeftNode();
        }
        while (!stack.isEmpty()){
            root = stack.pop();
            if(root.getData() == value){
                return true;
            }
            if(root.getRightNode()!=null){
                root = root.getRightNode();
                while(root!=null){
                    stack.push(root);
                    root = root.getLeftNode();
                }
            }
        }

        return false;
    }
}
