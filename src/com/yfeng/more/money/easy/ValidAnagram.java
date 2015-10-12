package com.yfeng.more.money.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 * 
 *
 */

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if(s == null || t == null) throw new IllegalArgumentException();
		
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++){
			Character curChar = s.charAt(i);
			if(hashMap.containsKey(curChar)){
				hashMap.put(curChar, hashMap.get(curChar) + 1);
			}
			else{
				hashMap.put(curChar, 1);
			}
		}
		
		for(int i = 0; i < t.length(); i++){
			Character curChar = t.charAt(i);
			if(!hashMap.containsKey(curChar)){
				return false;
			}
			hashMap.put(curChar, hashMap.get(curChar) - 1);
			if(hashMap.get(curChar) == 0){
				hashMap.remove(curChar);
			}
		}
		
		return hashMap.size() == 0;
    }
}
