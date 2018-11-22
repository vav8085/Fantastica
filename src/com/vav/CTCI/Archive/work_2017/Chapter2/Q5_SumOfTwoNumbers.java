package com.vav.CTCI.Archive.work_2017.Chapter2;

import com.vav.CTCI.Archive.work_2017.Common.LinkedList.Link;
import com.vav.CTCI.Archive.work_2017.Common.LinkedList.LinkedList;

/**
 * Created by Vaibhav on 5/11/17.
 */
public class Q5_SumOfTwoNumbers {
    public static LinkedList<Integer> sumOfTwoNumbers(Link<Integer> head1, Link<Integer> head2){
        LinkedList<Integer> linkedList = new LinkedList<>();
        int sum = 0,carry = 0;
        while(head1!=null&&head2!=null){
            sum = head1.getData()+head2.getData()+carry;
            if(sum%10>0){
                carry=0;
                carry  = carry+1;
                sum = sum%10;
            }
            linkedList.insertAtEnd(sum);
            sum=0;
            if(head1!=null){
                head1 = head1.getNext();
            }
            if(head2!=null){
                head2 = head2.getNext();
            }
        }
        if(carry!=0){
            linkedList.insertAtEnd(1);
        }
        return linkedList;
    }
    public static LinkedList<Integer> sumOfTwoInequalLengthNumbers(Link<Integer> head1, Link<Integer> head2) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int sum = 0, carry = 0;
        while(true){
            if(head1!=null && head2!=null){
                sum = head1.getData()+head2.getData()+carry;
                head1 = head1.getNext();
                head2 = head2.getNext();
            }else if(head1!=null){
                sum = head1.getData()+carry;
                head1 = head1.getNext();
            }else if(head2!=null){
                sum = head2.getData()+carry;
                head2 = head2.getNext();
            }else{
                sum = carry;
            }
            carry=0;
            if(sum/10>0){
                carry  = carry+1;
                sum = sum%10;
            }
            linkedList.insertAtEnd(sum);
            if(head1==null&&head2==null) break;
        }
        if(carry==1){
            linkedList.insertAtEnd(1);
        }
        return linkedList;
    }
    public static void main(String arg[]){
        LinkedList<Integer> linkedList1 = new LinkedList();
        LinkedList<Integer> linkedList2 = new LinkedList();

        linkedList1.insertAtEnd(4);
        linkedList1.insertAtEnd(5);
        linkedList1.insertAtEnd(6);
        linkedList2.insertAtEnd(7);
        linkedList2.insertAtEnd(8);
        linkedList2.insertAtEnd(9);
        LinkedList linkedList3 = sumOfTwoInequalLengthNumbers(linkedList1.getHead(),linkedList2.getHead());
        linkedList3.printList();
    }
}
