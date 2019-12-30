package com.vav.Reference.Leetcode.JetSetRun.Easy;


import java.util.ArrayDeque;
import java.util.Queue;

public class SameTree_100 {

    class Solution {

        /**
         *     1.  We need to find out if two trees are same.
         *     2.  To solve these problems we can use one of the traversal algorithms and keep searching both the trees.
         *     3.  We usually add first node to Queue or Stack before iteration. So we need to put a check for these first values
         *         because there is no meaning to go further if first values are nit same.
         *     4.  We will pop elements from stack or queue and keep checking if both values are same, if not same then return false
         *     5.  When we add items to queue we dont mark them with left or right. In this case we have to insert a null item
         *         if left child is null and there is only right child. This way while popping from the queue we can
         *         be sure we are comparing correct child.
         *     6.  We need to make sure every iteration if one of the queue is empy then other should be as well.
         *
         * @param p
         * @param q
         * @return
         */
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
