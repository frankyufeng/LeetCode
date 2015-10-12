package com.yfeng.more.money.medium;

import com.yfeng.more.money.common.TreeNode;

public class ConvertSortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
	
	private TreeNode sortedArrayToBST(int[] nums, int left, int right){
		int mid = left + (right - left) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		if(mid > left) root.left = sortedArrayToBST(nums, left, mid - 1);
		if(mid < right) root.right = sortedArrayToBST(nums, mid + 1, right);
		return root;
	}
}
