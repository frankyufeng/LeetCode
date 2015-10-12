package com.yfeng.more.money.easy;

/**
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 *
 */

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
        if(null == s) return false;
        if(s.isEmpty()) return true;
        
        s = s.toLowerCase();
        
        int left = 0; 
        int right = s.length() - 1;
        
        while(left < right){
        	while(left < s.length() && !isAlphabet(s.charAt(left))) left++;
        	while(right >= 0 && !isAlphabet(s.charAt(right))) right--;
        	
        	if(left >= right) return true;
        	if(s.charAt(left) != s.charAt(right)) return false;
        	
        	left++;
    		right--;
        }
        
        return true;
    }
	
	private static boolean isAlphabet(char c){
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(",."));

	}

}
