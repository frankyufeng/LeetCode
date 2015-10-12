package com.yfeng.more.money.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 *
 */

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows <= 0) return result;
        result.add(Arrays.asList(1));
        
        for(int i = 2; i <= numRows; i++){
        	
        	List<Integer> curRow = new ArrayList<Integer>();
        	List<Integer> preRow = result.get(i - 2);
        	curRow.add(1);
        	for(int j = 1; j < i - 1; j++){
        		curRow.add(preRow.get(j - 1) + preRow.get(j));
        	}
        	curRow.add(1);
        	result.add(curRow);
        }
        return result;
    }
}
