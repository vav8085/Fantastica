package com.vav.karumanchi.Trees_06;

import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Vaibhav on 10/24/17.
 */
public class Q15_DeleteANodeFromBinaryTree {
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
//        tree.insert(90);
//        tree.insert(57);
//        tree.insert(58);
//        tree.insert(59);
//        tree.insert(60);
//        tree.insert(600);
        tree.levelOrderTraversal(deleteaNodeFromBinaryTree(tree.getRoot(), 20));

    }

    /**
     * The issue here is that we have to delete a node by setting its parents left or right node to null. We cant just make the
     * node itself to null because that will just point that reference to null
     *
     * Below solution just swaps the node with the last node but does not delete the last node. we have to run another level order traversal to
     * find the parent of the last node and then delete it.
     * Complexity O(n^2)
     * @param root
     * @param nodeValueToDelete
     * @return
     */
    private static IntegerBinaryTreeNode deleteaNodeFromBinaryTree(IntegerBinaryTreeNode root, int nodeValueToDelete) {
        Queue<IntegerBinaryTreeNode> queue = new ArrayDeque<>();
        IntegerBinaryTreeNode nodeToDelete=null;
        queue.add(root);
        while (!queue.isEmpty()){
            IntegerBinaryTreeNode temp = queue.poll();
            if(temp.getData()==nodeValueToDelete){
                nodeToDelete = temp;
            }
            if(queue.isEmpty()&&temp.getRightNode()==null&&temp.getLeftNode()==null){
                if(nodeToDelete!=null)
                    deleteLastChild(root,temp);
                //Here run another level order traversal and find whose child is temp and then delete it.
                nodeToDelete.setData(temp.getData());
                return root;
            }
            if(temp.getLeftNode()!=null){
                queue.add(temp.getLeftNode());
            }
            if(temp.getRightNode()!=null){
                queue.add(temp.getRightNode());
            }
        }
        return root;
    }

    private static void deleteLastChild(IntegerBinaryTreeNode root, IntegerBinaryTreeNode lastChild){
        Queue<IntegerBinaryTreeNode> queue1 = new ArrayDeque<>();
        queue1.add(root);
        while (!queue1.isEmpty()){
            IntegerBinaryTreeNode temp1 = queue1.poll();
            if (temp1.getLeftNode().getData()==lastChild.getData()){
                temp1.setLeftNode(null);
                return;
            }
            if(temp1.getRightNode().getData()==lastChild.getData()){
                temp1.setRightNode(null);
                return;
            }
            if(temp1.getLeftNode()!=null){
                queue1.add(temp1.getLeftNode());
            }
            if(temp1.getRightNode()!=null){
                queue1.add(temp1.getRightNode());
            }

        }
    }
}
