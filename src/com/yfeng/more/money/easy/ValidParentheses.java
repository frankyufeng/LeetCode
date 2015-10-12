package com.yfeng.more.money.easy;

import java.util.Stack;

/**
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 */

public class ValidParentheses {
	public boolean isValid(String s) {
        if(s == null || s.isEmpty()) return true;
        if(s.length() % 2 == 1) return false;
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
        	char curChar = s.charAt(i);
        	if(stack.isEmpty()){
        		stack.push(curChar);
        		continue;
        	}
        	char topChar = stack.peek();
        	
        	if((topChar == '(' && curChar == ')') || (topChar == '[' && curChar == ']') || (topChar == '{' && curChar == '}')){
        		stack.pop();
        		continue;
        	}
        	
        	stack.push(curChar);
        }
        
        return stack.isEmpty();
    }
}
