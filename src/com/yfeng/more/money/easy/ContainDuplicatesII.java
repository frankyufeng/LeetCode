package com.yfeng.more.money.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * Given an array of integers and an integer k, find out whether there there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 *
 */

public class ContainDuplicatesII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length <= 1 || k <= 0) return false;
        
        Map<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
        
        for(int i = 0; i < nums.length; i++){
        	if(!hashMap.containsKey(nums[i])){
        		hashMap.put(nums[i], new LinkedList<Integer>());
        	}
        	hashMap.get(nums[i]).add(i);
        }
        
        for(int key : hashMap.keySet()){
        	List<Integer> curList = hashMap.get(key);
        	for(int i = 1; i < curList.size(); i++){
        		if(Math.abs(curList.get(i) - curList.get(i - 1)) <= k) return true;
        	}
        }
        
        return false;
    }
}
