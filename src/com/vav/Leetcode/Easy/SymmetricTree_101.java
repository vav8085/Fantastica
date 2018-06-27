package com.vav.Leetcode.Easy;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class SymmetricTree_101 {
    public static final int DATA = -9999;

    /**
     * For a tree to be symmetric every level in its level order traversal should be a palindrome
     * <p>
     * We can do this by changing the queue to an array for each level and then verifying a palindrome
     * but that will increase the time complexity because the queue to array is O(n)
     *
     * @param root
     * @return
     */
    public static boolean symmetricTree(IntegerBinaryTreeNode root) {
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque();
        queue.add(root.getLeftNode());
        queue.add(root.getRightNode());
        while (!queue.isEmpty()) {
            IntegerBinaryTreeNode currentLeft = queue.remove();
            IntegerBinaryTreeNode currentRight = queue.remove();
            if (currentLeft == null && currentRight == null) {
                continue;
            }
            if ((currentLeft == null && currentRight != null) || (currentLeft != null && currentRight == null)) {
                return false;
            }
            if (currentLeft.getData() != currentRight.getData()) {
                return false;
            }
            if (currentLeft.getLeftNode() != null)
                queue.add(currentLeft.getLeftNode());
            if (currentLeft.getRightNode() != null)
                queue.add(currentRight.getRightNode());
            if (currentRight.getLeftNode() != null)
                queue.add(currentLeft.getRightNode());
            if (currentRight.getRightNode() != null)
                queue.add(currentRight.getLeftNode());
        }
        return true;
    }

    public static void main(String arg[]) {
        IntegerBinaryTreeNode root = new IntegerBinaryTreeNode();
        root.setData(7);
        IntegerBinaryTreeNode leftNode = new IntegerBinaryTreeNode();
        leftNode.setData(4);
        IntegerBinaryTreeNode rightNode = new IntegerBinaryTreeNode();
        rightNode.setData(4);

        IntegerBinaryTreeNode leftLeftNode = new IntegerBinaryTreeNode();
        IntegerBinaryTreeNode leftRightNode = new IntegerBinaryTreeNode();
        IntegerBinaryTreeNode rightLeftNode = new IntegerBinaryTreeNode();
        IntegerBinaryTreeNode rightRightNode = new IntegerBinaryTreeNode();

        leftLeftNode.setData(10);
        leftRightNode.setData(5);
        rightLeftNode.setData(5);
        rightRightNode.setData(10);

        root.setLeftNode(leftNode);
        root.setRightNode(rightNode);

        leftNode.setLeftNode(leftLeftNode);
        leftNode.setRightNode(leftRightNode);
        rightNode.setLeftNode(rightLeftNode);
        rightNode.setRightNode(rightRightNode);

        System.out.print(symmetricTree(root));


    }
}
