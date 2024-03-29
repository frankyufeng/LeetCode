package com.yfeng.more.money.easy;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * @author yfeng
 *
 */

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        if(null == nums) throw new IllegalArgumentException();
        if(nums.length <= 1) return nums.length;
        int newEnd = 0;
        int cur = 0;
        while(cur < nums.length){
        	if(nums[cur] != nums[newEnd]){
        		newEnd++;
        		nums[newEnd] = nums[cur];
        	}
        	cur++;
        }
        return newEnd + 1;
    }
}
