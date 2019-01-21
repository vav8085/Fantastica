package com.vav.CoursesBooks.karumanchi.Stacks_04;

import java.util.Stack;

/**
 * Created by Vaibhav on 12/20/17.
 */
public class Q5_InfixToPostfixProcessor {

    public static void main(String arg[]){
        //1+2*3-5
        String infixString = "(1+2)*3-5";
        char[] infixArr = infixString.toCharArray();
        infixToPostfixProcessor(infixArr);
    }

    /**
     * 1.   First we save all the operators in the operator stack
     * 2.   Then we save all the operands in the operand stack
     * 3.   Then we just go over the operator stack and pop the operand stack for the type of operation.
     * 4.   ToDo We need to add some conditions if the operator or operand stacks are empty as a check for incorrect postfix expression
     * @param infixArr
     */
    private static void infixToPostfixProcessor(char[] infixArr) {
        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> operandStack = new Stack<>();

        //Save operators in operator stack and operands in operand stack
        for(int i=0;i<infixArr.length;i++){
            if(infixArr[i]=='+' || infixArr[i]=='-' || infixArr[i]=='*' || infixArr[i]=='/'){
                operatorStack.push(infixArr[i]);
            }else{
                operandStack.push(Character.getNumericValue(infixArr[i]));
            }
        }

        while (!operatorStack.empty()){
            char operator = operatorStack.pop();
            int[] operands = new int[2];
            for(int operandPointer=0;operandPointer<2;operandPointer++){
                if(!operandStack.empty()){
                    operands[operandPointer] = operandStack.pop();
                }
            }
            switch (operator){
                case '+':
                    operandStack.push((Integer) operands[0]+operands[1]);
                    break;
                case '-':
                    operandStack.push((Integer) operands[1]-operands[0]);
                    break;
                case '*':
                    operandStack.push((Integer) operands[0]*operands[1]);
                    break;
                case '/':
                    operandStack.push((Integer) operands[1]/operands[0]);
                    break;
            }
        }
        System.out.println(operandStack.pop());

    }
}
