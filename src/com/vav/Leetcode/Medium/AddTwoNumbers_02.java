package com.vav.Leetcode.Medium;

import com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList.Link;

/**
 * Created by Vaibhav on 2/12/18.
 */
public class AddTwoNumbers_02 {

        public static void main(String arg[]){
            Link<Integer> link1 = new Link<>(2);
            Link<Integer> link2 = new Link<>(4);
            Link<Integer> link3 = new Link<>(6);
            Link<Integer> link4 = new Link<>(5);

            link1.setNext(link2);
            link2.setNext(link3);
            link3.setNext(link4);
            Link<Integer> linkA = new Link<>(5);
            Link<Integer> linkB = new Link<>(6);
            Link<Integer> linkC = new Link<>(4);
            linkA.setNext(linkB);
            linkB.setNext(linkC);

            Link<Integer> result = addTwoNumbers(link1,linkA);

            while (result!=null){
                System.out.println(result.getData());
                result = result.getNext();
            }

        }
        public static Link<Integer> addTwoNumbers(Link<Integer> link1, Link<Integer> link2){
            int sum = 0;
            int carry = 0;
            Link<Integer> newLink = new Link<>(0);
            Link<Integer> current = newLink;
            while(link1!=null || link2!=null){
                sum = (link1!=null?link1.getData():0) + (link2!=null?link2.getData():0) + carry;
                if(sum>=10){
                    sum = sum%10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                current.setNext(new Link(sum));
                current = current.getNext();
                link1 = link1!=null?link1.getNext():link1;
                link2 = link2!=null?link2.getNext():link2;
            }
            if(carry==1){
                current.setNext(new Link(1));
            }else{
                current.setNext(null);
            }
            return newLink.getNext();
        }
}
