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
            preOrderRecursive(root.getLeft());
            preOrderRecursive(root.getRight());
        }

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
    public void preOrderLoopOld(BinaryTreeNodeKaru root){
        if (root==null){
            return;
        }
        Stack<BinaryTreeNodeKaru> stack = new Stack<>();
        while(true){
            while(root!=null){
                stack.push(root);
                System.out.println(root.getData());
                root=root.getLeft();
            }
            BinaryTreeNodeKaru temp =stack.pop();
            if(stack.isEmpty()){
                break;
            }
            root=temp.getRight();

        }
    }
    public void inorderRecursive(BinaryTreeNodeKaru root){
        if(root!=null){
            inorderRecursive(root.getLeft());
            System.out.println(root);
            inorderRecursive(root.getRight());

        }

    }
    public void inOrderLoop(BinaryTreeNodeKaru root){
        if(root==null){
            System.out.println("Empty Tree!");
        }
        Stack<BinaryTreeNodeKaru> stack = new Stack<>();
        while(true){
            while(root!=null){
                stack.push(root);
                root=root.getLeft();
            }
            if(stack.isEmpty()){
                break;
            }
            root=stack.pop();
            System.out.println(root.getData());
            root=root.getRight();
        }
        return;
    }
    public void addLeft(int data){

    }

}
