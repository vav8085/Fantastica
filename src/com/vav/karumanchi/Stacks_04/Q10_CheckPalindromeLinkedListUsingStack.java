package com.vav.karumanchi.Stacks_04;

import com.vav.CTCI.Common.LinkedList.Link;
import com.vav.CTCI.Common.LinkedList.LinkedList;

import java.util.Stack;

/**
 * Created by vaibhav on 12/22/17.
 */
public class Q10_CheckPalindromeLinkedListUsingStack {
    /**
     * Here we will use a stack to check the palindrome.
     * We will first scan the list from left to right until we get X
     * during scan we will also save the elements in a stack
     *
     * Once this is done we will scan elements after X comparing it with stack.pop() output
     * If both the outputs match its a palindrome
     * @param arg
     */
    public static void main(String arg[]){
        String s = "baXab";
        LinkedList linkedList = new LinkedList();
        char[] elementsArray = s.toCharArray();
        for(int i=0;i<elementsArray.length;i++){
            linkedList.insertAtEnd(elementsArray[i]);
        }
        System.out.print(checkPalindromeUsingStack(linkedList));
    }

    private static boolean checkPalindromeUsingStack(LinkedList linkedList) {
        Link<Character> head = linkedList.getHead();
        Stack<Link<Character>> stack = new Stack<>();
        Link<Character> current = head;
        while (current.getData()!='X'){
            stack.push(current);
            current = current.getNext();
        }
        current = current.getNext();
        while (true){
            if(!stack.isEmpty() && current==null){
                return false;
            }
            if(stack.isEmpty() && current!=null){
                return false;
            }
            if(stack.isEmpty() && current==null){
                return true;
            }
            char stackValue = stack.pop().getData();
            char currentValue = current.getData();
            current = current.getNext();
            if(stackValue!=currentValue){
                return false;
            }
        }
    }

}
