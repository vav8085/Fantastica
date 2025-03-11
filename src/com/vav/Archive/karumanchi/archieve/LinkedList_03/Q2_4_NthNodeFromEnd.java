package com.vav.Archive.karumanchi.archieve.LinkedList_03;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * Created by vaibhav on 11/26/17.
 */
public class Q2_4_NthNodeFromEnd {
    public static void main(String arg[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        System.out.println(nthNodeFromEnd(ll.getHead(),3));

    }
    public static int nthNodeFromEnd(Link<Integer> root,int position){
        int totalNodes=0,nodesFromBeginning=0;
        Link<Integer> node=root;
        while(node!=null){
            node=node.getNext();
            totalNodes++;
        }
        if(totalNodes>=position){
            //totalNodes = 7 ,position=3 then nodes from beginning = 7-3 = 4
            nodesFromBeginning = totalNodes-position;
            while (nodesFromBeginning!=0){
                root=root.getNext();
                nodesFromBeginning--;
            }
            return root.getData();
        }else{
            System.out.println("not sufficient nodes!");
            return -1;
        }
    }
}
