package com.vav.Archive.CTCI.Archive.work_2017.Chapter2;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * Created by Vaibhav on 5/11/17.
 */
public class Q8_LoopDetection {
    public Link loopDetection(LinkedList linkedList){
        Link first = linkedList.getHead(), second = linkedList.getHead();
        while(second.getNext().getNext()!=null){
            if(first.getData() == second.getData()){
                return first;
            }
            first = first.getNext();
            second = second.getNext().getNext();
        }
             return null;
    }
}
