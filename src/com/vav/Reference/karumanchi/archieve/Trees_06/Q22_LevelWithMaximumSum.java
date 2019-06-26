package com.vav.Reference.karumanchi.archieve.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Vaibhav on 11/14/17.
 */
public class Q22_LevelWithMaximumSum {
    static IntegerBinaryTree tree;

    public static void main(String arg[]) {
        tree = new IntegerBinaryTree();
        tree.insert(10);
        tree.insert(2);
        tree.insert(4);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(1);
        tree.insert(15);

        System.out.print(levelWithMaximumSum(tree.getRoot()));
    }

    private static int levelWithMaximumSum(IntegerBinaryTreeNode root) {
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        final int DUMMY_VALUE = -99999;
        IntegerBinaryTreeNode dummyNode = new IntegerBinaryTreeNode();
        dummyNode.setData(DUMMY_VALUE);
        int maxSum=0;
        int currentSum=0;
        int level = 0;
        int levelMax=0;

        queue.add(root);
        queue.add(dummyNode);
        maxSum= root.getData();
        while (!queue.isEmpty()){
            IntegerBinaryTreeNode temp = queue.poll();
            if(temp.getData()==DUMMY_VALUE && !queue.isEmpty()){
                queue.add(dummyNode);
                level++;
                if(currentSum>=maxSum){
                    maxSum = currentSum;
                    levelMax = level;
                }
                currentSum=0;
            }else{
                if(temp.getLeftNode()!=null){
                    queue.add(temp.getLeftNode());
                    currentSum = currentSum + temp.getLeftNode().getData();
                }
                if(temp.getRightNode()!=null){
                    queue.add(temp.getRightNode());
                    currentSum = currentSum + temp.getRightNode().getData();
                }
            }

        }

        return levelMax;
    }
}
