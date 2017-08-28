package com.vav.CTCI.Chapter3;

import com.sun.tools.javah.Gen;
import com.vav.CTCI.Common.GenStack.GenStack;

/**
 * Created by Vaibhav on 8/28/17.
 */
public class Q5_StackSorting {
    private GenStack<Integer> stackLeft;
    private GenStack<Integer> stackRight;
    private int temp=0;

    Q5_StackSorting(){
        stackLeft = new GenStack<>(5);
        stackRight = new GenStack<>(5);
    }

    public GenStack<Integer> stackSorting(GenStack<Integer> stackRight) throws Exception {

        while (!stackRight.isEmpty() && stackRight.top()>=temp){
            stackLeft.push(stackRight.pop());
            while (stackLeft.top()>stackRight.top()){
                
            }
        }

        return stackRight;
    }

}
