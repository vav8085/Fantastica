package com.vav.CoursesBooks.karumanchi.Trees_06;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Vaibhav on 10/6/17.
 */
public class Q8_DeletingTheTree {
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
        System.out.println("-----Deleting started------");
        deleteTreeIteratively(tree.getRoot());
        System.out.println("-----Preorder------");
        tree.preorder(tree.getRoot());


    }

    /**
     * 1.   To delete a binary tree we traverse it using post order and we keep assigning null to the root
     * 2.   We use post order because in this type of traversal we process the children nodes before the root node.
     * @param root
     */
    public static void deleteTreeRecursive(IntegerBinaryTreeNode root){
        if(root!=null){
            deleteTreeRecursive(root.getLeftNode());
            deleteTreeRecursive(root.getRightNode());
            System.out.println("Deleted node:"+root.getData());
            root = null;
        }
    }

    /**
     * 1.   We can do this using level order traversal, we can delete all the root nodes after saving their chaldren to the queue.
     *
     * @param root
     */
    public static void deleteTreeIteratively(IntegerBinaryTreeNode root){
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            IntegerBinaryTreeNode temp = queue.poll();
            if(temp.getLeftNode()!=null){
                queue.add(temp.getLeftNode());
            }
            if(temp.getRightNode()!=null){
                queue.add(temp.getRightNode());
            }
            System.out.println(temp.getData());
            temp = null;
        }

    }
}
