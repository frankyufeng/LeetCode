package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
 * @author yfeng
 *
 */

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(null == root) return true;
		return isMirror(root.left, root.right);
    }
	
	private boolean isMirror(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null) return true;
		if((root1 == null && root2 != null) || (root1 != null && root2 == null)) return false;
		return root1.val == root2.val && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
	}
}
