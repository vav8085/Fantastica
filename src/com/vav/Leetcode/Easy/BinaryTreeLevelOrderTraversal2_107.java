package com.vav.Leetcode.Easy;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;
import com.vav.karumanchi.Trees_06.Q10_HeightOfBinaryTree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal2_107 {

    public static List<List<Integer>> levelOrderInReverse(IntegerBinaryTreeNode root) {

        List<List<Integer>> listOfList = new ArrayList<>();
        Integer DUMMY_DATA = -9999;
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        Stack<IntegerBinaryTreeNode> stack = new Stack<>();
        IntegerBinaryTreeNode dummyNode = new IntegerBinaryTreeNode();
        dummyNode.setData(DUMMY_DATA);

        queue.add(root);
        queue.add(dummyNode);

        while (!queue.isEmpty()) {
            IntegerBinaryTreeNode current = queue.remove();
            stack.push(current);
            if (current.getData() == DUMMY_DATA) {
                if (queue.isEmpty() && current.getLeftNode() == null && current.getRightNode() == null) {
                    break;
                }
                queue.add(dummyNode);
            } else {
                if (current.getLeftNode() != null) {
                    queue.add(current.getLeftNode());
                }
                if (current.getRightNode() != null) {
                    queue.add(current.getRightNode());
                }
            }
        }
        stack.pop();
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            IntegerBinaryTreeNode current = stack.pop();
            if (current.getData() == DUMMY_DATA) {
                listOfList.add(list);
                list = new ArrayList<>();
            } else {
                list.add(current.getData());
            }
        }
        listOfList.add(list);
        return listOfList;
    }

    public static void levelOrderReverseRecursive(IntegerBinaryTreeNode root) {
        if (root == null) {
            return;
        }
        int height = Q10_HeightOfBinaryTree.heightOfBinaryTree(root);
        for (int level = 1; level > 0; level--) {
            printLevel(level, root);
        }
    }

    private static void printLevel(int level, IntegerBinaryTreeNode root) {
        if (level == 1) {
            System.out.print(root.getData() + " ");
        } else {
            printLevel(level - 1, root.getLeftNode());
            printLevel(level - 1, root.getRightNode());
        }
    }

    public static void main(String arg[]) {
        IntegerBinaryTree tree = new IntegerBinaryTree();
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);
        tree.insert(18);
        tree.insert(20);
        tree.insert(5);
        tree.insert(11);
        tree.insert(25);
        tree.insert(44);
        levelOrderReverseRecursive(tree.getRoot());
    }
}
