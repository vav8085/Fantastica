package com.vav.CoursesBooks.karumanchi.Trees_06;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Stack;

public class BinaryTreeSearch_03_04 {
    public static void main(String arg[]){
        IntegerBinaryTree integerBinaryTree = new IntegerBinaryTree();
        integerBinaryTree.insert(5);
        integerBinaryTree.insert(4);
        integerBinaryTree.insert(9);
        integerBinaryTree.insert(2);
        integerBinaryTree.insert(6);
        integerBinaryTree.insert(8);
        System.out.println(binaryTreeSearchInOrder(8, integerBinaryTree.getRoot()));
    }
    public static boolean binaryTreeSearch(int value, IntegerBinaryTreeNode root){
        if(root==null){
            return false;
        }
        if(root.getData()==value){
            return true;
        }
        return binaryTreeSearch(value, root.getLeftNode()) || binaryTreeSearch(value, root.getRightNode());
    }

    public static boolean binaryTreeSearchInOrder(int value, IntegerBinaryTreeNode root){
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        while (root!=null){
            stack.push(root);
            root = root.getLeftNode();
        }
        while (!stack.isEmpty()){
           IntegerBinaryTreeNode current = stack.pop();
           if(current.getData()==value){
               return true;
           }
           if(current.getRightNode()!=null){
               current = current.getRightNode();
               while (current!=null){
                   stack.push(current);
                   current = current.getLeftNode();
               }
           }
        }
        return false;
    }
}
