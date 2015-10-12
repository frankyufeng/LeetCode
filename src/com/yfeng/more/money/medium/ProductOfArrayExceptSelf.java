package com.yfeng.more.money.medium;

/**
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 * @author yfeng
 *
 */

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		if(nums == null || nums.length <= 1) throw new IllegalArgumentException();
		int[] result = new int[nums.length];
		result[0] = nums[0];
		for(int i = 1; i < nums.length; i++){
			result[i] = nums[i];
			nums[i] = nums[i-1] * nums[i];
		}
		for(int i = result.length - 2; i >= 0; i--){
			result[i] = result[i+1] * result[i];
		}
		int first = result[1];
		int last = nums[nums.length-2];
		for(int i = 1; i < nums.length - 1; i++){
			result[i] = nums[i-1] * result[i+1];
		}
		result[0] = first;
		result[result.length-1] = last;
		return result;
    }
}
