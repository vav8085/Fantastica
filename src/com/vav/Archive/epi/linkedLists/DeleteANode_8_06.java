package com.vav.Archive.epi.linkedLists;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;

public class DeleteANode_8_06 {
    /**
     * 2 3 4 5 6
     * delete 3
     * 2 4 4 5 6              node.setData((Integer) node.getNext().getData());
     * 2 4 5 6                node.setNext(node.getNext().getNext());
     * @param node
     */
    public static void deleteANode(Link<Integer> node){
            Link<Integer> next = node.getNext();
            node.setData(next.getData());
            node.setNext(node.getNext().getNext());
    }

    public static void main(String arg[]){
        Link<Integer> listA = new Link<>(1);
        Link<Integer> link3 = new Link<>(3);
        Link<Integer> link5 = new Link<>(5);
        Link<Integer> link7 = new Link<>(7);
        Link<Integer> link9 = new Link<>(9);
        listA.setNext(link3);
        link3.setNext(link5);
        link5.setNext(link7);
        link7.setNext(link9);

        deleteANode(link3);
        while (listA!=null){
            System.out.println(listA.getData());
            listA = listA.getNext();
        }
    }
}
