package com.yfeng.more.money.medium;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 *
 */

public class Combinations {

	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        
        long max = 1;
        for(int i = 0; i < n; i++) max = max << 1;
        
        for(long i = 0; i < max; i++){
        	List<Integer> curList = new ArrayList<Integer>();
        	long curNum = i;
        	int curNumber = 1;
        	while(curNum > 0){
        		if(curNum % 2 == 1) curList.add(curNumber);
        		curNum = curNum / 2;
        		curNumber++;
        	}
        	if(curList.size() == k) combinations.add(curList);
        }
        
        return combinations;
    }
	
	/* Recursion, the time complexity is terrible
	
	public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) list.add(i);
        return combine(list, k);
    }
	
	private List<List<Integer>> combine(List<Integer> list, int k){
		List<List<Integer>> combinations = new ArrayList<List<Integer>>();
		if(k == 0) return combinations;
		if(k == list.size()){
			combinations.add(new ArrayList<Integer>(list));
			return combinations;
		}
		for(Integer num : list){
			List<Integer> subList = new ArrayList<Integer>(list);
			subList.remove(num);
			for(List<Integer> subCombination : combine(subList, k - 1)){
				subCombination.add(num);
				combinations.add(subCombination);
			}
		}
		return combinations;
	}
	
	*/
}
