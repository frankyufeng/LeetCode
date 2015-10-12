package com.yfeng.more.money.medium;

import com.yfeng.more.money.common.TreeNode;

/**
 * 
 * Given a complete binary tree, count the number of nodes.

Definition of a complete binary tree from Wikipedia:
In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 *
 */

public class CountCompleteTreeNodes {

	public int countNodes(TreeNode root) {
		if(root == null) return 0;
		TreeNode cur = root;
		int leftMostDepth = 0;
		int rightMostDepth = 0;
		
		while(cur != null){
			cur = cur.left;
			leftMostDepth++;
		}
		
		cur = root;
		while(cur != null){
			cur = cur.right;
			rightMostDepth++;
		}
		
		if(leftMostDepth == rightMostDepth) return (int)Math.pow(2, leftMostDepth - 1);
		
		return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
