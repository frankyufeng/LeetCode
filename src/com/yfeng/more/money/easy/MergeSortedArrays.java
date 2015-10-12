package com.yfeng.more.money.easy;

/**
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) 
 * to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 */

public class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		if(nums1 == null && nums2 == null) throw new IllegalArgumentException();
		
		int cur1 = m - 1;
		int cur2 = n - 1;
		int cur = m + n - 1;
		
		while(cur1 >= 0 && cur2 >= 0){
			if(nums1[cur1] > nums2[cur2]){
				nums1[cur] = nums1[cur1];
				cur1--;
			}
			else{
				nums1[cur] = nums2[cur2];
				cur2--;
			}
			cur--;
		}
		
		while(cur1 >= 0){
			nums1[cur] = nums1[cur1];
			cur1--;
			cur--;
		}
		
		while(cur2 >= 0){
			nums1[cur] = nums2[cur2];
			cur2--;
			cur--;
		}
    }
}
