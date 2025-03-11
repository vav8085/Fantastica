package com.vav.Archive.karumanchi.archieve.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Vaibhav on 10/5/17.
 */
public class Q6_SizeOfBinaryTree {
    static IntegerBinaryTree tree;

    public static void main(String arg[]) {
        tree = new IntegerBinaryTree();
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);
        System.out.println(sizeOfABinaryTreeIterative(tree.getRoot()));
        tree.insert(18);
        tree.insert(20);
        tree.insert(5);
        tree.insert(11);
        tree.insert(25);
        tree.insert(44);
        System.out.println(count(tree.getRoot()));

    }

    /**
     * 1.   We can solve this problem by simple level order traversal and keeping a variable to add size every time we
     *      traverse a node
     * @param root
     */
    public static int sizeOfABinaryTreeIterative(IntegerBinaryTreeNode root){
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        int count =0;
        queue.add(root);
        while(!queue.isEmpty()){
            count++;
            IntegerBinaryTreeNode temp = queue.remove();
            if(temp.getLeftNode()!=null){
                queue.add(temp.getLeftNode());
            }
            if(temp.getRightNode()!=null){
                queue.add(temp.getRightNode());
            }
        }
        return count;
    }

    /**
     * Recursive
     */

    public static int count(IntegerBinaryTreeNode root){
        if(root!=null){
            int leftCount = count(root.getLeftNode());
            int rightCount = count(root.getRightNode());
            return 1+ leftCount + rightCount;
        }else return 0;
    }


}
