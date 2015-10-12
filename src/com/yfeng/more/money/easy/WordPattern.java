package com.yfeng.more.money.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a pattern and a string str, find if str follows the same pattern.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
patterncontains only lowercase alphabetical letters, and str contains words separated by a single space. Each word in str contains only lowercase alphabetical letters.
Both pattern and str do not have leading or trailing spaces.
Each letter in pattern must map to a word with length that is at least 1.
 * @author yfeng
 *
 */

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(words.length != pattern.length()) return false;
        
        Set<String> set = new HashSet<String>();
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < pattern.length(); i++){
        	char curChar = pattern.charAt(i);
        	if(!map.containsKey(curChar)){
        		map.put(curChar, words[i]);
        		if(set.contains(words[i])) return false;
        		set.add(words[i]);
        	}
        	else if(!map.get(curChar).equalsIgnoreCase(words[i]))
        		return false;
        }
        return true;
    }
}
