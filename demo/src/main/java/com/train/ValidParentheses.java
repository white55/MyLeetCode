package com.train;

import java.util.Stack;

/**
 * Created by 张超 on 2017/11/27.
 */
    //QUESTION:
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> p = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                p.push(')');
            }else if(c == '{'){
                p.push('}');
            }else if(c == '['){
                p.push(']');
            }else if(p.isEmpty()||p.pop()!=c){
                return false;
            }
        }
        return p.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()"));
    }
}
