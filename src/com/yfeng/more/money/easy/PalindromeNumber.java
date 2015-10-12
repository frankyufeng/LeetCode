package com.yfeng.more.money.easy;

/**
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 */

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
        long xLong = Math.abs(x);
        long revertX = 0;
        while(x != 0){
        	revertX = revertX * 10 + x % 10;
        	x = x / 10;
        }
        return revertX == xLong;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
