package com.yfeng.more.money.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 */

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int[] twoSum(int[] nums, int target) {
		
		if(nums == null) throw new IllegalArgumentException();
		int[] results = new int[2];
		
		long targetLong = (long) target;
		
        Map<Long, Integer> hashMap = new HashMap<Long, Integer>();
        for(int i = 0; i < nums.length; i++){
        	long diff = targetLong - (long)nums[i];
        	if(hashMap.containsKey(diff)){
        		results[0] = Math.min(i + 1, hashMap.get(diff));
        		results[1] = Math.max(i + 1, hashMap.get(diff));
        		break;
        	}
        	else{
        		hashMap.put((long)nums[i], i+1);
        	}
        }
        
        return results;
    }

}
