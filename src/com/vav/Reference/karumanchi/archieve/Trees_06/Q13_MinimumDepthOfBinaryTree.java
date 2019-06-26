package com.vav.Reference.karumanchi.archieve.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Vaibhav on 10/24/17.
 */
public class Q13_MinimumDepthOfBinaryTree {
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
//        tree.insert(78);
//        tree.insert(79);
//        tree.insert(90);
//        tree.insert(57);
//        tree.insert(58);
//        tree.insert(59);
//        tree.insert(60);
//        tree.insert(600);

        System.out.print(minimumDepthOfBinaryTree(tree.getRoot()));
    }

    private static int minimumDepthOfBinaryTree(IntegerBinaryTreeNode root) {
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        final int DUMMY_DATA = 999999;
        int height = 0;
        IntegerBinaryTreeNode dummy = new IntegerBinaryTreeNode();
        dummy.setData(DUMMY_DATA);
        queue.add(root);
        queue.add(dummy);
        if(root!=null)
            height = 1;
        else return height;

        while (!queue.isEmpty()){
            IntegerBinaryTreeNode temp = queue.poll();
            if(temp.getData()==DUMMY_DATA && !queue.isEmpty()) {
                queue.add(dummy);
                height++;
            }else{
                if(temp.getData()!=DUMMY_DATA&&temp.getLeftNode()==null && temp.getRightNode()==null){
                    return height;
                }
                if (temp.getLeftNode()!=null){
                    queue.add(temp.getLeftNode());
                }
                if (temp.getRightNode()!=null){
                    queue.add(temp.getRightNode());
                }
            }
        }

        return height;
    }
}
