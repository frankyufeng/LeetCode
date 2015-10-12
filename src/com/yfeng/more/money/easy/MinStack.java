package com.yfeng.more.money.easy;

import java.util.Stack;

/**
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 *
 */

public class MinStack {
	
	Stack<Integer> dataStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
    
	public void push(int x) {
        if(this.dataStack.isEmpty()){
        	minStack.push(x);
        }
        else{
        	minStack.push(Math.min(minStack.peek(), x));
        }
        dataStack.push(x);
    }

    public void pop() {
    	if(dataStack.isEmpty()) throw new UnsupportedOperationException();
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
    	if(dataStack.isEmpty()) throw new UnsupportedOperationException();
        return dataStack.peek();
    }

    public int getMin() {
        if(dataStack.isEmpty()) throw new UnsupportedOperationException();
        return minStack.peek();
    }
}

