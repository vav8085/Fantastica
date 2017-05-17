package com.vav.CTCI.Chapter2;

import com.vav.CTCI.Common.LinkedList.Link;
import com.vav.CTCI.Common.LinkedList.LinkedList;

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
