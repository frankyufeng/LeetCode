package com.yfeng.more.money.easy;

/**
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 */

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
		if(strs == null || strs.length == 0) return prefix.toString();
		
		int endIndex = 0;
		while(true){
			if(strs[0].length() < endIndex + 1) break;
			char curChar = strs[0].charAt(endIndex);
			for(String str : strs){
				if(str.length() < endIndex + 1 || str.charAt(endIndex) != curChar) return prefix.toString();
			}
			prefix.append(curChar);
			endIndex++;
		}
		
		return prefix.toString();
    }
}