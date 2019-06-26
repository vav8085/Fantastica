package com.vav.Reference.CTCI.Archive.work_2017.Chapter3;

import java.util.Stack;

/**
 * Created by Vaibhav on 6/19/17.
 */
public class Q2_StackMin extends Stack<Integer> {
    MinValueStack minValueStack;

    public Q2_StackMin() {
        super();
        minValueStack = new MinValueStack();
    }

    @Override
    public Integer push(Integer item) {

        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        return super.pop();
    }

    @Override
    public synchronized Integer peek() {
        return super.peek();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }
}

class MinValueStack extends Stack<Integer>{

}