package com.yfeng.more.money.easy;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 * @author yfeng
 *
 */

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int newEnd = 0;
        int cur = 0;
        while(cur < nums.length){
        	if(nums[cur] != 0){
        		nums[newEnd] = nums[cur];
        		newEnd++;
        	}
        	cur++;
        }
        while(newEnd < nums.length){
        	nums[newEnd] = 0;
        	newEnd++;
        }
    }
}
