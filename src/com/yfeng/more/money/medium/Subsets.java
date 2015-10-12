package com.yfeng.more.money.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if(null == nums || nums.length == 0) return results;
        Arrays.sort(nums);
        return subsets(nums, 0, new ArrayList<Integer>(), results);
    }
    
    private List<List<Integer>> subsets(int[] nums, int position, List<Integer> list, List<List<Integer>> result){
        result.add(new ArrayList<Integer>(list));
        for(int i = position; i < nums.length; i++){
        	list.add(nums[i]);
        	subsets(nums, i + 1, list, result);
        	list.remove(list.size()-1);
        }
        return result;
    }
}
