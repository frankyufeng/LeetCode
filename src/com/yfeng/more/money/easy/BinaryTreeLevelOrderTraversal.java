package com.yfeng.more.money.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.yfeng.more.money.common.TreeNode;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 * @author yfeng
 *
 */

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.add(root);
        nodeQueue.add(null);
        while(true){
        	List<Integer> curLevel = new ArrayList<Integer>();
        	TreeNode curNode = nodeQueue.poll();
        	while(curNode != null){
        		curLevel.add(curNode.val);
        		if(curNode.left != null) nodeQueue.add(curNode.left);
        		if(curNode.right != null) nodeQueue.add(curNode.right);
        		curNode = nodeQueue.poll();
        	}
        	result.add(curLevel);
        	if(nodeQueue.isEmpty()) break;
        	nodeQueue.add(null);
        }
        return result;
    }
}
