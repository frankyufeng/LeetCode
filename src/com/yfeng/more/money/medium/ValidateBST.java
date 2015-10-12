package com.yfeng.more.money.medium;

import com.yfeng.more.money.common.TreeNode;

/**
 * 
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 *
 */

public class ValidateBST {

	public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if(root.left == null || root.right == null) return true;
        if(root.left == null){
        	return getMinValue(root.right) > root.val && isValidBST(root.right);
        }
        if(root.right == null){
        	return getMaxValue(root.left) < root.val && isValidBST(root.left);
        }
        return getMaxValue(root.left) < root.val && getMinValue(root.right) > root.val && isValidBST(root.left) && isValidBST(root.right);
    }
	
	private int getMinValue(TreeNode root){
		if(root.left == null && root.right == null) return root.val;
		if(root.left == null) return Math.min(root.val, getMinValue(root.right));
		if(root.right == null) return Math.min(root.val, getMinValue(root.left));
		return Math.min(root.val, Math.min(getMinValue(root.left), getMinValue(root.right)));
	}
	
	private int getMaxValue(TreeNode root){
		if(root.left == null && root.right == null) return root.val;
		if(root.left == null) return Math.max(root.val, getMaxValue(root.right));
		if(root.right == null) return Math.max(root.val, getMaxValue(root.left));
		return Math.max(root.val, Math.max(getMaxValue(root.left), getMaxValue(root.right)));
	}
}
