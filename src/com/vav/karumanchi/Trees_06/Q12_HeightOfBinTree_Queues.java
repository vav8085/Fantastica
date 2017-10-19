package com.vav.karumanchi.Trees_06;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Vaibhav on 10/17/17.
 */
public class Q12_HeightOfBinTree_Queues {
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
        tree.insert(90);
        tree.insert(57);
        tree.insert(58);
        tree.insert(59);
        tree.insert(60);
        tree.insert(600);

        System.out.print(heightOfBinaryTreeUsingQueue(tree.getRoot()));
    }

    private static int heightOfBinaryTreeUsingQueue(IntegerBinaryTreeNode root) {
        Queue queue = new ArrayDeque();
        final int DUMMY_DATA = 999999;
        IntegerBinaryTreeNode trackerNode = new IntegerBinaryTreeNode();
        trackerNode.setData(DUMMY_DATA);
        int height = 1;
        queue.add(root);
        queue.add(trackerNode);
        while (!queue.isEmpty()){
            IntegerBinaryTreeNode temp = (IntegerBinaryTreeNode) queue.remove();
            if(temp.getData()==DUMMY_DATA && !queue.isEmpty()){
                queue.add(trackerNode);
                height = height+1;
            }else{
                if(queue.isEmpty()&&temp.getData()!=DUMMY_DATA&&temp.getLeftNode()==null && temp.getRightNode()==null){
                    return height;
                }
                if(temp.getLeftNode()!=null){
                    queue.add(temp.getLeftNode());
                }
                if(temp.getRightNode()!=null){
                    queue.add(temp.getRightNode());
                }
            }

        }
        return height;
    }

}
