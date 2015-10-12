package com.yfeng.more.money.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 *
 */

public class RotateArray {

	public void rotate(int[] nums, int k) {
		if(nums == null || nums.length <= 1) return;
		k = k % nums.length;
		if(k == 0) return;
		
		int[] temp = new int[nums.length];
		for(int i = 0; i < nums.length; i++){
			temp[i] = nums[i];
		}
		
		for(int i = 0; i < nums.length; i++){
			nums[(i+k)%nums.length] = temp[i];
		}
    }
}
