package com.yfeng.more.money.medium;

import java.util.Stack;

import com.yfeng.more.money.common.TreeNode;

/**
 * 
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 *
 */

public class BSTIterator {

	private Stack<TreeNode> stack = new Stack<TreeNode>();
	
    public BSTIterator(TreeNode root) {
        if(root != null){
        	TreeNode cur = root;
        	while(cur != null){
        		stack.push(cur);
        		cur = cur.left;
        	}
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
    	if(stack.isEmpty()) throw new UnsupportedOperationException();
    	TreeNode nextNode = stack.pop();
    	TreeNode cur = nextNode.right;
    	while(cur != null){
    		stack.push(cur);
    		cur = cur.left;
    	}
    	return nextNode.val;
    }
}
