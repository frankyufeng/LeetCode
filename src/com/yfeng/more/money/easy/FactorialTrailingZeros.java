package com.yfeng.more.money.easy;

/**
 * 
 * Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
 *
 */

public class FactorialTrailingZeros {

	public int trailingZeroes(int n) {
		int count = 0;
		
		//This needs to be long, otherwise there can be a overflow
		long cur = 5;
		
		while(cur <= n){
			count += n / cur;
			cur *= 5;
		}
		
		return count;
    }
}
