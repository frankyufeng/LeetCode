package com.yfeng.more.money.medium;

/**
 * 
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 *
 */

public class JumpGame {
	public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        if(nums.length == 1) return true;
        
        int curMaxIndex = nums.length - 1;
        int cur = nums.length - 2;
        boolean canJump = false;
        
        while(cur >= 0){
        	if(curMaxIndex - cur <= nums[cur]){
        		curMaxIndex = cur;
        	}
        	if(cur == 0){
        		canJump = (curMaxIndex == 0);
        	}
        	cur--;
        }
        
        return canJump;
    }
}
