package com.vav.karumanchi.Trees;

import java.util.*;

/**
 * Created by Vaibhav on 1/23/2017.
 */
public class BinaryTreeKaru {
    BinaryTreeNodeKaru binaryTreeRootKaru;
    int size = 0;
    public BinaryTreeKaru(){
        binaryTreeRootKaru = null;
    }
    public void add(int data){
        BinaryTreeNodeKaru temp = new BinaryTreeNodeKaru(data);
        BinaryTreeNodeKaru current = binaryTreeRootKaru;
        if(current==null){
            binaryTreeRootKaru = temp;
        }else{
            while(true){
                if(data<= current.getData()){
                    if(current.getLeft()!=null) {
                        current = current.getLeft();
                    }
                    else {
                        current.setLeft(temp);
                        break;
                    }

                }else{
                    if(current.getRight()!=null) {
                        current = current.getRight();
                    }
                    else {
                        current.setRight(temp);
                        break;
                    }
                }

            }
        }
    }
    public BinaryTreeNodeKaru getRoot(){
        return binaryTreeRootKaru;
    }

    public void preOrderRecursive(BinaryTreeNodeKaru root){
        if(root!=null){
            System.out.println(root.getData());
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
                root=root.getLeft();
            }
            if(stack.isEmpty()){
                break;
            }
            BinaryTreeNodeKaru temp =stack.pop();
            System.out.println(temp.getData());

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
    /*public void levelOrder(BinaryTreeNodeKaru root){
        BinaryTreeNodeKaru temp ;
        Queue q = new ArrayDeque();
        if(root == null){
            return;
        }
        q.add(root);
        while (!q.isEmpty()){
            temp = (BinaryTreeNodeKaru) q.poll();
            System.out.println(temp.getData());
            if(temp.getLeft()!=null){
                q.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                q.add(temp.getRight());
            }
        }
    }*/
    public void levelOrder(BinaryTreeNodeKaru root){
        BinaryTreeNodeKaru temp ;
        Queue q = new ArrayDeque();
        q.add(root);
        while(!q.isEmpty()){
            temp = (BinaryTreeNodeKaru) q.poll();
            System.out.println(temp.getData());
            if(temp.getLeft()!=null){
                q.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                q.add(temp.getRight());
            }
        }
    }

    //Q1 Max element in tree
    public int maxElement(BinaryTreeNodeKaru root){
        int max = 0,left, right ;
        if(root!=null){
                left =maxElement(root.getLeft());
                right =maxElement(root.getRight());

            if(left>right){
                max = left;
            }else{
                max=right;
            }
            if(root.getData()< max){
                return max;
            }else return root.getData();
        }
        return max;


    }

    public int maxElementIter(BinaryTreeNodeKaru root){
        int max = 0;
        BinaryTreeNodeKaru temp ;
        Queue q = new ArrayDeque();
        q.add(root);
        while(!q.isEmpty()){
            temp = (BinaryTreeNodeKaru) q.poll();
            if(max < temp.getData()){
                max = temp.getData();
            }
            if(temp.getLeft()!=null){
                q.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                q.add(temp.getRight());
            }
        }

        return max;
    }
    public boolean searchElement(BinaryTreeNodeKaru root, int data){
        if(root==null){
            return false;
        }
       if(root.getData()==data){
           return true;
       }else{
           if(searchElement(root.getLeft(),data)){
               return true;
           }else
           return searchElement(root.getRight(),data);
       }
    }
    public boolean searchElementIter(BinaryTreeNodeKaru root, int data){
        BinaryTreeNodeKaru temp;
        Queue q = new ArrayDeque();
        q.add(root);
        while (!q.isEmpty()){
            temp = (BinaryTreeNodeKaru) q.poll();
            if(data == temp.getData()){
                return true;
            }
            if(temp.getLeft()!=null){
                q.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                q.add(temp.getRight());
            }

        }
        return false;
    }
    public int sizeOfTree(BinaryTreeNodeKaru root){
            if(root!=null){
                size++;
                sizeOfTree(root.getLeft());
                sizeOfTree(root.getRight());
            }
     return size;
    }
    public int sizeOfTreeIter(BinaryTreeNodeKaru root){
        if (root==null){
            return 0;
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
            BinaryTreeNodeKaru temp =stack.pop();
            size++;
            root=temp.getRight();

        }
        return size;
    }


}
