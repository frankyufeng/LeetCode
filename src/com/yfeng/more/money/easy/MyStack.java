package com.yfeng.more.money.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 * @author yfeng
 *
 */

class MyStack {
    
	Queue<Integer> masterQueue = new LinkedList<Integer>();
	Queue<Integer> backupQueue = new LinkedList<Integer>();
	int top = 0;
	
	public void push(int x) {
    	this.top = x;
    	this.masterQueue.add(x);
    }

    public void pop() {
        if(this.empty()) throw new UnsupportedOperationException();
        while(masterQueue.size() > 2){
        	backupQueue.add(masterQueue.poll());
        }
        if(masterQueue.size() == 2){
        	this.top = masterQueue.poll();
        	backupQueue.add(this.top);
        }
        masterQueue.clear();
        Queue<Integer> temp = backupQueue;
        backupQueue = masterQueue;
        masterQueue = temp;
    }

    public int top() {
        return this.top;
    }

    public boolean empty() {
        return masterQueue.isEmpty();
    }
}
