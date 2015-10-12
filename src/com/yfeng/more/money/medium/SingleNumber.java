package com.yfeng.more.money.medium;

/**
 * 
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 */

public class SingleNumber {

	public int singleNumber(int[] nums) {
		
		if(nums == null || nums.length == 0) throw new IllegalArgumentException();
		int result = 0;
		for(int num : nums){
			result = result ^ num;
		}
        return result;
    }
}
