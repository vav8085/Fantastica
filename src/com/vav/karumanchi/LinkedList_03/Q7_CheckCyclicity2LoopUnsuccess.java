package com.vav.karumanchi.LinkedList_03;

import com.vav.CTCI.Common.LinkedList.Link;
import com.vav.Common.Trees.BinaryTrees.IntegerBinaryTree;

/**
 * Created by vaibhav on 11/26/17.
 */
public class Q7_CheckCyclicity2LoopUnsuccess {
    public static void main(String arg[]){
        Link<Integer> link1 = new Link<>(1);
        Link<Integer> link2 = new Link<>(2);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link4 = new Link<>(4);
        Link<Integer> link5 = new Link<>(5);
        link1.setNext(link2);
        link2.setNext(link3);
        link3.setNext(link4);
        link4.setNext(link5);
        link5.setNext(link3);
        System.out.println(checkCyclicity(link1));

    }

    /**
     * This method will not work because you will never know when to stop current
     * The method will only work if somehow we start at the node where loop starts.
     * @param root
     * @return
     */

    public static boolean checkCyclicity(Link<Integer> root){
        Link<Integer> current = root;
        while (root!=null){
            while (current!=null){
                if(current.getNext().equals(root)){
                    return true;
                }
                current=current.getNext();
            }
            root= root.getNext();
        }
        return false;
    }
}
