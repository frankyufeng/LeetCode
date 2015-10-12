package com.yfeng.more.money.easy;

/**
 * 
 * Given an integer, write a function to determine if it is a power of two.
 *
 */

public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		if(n <= 0) return false;
		long temp = 1;
		while(temp < Integer.MAX_VALUE){
			if(n == temp) return true;
			temp *= 2;
		}
		return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
