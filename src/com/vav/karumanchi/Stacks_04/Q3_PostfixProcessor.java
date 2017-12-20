package com.vav.karumanchi.Stacks_04;

import java.util.Stack;

/**
 * Created by Vaibhav on 12/20/17.
 */
public class Q3_PostfixProcessor {

    public static void main(String arg[]){
        String postfixString = "123*+5-";
        char[] postFixArray = postfixString.toCharArray();
        postfixProcessor(postFixArray);
    }

    /**
     * 1.   Postfix processor takes a postfix expression and shows the output of the expression
     * 2.   It works as follows:
     *      A.  When you get an operand then push it onto a stack
     *      B.  When you get a unary operator then pop an operand fron the stack and evaluate the operator
     *          and save it back to the stack.
     *      C.  When you get a binary operator then pop two items from the stack and then operate on them
     *          and save the result to the stack.
     *
     *      If we want to execute unary operators and multidigit operands then we have to use some separator for
     *      values.
     * @param postFixArray
     */
    private static void postfixProcessor(char[] postFixArray) {
        Stack<Integer> operandStack = new Stack<>();
        int value = 0;
        for(int i = 0;i<postFixArray.length;i++){
            if(postFixArray[i]=='+'||postFixArray[i]=='-'||postFixArray[i]=='*'||postFixArray[i]=='/'){
                int[] operands = new int[2];
                for(int operandPointer=0;operandPointer<2;operandPointer++){
                    if(!operandStack.empty()){
                        operands[operandPointer] = operandStack.pop();
                    }
                }
                switch (postFixArray[i]){
                    case '+':
                        value = operands[0]+operands[1];
                        operandStack.push((Integer) value);
                        break;
                    case '-':
                        value = operands[1]-operands[0];
                        operandStack.push((Integer) value);
                        break;
                    case '*':
                        value = operands[0]*operands[1];
                        operandStack.push((Integer) value);
                        break;
                    case '/':
                        value = operands[1]/operands[0];
                        operandStack.push((Integer) value);
                        break;
                }
            }else{
                operandStack.push(Character.getNumericValue(postFixArray[i]));
            }
        }
        System.out.println((int)operandStack.pop());
    }

}
