package com.yfeng.more.money.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that 
 * adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 */

public class HouseRobber {

	public int rob(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
		return rob(nums, 0, cache);
    }
	
	private int rob(int[] nums, int startIndex, Map<Integer, Integer> cache){
		if(startIndex >= nums.length) return 0;
		if(startIndex == nums.length - 1) return nums[startIndex];
		
		int max1; 
		int max2;
		
		if(cache.containsKey(startIndex + 1)) max1 = cache.get(startIndex + 1);
		else max1 = rob(nums, startIndex + 1, cache);
		
		if(cache.containsKey(startIndex + 2)) max2 = cache.get(startIndex + 2) + nums[startIndex];
		else max2 = nums[startIndex] + rob(nums, startIndex + 2, cache);
		
		int max = Math.max(max1, max2);
		cache.put(startIndex, max);
		
		return max;
	}
	
	public static void main(String[] args){
		HouseRobber robber = new HouseRobber();
		System.out.println(robber.rob(new int[]{1,1}));
	}
}
