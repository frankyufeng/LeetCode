package com.yfeng.more.money.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 */

public class ContainDuplicate {

	public boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length <= 1) return false;
		Set<Integer> hashSet = new HashSet<Integer>();
		
		for(int num : nums){
			if(hashSet.contains(num)) return true;
			hashSet.add(num);
		}
		return false;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
