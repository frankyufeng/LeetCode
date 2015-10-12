package com.yfeng.more.money.easy;

/**
 * 
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 *
 */

public class ReverseInteger {

	public static int reverse(int x) {
		boolean isNegative = x < 0;
		x = Math.abs(x);
		long result = 0;
		
		while(x != 0){
			result = result * 10;
			result = result + x % 10;
			x = x / 10;
		}
		
		if(isNegative){
			result = result * -1;
		}
		
		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
			return 0;
		}
		
		return (int)result;
    }
	
	public static void main(String[] args){
		reverse(1534236469);
	}
}
