package com.yfeng.more.money.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.yfeng.more.money.common.TreeNode;

public class BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> seq = new ArrayList<Integer>();
		if(root == null) return seq;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while(cur != null){
			stack.push(cur);
			cur = cur.left;
		}
		while(!stack.isEmpty()){
			cur = stack.pop();
			seq.add(cur.val);
			TreeNode right = cur.right;
			while(right != null){
				stack.push(right);
				right = right.left;
			}
		}
		return seq;
    }
}
