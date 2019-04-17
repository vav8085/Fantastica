package com.vav.Revision.Revision1.rBinarySearchTrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class rBinarySearchTree {
    private rNode root;

    public void insert(rNode node){
        rNode current = root;
        while(current!=null){
           if(node.getData() < current.getData()){
               if(current.getLeft()==null){
                   current.setLeft(node);
                   return;
               }else{
                   current = current.getLeft();
               }
           }else{
               if(current.getRight()==null){
                   current.setRight(node);
                   return;
               }else{
                   current = current.getRight();
               }
           }
        }
    }
    public boolean search(char value, rNode root){
        while(root!=null){
            if(root.getData()<value){
                root = root.getLeft();
            }else if(root.getData()>value){
                root = root.getRight();
            }else{
                return true;
            }
        }
        return false;
    }
    public void delete(int value){
        //First search the node to be deleted
        rNode previous = null;
        boolean isLeftChild = false;
        while(root!=null){
            if(root.getData()==value){
                break;
            }
            if(root.getData() < value){
                previous = root;
                root = root.getLeft();
                isLeftChild = true;
            }else if(root.getData() > value){
                previous = root;
                root = root.getRight();
                isLeftChild = false;
            }
        }
        if(root.getLeft()!=null && root.getRight()==null){
            if(isLeftChild){
                previous.setLeft(root.getLeft());
            }else{
                previous.setRight(root.getLeft());
            }
        }else if(root.getLeft()==null && root.getRight()!=null){
            if(isLeftChild){
                previous.setLeft(root.getRight());
            }else{
                previous.setRight(root.getRight());
            }
        }else{
            //both are present
            //go to right of root and then find the leftmost child
            //replace the root with this child
            //set left not of parent of 
        }
    }

    public void preorder(rNode root){
        Stack<rNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            rNode current = stack.pop();
            System.out.println(current.getData());
            if(current.getRight()!=null){
                stack.push(current.getRight());
            }
            if(current.getLeft()!=null){
                stack.push(current.getLeft());
            }
        }
    }
    public void inorder(rNode root){
        Stack<rNode> stack = new Stack<>();

            while (root!=null){
                stack.push(root);
                root = root.getLeft();
            }
            while (!stack.isEmpty()){
            rNode current = stack.pop();
            System.out.println(current.getData());
            if(current.getRight()!=null){
                current = current.getRight();
                while (current!=null){
                    stack.push(current);
                    current = current.getLeft();
                }
            }

        }
    }
    public void postOrder(rNode root){
        Stack<rNode> stackA = new Stack<>();
        Stack<rNode> stackB = new Stack<>();
        stackA.push(root);

        while (!stackA.isEmpty()){
            rNode temp = stackA.pop();
            stackB.push(temp);
            if(temp.getLeft()!=null){
                stackA.push(temp.getLeft());
            }
            if(temp.getRight()!=null){
                stackA.push(temp.getRight());
            }
        }
        while (!stackB.isEmpty()){
            System.out.println(stackB.pop().getData());
        }
    }
    public void levelOrder(rNode root){
        Queue<rNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            rNode temp = queue.remove();
            System.out.println(temp.getData());
            if(temp.getLeft()!=null){
                queue.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                queue.add(temp.getRight());
            }
        }
    }
}

class rNode{
    private int data;
    private rNode left;
    private rNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public rNode getLeft() {
        return left;
    }

    public void setLeft(rNode left) {
        this.left = left;
    }

    public rNode getRight() {
        return right;
    }

    public void setRight(rNode right) {
        this.right = right;
    }
}
