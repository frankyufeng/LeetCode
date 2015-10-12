package com.yfeng.more.money.easy;

/**
 * Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer
 * @author yfeng
 *
 */

public class ReverseBits {
	 public int reverseBits(int n) {
	        int result = 0;
	        for(int i = 0; i < 32; i++){
	        	result = result << 1;
	        	int curBit = n % 2;
	        	n = n >> 1;
	        	result = result + curBit;
	        }
	        return result;
	 }
	 
	 public static void main(String[] args){
		 ReverseBits a = new ReverseBits();
		 a.reverseBits(2147483647);
	 }
}
