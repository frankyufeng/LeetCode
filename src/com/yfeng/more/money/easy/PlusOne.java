package com.yfeng.more.money.easy;
/**
 * 
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 */

public class PlusOne {

	public int[] plusOne(int[] digits) {
		int carry = 1;
		int[] result = new int[digits.length];
		
		for(int i = digits.length - 1; i >= 0; i--){
			result[i] = (digits[i] + carry) % 10;
			carry = (digits[i] + carry) / 10;
		}
		
		if(carry > 0){
			int[] resultNew = new int[result.length + 1];
			for(int i = 1; i < result.length; i++) resultNew[i] = result[i];
			resultNew[0] = carry;
			return resultNew;
		}
		
		return result;
    }
}
