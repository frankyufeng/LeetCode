package com.yfeng.more.money.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 *
 */

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		
		List<String> summary = new ArrayList<>();
		if(nums == null || nums.length == 0) return summary;
        
		int cur = 0;
		while(cur < nums.length){
			int start = cur;
			cur++;
			while(cur < nums.length && nums[cur] - nums[cur-1] == 1) cur++;
			if(cur - 1 == start){
				summary.add(String.format("%s", nums[start]));
			}
			else{
				summary.add(String.format("%s->%s", nums[start], nums[cur-1]));
			}
		}
		return summary;
    }
}
