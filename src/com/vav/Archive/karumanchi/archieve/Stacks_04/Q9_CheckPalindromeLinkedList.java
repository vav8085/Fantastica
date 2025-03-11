package com.vav.Archive.karumanchi.archieve.Stacks_04;

import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.Archive.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * Created by vaibhav on 12/21/17.
 */
public class Q9_CheckPalindromeLinkedList {
    //we can do it with the help of a hashmap by traversing the linked list and saving all items in a hashmap with their counts
    //if there is more than one count that is odd then its not a palindrome


    //We can do this with the help of a stack by first saving all items to the stack and then again scanning the list
    //and match the popped item with the list items. If they are same then its not a stack.

    //The method we will use is by reversing the second half of the linked list and then starting from last and first at ame time
    //and compare each elements
    public static void main(String arg[]){
        String s = "aabcxcbaa";
        LinkedList linkedList = new LinkedList();
        char[] elementsArray = s.toCharArray();
        for(int i=0;i<elementsArray.length;i++){
            linkedList.insertAtEnd(elementsArray[i]);
        }
        System.out.print(checkStringPalindrome(linkedList));
    }

    private static boolean checkStringPalindrome(LinkedList s) {
        Link head = s.getHead();
        Link temp = head;
        int count = 0;
        while (temp!=null){
            temp = temp.getNext();
            count++;
        }
        int mid = count%2==0?count/2:count/2+1;
        temp = head;
        for(int i=1;i<mid;i++){
            temp = temp.getNext();
        }
        Link midItem = temp;
        Link previous = midItem;
        previous.setNext(null);
        Link current = midItem.getNext();
        Link placeholder = null;
        while (current!=null){
            placeholder = current;
            current = current.getNext();
            placeholder.setNext(previous);
            previous = placeholder;
        }
        Link leftHead = head;
        Link rightHead = previous;
        while(leftHead!=midItem && rightHead !=midItem){
            if(leftHead.getData()!=rightHead.getData()){
                return false;
            }
            leftHead = leftHead.getNext();
            rightHead = rightHead.getNext();
        }
        return true;
    }
}
