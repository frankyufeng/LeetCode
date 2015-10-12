package com.yfeng.more.money.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) return result;
        return permute(nums, 0, new ArrayList<Integer>(), result);
    }
	
	private List<List<Integer>> permute(int[] nums, int pos, List<Integer> list, List<List<Integer>> result){
		if(list.size() == nums.length){
			result.add(new ArrayList<Integer>(list));
		}
		for(int i = pos; i < nums.length; i++){
			list.add(nums[i]);
			permute(nums, i + 1, list, result);
			list.remove(list.size()-1);
		}
		return result;
	}
}
