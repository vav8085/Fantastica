package com.vav.karumanchi.Trees;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Vaibhav on 1/29/2017.
 */
public class BinaryTreeKaruMain {
    public static void main(String arg[]){
        BinaryTreeKaru treeKaru = new BinaryTreeKaru();
        treeKaru.add(10);
        treeKaru.add(8);
        treeKaru.add(9);
        treeKaru.add(7);
        treeKaru.add(11);
        treeKaru.add(12);
        treeKaru.add(13);
        //treeKaru.preOrderRecursive(treeKaru.getRoot());
       // treeKaru.levelOrder(treeKaru.getRoot());
        //System.out.print(treeKaru.maxElementIter(treeKaru.getRoot()));;
        System.out.println(treeKaru.sizeOfTree(treeKaru.getRoot()));
    }
}
