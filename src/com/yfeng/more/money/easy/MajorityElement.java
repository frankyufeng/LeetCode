package com.yfeng.more.money.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 *
 */

public class MajorityElement {

	public int majorityElement(int[] nums) {
		if(nums == null || nums.length <= 0) return 0;
		
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int num : nums){
			if(!hashMap.containsKey(num)) hashMap.put(num, 1);
			else hashMap.put(num, hashMap.get(num) + 1);
			if(hashMap.get(num) > nums.length / 2) return num; 
		}
		
		return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
