package com.vav.Algorithms.Common.Trees.BinaryTrees;

/**
 * Created by Vaibhav on 9/24/2017.
 */
public class IntegerBinaryTreeApp {
    public static void main(String arg[]){
        IntegerBinaryTree integerBinaryTree = new IntegerBinaryTree();
        integerBinaryTree.insert(10);
        integerBinaryTree.insert(4);
        integerBinaryTree.insert(15);
        integerBinaryTree.insert(2);
        integerBinaryTree.insert(7);
        integerBinaryTree.insert(13);
        integerBinaryTree.insert(20);

        System.out.print(integerBinaryTree.find(14, integerBinaryTree.getRoot()));

    }
}
