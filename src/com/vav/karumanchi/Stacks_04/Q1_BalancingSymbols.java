package com.vav.karumanchi.Stacks_04;

import java.util.Stack;

/**
 * There can be 3 conditions when symbols dont match and the pragram will report an error:
 * 1.   When there is a closing symbol not of same type as opening symbol
 * 2.   When there are no more opening symbols left
 * 3.   When there are no more closing symbols left
 *
 * Created by vaibhav on 11/25/17.
 */
public class Q1_BalancingSymbols {
    public static void balancingSymbols(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char currentElement = s.charAt(i);
            switch (currentElement){
                case '{':
                case '[':
                case '(':
                    stack.push(currentElement);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stack.isEmpty()) {
                        char openingSymbol = stack.pop();
                        if (openingSymbol == '{' && currentElement != '}'
                                || openingSymbol == '[' && currentElement != ']'
                                || openingSymbol == '(' && currentElement != ')') {
                            System.out.println("Error " + openingSymbol + "and" + currentElement + "do not match!");
                        }
                    }else{
                        System.out.println("Error " + currentElement + "cannot be closed!");
                    }
                    break;
                default:
                    break;
            }
        }
        if(!stack.isEmpty())
            System.out.println("There is no closing symbol to match with" + stack.peek());
    }
    public static void main(String arg[]){
        String s = "{a+b*[3*{5/(3-2)}]}{{{";
        balancingSymbols(s);
    }
}
