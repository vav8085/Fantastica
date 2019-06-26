package com.vav.Reference.CTCI.Archive.work_2017.Chapter3;

import com.vav.Reference.CTCI.Archive.work_2017.Common.GenStack.GenStack;

/**
 * Created by Vaibhav on 8/28/17.
 */
public class Q5_StackSorting {
    private GenStack<Integer> stackLeft;
    private static GenStack<Integer> stackRight;
    private int temp=0;

    public static GenStack<Integer> stackSorting(GenStack<Integer> stackLeft) throws Exception {
        stackRight = new GenStack<>(5);
        while(!stackLeft.isEmpty()){
            Integer temp = stackLeft.pop();
            while (!stackRight.isEmpty() && stackRight.top()>=temp){
                stackLeft.push(stackRight.pop());
            }
            stackRight.push(temp);

        }
        return stackRight;
    }
    public static void main(String arg[]){
        GenStack<Integer> leftStack = new GenStack<>(5);
        GenStack<Integer> value = new GenStack<>(5);

        try {
            leftStack.push(2);
            leftStack.push(3);
            leftStack.push(6);
            leftStack.push(5);
            leftStack.push(1);
            value = Q5_StackSorting.stackSorting(leftStack);
            while (!value.isEmpty()){
                System.out.println(value.pop());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
