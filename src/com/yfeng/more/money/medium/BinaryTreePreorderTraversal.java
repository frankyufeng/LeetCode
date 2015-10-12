package com.yfeng.more.money.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.yfeng.more.money.common.TreeNode;

public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> seq = new ArrayList<Integer>();
        if(root == null) return seq;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode curNode = stack.pop();
        	seq.add(curNode.val);
        	if(curNode.right != null){
        		stack.push(curNode.right);
        	}
        	if(curNode.left != null){
        		stack.push(curNode.left);
        	}
        }
        return seq;
    }
	
}
