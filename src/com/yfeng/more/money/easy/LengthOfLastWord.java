package com.yfeng.more.money.easy;


/**
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 *
 */

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
		if(s == null || s.isEmpty()) return 0;
		
		int result = 0;
		int index = s.length() - 1;
		while(index >= 0 && s.charAt(index) == ' ') index--;
		if(index < 0) return 0;
		while(index >= 0 && s.charAt(index) != ' '){
			index--;
			result++;
		}
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
