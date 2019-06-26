package com.vav.Algorithms.Common.Stacks;

/**
 * Created by Vaibhav on 8/25/17.
 * A generic stack that stores a single value
 */
public class GenStack<T> {
    private int count = -1;
    private int size = 0;
    private GenStackElement stackArr[];

    public GenStack(int size) {
        this.size = size;
        stackArr = new GenStackElement[size];
    }

    public boolean isFull() {
        return count+1 >= size ? true : false;
    }

    public boolean isEmpty() {
        return count <= -1 ? true : false;
    }

    public void push(T item) throws Exception {
        if (!isFull()) {
            stackArr[++count] = new GenStackElement();
            stackArr[count].setValue(item);
        } else {
            throw new Exception("Stack overflow!");
        }
    }

    public T pop() throws Exception {
        if (!isEmpty())
            return (T) stackArr[count--].getValue();
        else throw new Exception("No more elements to pop!");
    }
    public T top() throws Exception{
        if (!isEmpty())
            return (T) stackArr[count].getValue();
        else throw new Exception("stack is empty!");
    }

}

class GenStackElement<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}