package com.yfeng.more.money.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 */

public class ZigZagConversion {

	public String convert(String s, int numRows) {
		
		if(s == null || numRows <= 0) throw new IllegalArgumentException();
		if(numRows == 1) return s;
		
		List<List<Character>> lists = new ArrayList<List<Character>>();
		for(int i = 0; i < numRows; i++){
			lists.add(new ArrayList<Character>());
		}
		
		int curCharIndex = 0;
		
		while(curCharIndex < s.length()){
			int curRowIndex = 0;
			while(curCharIndex < s.length() && curRowIndex < numRows){
				lists.get(curRowIndex).add(s.charAt(curCharIndex));
				curCharIndex++;
				curRowIndex++;
			}
			curRowIndex -= 2;
			while(curCharIndex < s.length() && curRowIndex >= 1){
				lists.get(curRowIndex).add(s.charAt(curCharIndex));
				curCharIndex++;
				curRowIndex--;
			}
		}
		
		StringBuilder sb = new StringBuilder();
        for(List<Character> list : lists){
        	for(Character c : list){
        		sb.append(c);
        	}
        }
        
        return sb.toString();
    }
}
