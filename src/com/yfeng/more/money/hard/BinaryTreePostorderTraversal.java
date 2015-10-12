package com.yfeng.more.money.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.yfeng.more.money.common.TreeNode;

public class BinaryTreePostorderTraversal {

	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> seq = new ArrayList<Integer>();
        if(root == null) return seq;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode curNode = stack.peek();
        	if((curNode.left == null && curNode.right == null) 
        		|| (pre != null && curNode.right == null && pre == curNode.left)
        		|| (pre != null && curNode.right != null && pre == curNode.right)) seq.add(stack.pop().val);
        	else{
        		stack.push(curNode.right);
        		stack.push(curNode.left);
        	}
        }
        return seq;
    }
}
