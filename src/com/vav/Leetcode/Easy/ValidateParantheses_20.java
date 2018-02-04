package com.vav.Leetcode.Easy;

import java.util.Stack;

/**
 * Created by vaibhav on 2/4/18.
 */
public class ValidateParantheses_20 {
    public static void main(String arg[]){
        String s = "(({]}))";
        System.out.println(validateParantheses(s));
    }

    private static boolean validateParantheses(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<chars.length;i++){
            switch(chars[i]){
                case '{':
                case '[':
                case '(':
                    stack.push(chars[i]);
                    break;
                case '}':
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        if(stack.pop()!='{'){
                            return false;
                        }
                    }
                    break;
                case ']':
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        if(stack.pop()!='['){
                            return false;
                        }
                    }
                    break;
                case ')':
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        if(stack.pop()!='('){
                            return false;
                        }
                    }
                    break;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
