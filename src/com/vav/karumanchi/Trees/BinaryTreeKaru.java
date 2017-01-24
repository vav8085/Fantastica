package com.vav.karumanchi.Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Vaibhav on 1/23/2017.
 */
public class BinaryTreeKaru {
    BinaryTreeNodeKaru binaryTreeRootKaru;

    public BinaryTreeKaru(){
        binaryTreeRootKaru = null;
    }
    public void preOrderRecursive(BinaryTreeNodeKaru root){
        if(root!=null){
            System.out.println(binaryTreeRootKaru.getData());
        }
        preOrderRecursive(root.getLeft());
        preOrderRecursive(root.getRight());
    }
    public ArrayList<Integer> preOrderLoop(BinaryTreeNodeKaru root) {

        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<BinaryTreeNodeKaru> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            BinaryTreeNodeKaru temp = stack.pop();
            res.add(temp.getData());
            if (temp.getRight() != null) {
                stack.push(temp.getRight());
            }
            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }

        return res;
    }
    public void inorderRecursive(BinaryTreeNodeKaru root){
        inorderRecursive(root.getLeft());
        if(root!=null){
            System.out.println(root);
        }
        inorderRecursive(root.getRight());

    }
    public ArrayList<Integer> inOrderLoop(BinaryTreeNodeKaru root){
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

}
