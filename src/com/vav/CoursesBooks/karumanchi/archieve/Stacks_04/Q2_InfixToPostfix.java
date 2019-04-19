package com.vav.CoursesBooks.karumanchi.archieve.Stacks_04;

/**
 * Created by vaibhav on 12/18/17.
 */

import java.util.Stack;

/**
 * Infix to postfix conversion is one of the most common use of stacks
 *
 * Infix notation:
 * 1.   Infix notation is the notation where operators are shown between two operands. The way we write them.
 * 2.   A * (B + C)
 * 3.   Infix notation need extra information like operator precedence and brackets to evaluate the statement.
 *
 * Postfix notation:
 * 1.   In postfix notation the operators are writen after their operands.
 * 2.   Operators are evaluated from left to write.
 * 3.   Operators operate on the valie immidiatly left of it.
 * 4.   Brackets are not required here and make no meaning.
 *
 * Conversion:
 *1.    Scan the array item by item
 *2.    When you find an operand , just print it
 *3.    When you get an operator then push it on the stack
 *4.    When you get another operator then check if the operator on stack is of higher precedence
 *          if yes then pop the stack and push new operator
 *          if no then push it on the stack
 *      When you get a right paranthesis then pop until you get a left paranthesis
 *
 */
public class Q2_InfixToPostfix {
    public static void main(String arg[]){
        String infixStr = "A *(B+C)-D/E+(F+G)";
        String inputStrNoSpaces = infixStr.replace(" ","");
        char[] infixChar = inputStrNoSpaces.toCharArray();
        infixToPostfix(infixChar);
    }

    private static void infixToPostfix(char[] infixChar) {
        Stack<Character> operatorStack = new Stack<>();
        for(int i=0;i<infixChar.length;i++){
            if(infixChar[i]==')' || infixChar[i]=='+' || infixChar[i]=='-' || infixChar[i]=='*' || infixChar[i]=='/' || infixChar[i]=='('){
                switch (infixChar[i]){
                    case ')':
                        while (!operatorStack.isEmpty() && !operatorStack.peek().equals('(')){
                            System.out.print(operatorStack.pop());
                        }
                        operatorStack.pop();
                        break;
                    case '(':
                        operatorStack.push(infixChar[i]);
                        break;
                    case '+':
                    case '-':
                        if(!operatorStack.isEmpty() && (operatorStack.peek().equals('*') || operatorStack.peek().equals('/')
                                || operatorStack.peek().equals('-')|| operatorStack.peek().equals('+'))){
                            while (!operatorStack.isEmpty()){
                                System.out.print(operatorStack.pop());
                            }
                            operatorStack.push(infixChar[i]);
                        }else{
                            operatorStack.push(infixChar[i]);
                        }
                        break;
                    case '*':
                    case '/':
                        operatorStack.push(infixChar[i]);
                        break;
                }
            }else{
                if(infixChar[i]!='(' || infixChar[i]!=')')
                System.out.print(infixChar[i]);
            }
        }
        while (!operatorStack.isEmpty()){
            System.out.print(operatorStack.pop());
        }
    }


}
