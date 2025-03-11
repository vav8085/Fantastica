package com.vav.Archive.karumanchi.archieve.Trees_06;

import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Algorithms.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

/**
 * Created by vaibhav on 10/26/17.
 */
public class Q19_StructurallyIdenticalTrees {
    static IntegerBinaryTree tree1, tree2;

    public static void main(String arg[]) {
        tree1 = new IntegerBinaryTree();
        tree1.insert(15);
        tree1.insert(12);
        tree1.insert(16);
        tree1.insert(18);
        tree1.insert(20);
        tree1.insert(5);
        tree1.insert(11);
        tree1.insert(91);
        tree1.insert(78);
        tree1.insert(79);
        tree1.insert(90);
        tree1.insert(57);

        tree2 = new IntegerBinaryTree();
        tree2.insert(15);
        tree2.insert(12);
        tree2.insert(16);
        tree2.insert(18);
        tree2.insert(20);
        tree2.insert(5);
        tree2.insert(11);
        tree2.insert(91);
        tree2.insert(78);
        tree2.insert(79);
        tree2.insert(90);
        //tree2.insert(57);

        System.out.print(areStructurallyIdentical(tree1.getRoot(),tree2.getRoot()));
    }

    /**
     * A binary tree is structurally identical to another binary tree if the nodes are same and
     *  the arrangement of the children is same
     * @param root1
     * @param root2
     */
    private static boolean areStructurallyIdentical(IntegerBinaryTreeNode root1, IntegerBinaryTreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return root1.getData() == root2.getData() &&
                    areStructurallyIdentical(root1.getLeftNode(), root2.getLeftNode()) &&
                    areStructurallyIdentical(root1.getRightNode(), root2.getRightNode());
        }
        return false;

    }
}
