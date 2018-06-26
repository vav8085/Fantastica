package com.vav.Leetcode.Easy;


import java.util.ArrayDeque;
import java.util.Queue;

public class SameTree_100 {

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            TreeNode nullNode = new TreeNode(9999);
            //nullNode.val = ;
            Queue<TreeNode> queueA = new ArrayDeque();
            Queue<TreeNode> queueB = new ArrayDeque();
            if (p == null && q != null) {
                return false;
            }
            if (p != null && q == null) {
                return false;
            }
            if (p == null && q == null) {
                return true;
            }
            queueA.add(p);
            queueB.add(q);

            while (!queueA.isEmpty() && !queueB.isEmpty()) {
                if (queueA.isEmpty() && !queueB.isEmpty()) {
                    return false;
                }
                if (queueB.isEmpty() && !queueA.isEmpty()) {
                    return false;
                }
                TreeNode currentA = queueA.remove();
                TreeNode currentB = queueB.remove();

                if (currentA.val != currentB.val) {
                    return false;
                }
                if (currentA.left != null) {
                    queueA.add(currentA.left);
                }
                if (currentA.right != null) {
                    if (currentA.left == null) {
                        queueA.add(nullNode);
                    }
                    queueA.add(currentA.right);
                }
                if (currentB.left != null) {
                    queueB.add(currentB.left);
                }
                if (currentB.right != null) {
                    if (currentB.left == null) {
                        queueB.add(nullNode);
                    }
                    queueB.add(currentB.right);
                }

            }
            return true;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
