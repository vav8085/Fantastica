package com.vav.CTCI.Chapter3;

/**
 * Created by vaibhav on 8/24/17.
 */
/*
 * We will be creating a stack of plates so that a new stack gets created every time previous one is full
 * 1. We go bottom up by creating the StackElementt class
 * 2. We will create a SingleStack class that will be our single stack
 * 3. Now we will create a stack of plates class which will allocate a new SingleStack when previous is full
 * */
public class Q3_StackOfPlates {
    public static void main(String arg[]){
       StackOfStacks<Integer> stackOfStacks = new StackOfStacks<>();
       stackOfStacks.push(5);
       stackOfStacks.push(4);
       stackOfStacks.push(3);
       stackOfStacks.push(2);
       stackOfStacks.push(1);
       stackOfStacks.push(0);
       stackOfStacks.push(10);
    }
}
class StackOfStacks<T>{
    int count=0;
    private SingleStack[] stackAray;
    public StackOfStacks(){
        stackAray = new SingleStack[10];
        count=0;
    }
    public SingleStack getLastStack(){
        return stackAray[count];
    }
    public void push(T item){
       if(stackAray[0]==null){
           stackAray[0]= new SingleStack();
           stackAray[0].push(item);
       }else{
           if(stackAray[count].isFull()){
               stackAray[++count] = new SingleStack();
               stackAray[count].push(item);
           }else{
               stackAray[count].push(item);
           }
       }
    }
}

class SingleStack<T>{
    private StackElementt[] stackElements;
    private int count=0;
    private final int SIZE = 5;
    public SingleStack(){
        stackElements = new StackElementt[SIZE];
    }
    public boolean isFull(){
        return count>=SIZE?true:false;
    }
    public boolean isEmpty(){
        return count==-1?true:false;
    }
    public boolean push(T item){

            stackElements[count] = new StackElementt(item);
            ++count;
            return true;

    }
    public T pop() throws Exception {
        if(count<-1){
            throw new Exception("Stack is empty");
        }else{
            return (T) stackElements[--count].getValue();

        }
    }
}
class StackElementt<T> {
    private T value;
    public StackElementt(T value){
        this.value = value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}
