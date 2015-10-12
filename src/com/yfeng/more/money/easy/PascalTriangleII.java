package com.yfeng.more.money.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 *
 */

public class PascalTriangleII {

	public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        
        if(rowIndex < 0) return row;
        
        int[] pre = new int[rowIndex];
        int[] cur = new int[rowIndex];
        pre[0] = 1;
        
        for(int i = 1; i <= rowIndex; i++){
        	cur[0] = 1;
        	for(int j = 1; j < i - 1; j++){
        		cur[j] = pre[j-1] + pre[j+1];
        	}
        	cur[i-1] = 1;
        	
        	int[] temp = cur;
        	cur = pre;
        	pre = temp;
        }
        
        for(int i = 0; i < rowIndex; i++){
        	row.add(pre[i]);
        	
        }
        return row;
    }
}
