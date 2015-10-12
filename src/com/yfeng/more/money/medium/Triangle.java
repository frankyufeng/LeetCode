package com.yfeng.more.money.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

Note:
Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 *
 */

public class Triangle {
	
	public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null) throw new IllegalArgumentException();
        if(triangle.isEmpty()) return 0;
        List<Integer> minList = new LinkedList<Integer>();
        minList.addAll(triangle.get(triangle.size()-1));
        int curIndex = triangle.size() - 2;
        while(curIndex >= 0){
        	List<Integer> curList = triangle.get(curIndex);
        	for(int i = 0; i < curList.size(); i++){
        		minList.set(i, curList.get(i) + Math.min(minList.get(i), minList.get(i+1)));
        	}
        	curIndex--;
        }
        return minList.get(0);
    }
}
