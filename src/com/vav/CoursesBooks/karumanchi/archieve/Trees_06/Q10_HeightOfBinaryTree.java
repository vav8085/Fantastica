package com.vav.CoursesBooks.karumanchi.archieve.Trees_06;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

/**
 * Created by vaibhav on 10/11/17.
 */
public class Q10_HeightOfBinaryTree {
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
        System.out.print(heightOfBinaryTree(tree.getRoot()));
    }
    public static int heightOfBinaryTree(IntegerBinaryTreeNode root){
        if(root==null){
            return 0;
        }else {
            int leftHeight = heightOfBinaryTree(root.getLeftNode());
            int rightHeight = heightOfBinaryTree(root.getRightNode());
            if(leftHeight>rightHeight){
                return leftHeight+1;
            }else return rightHeight+1;
        }
    }
}
