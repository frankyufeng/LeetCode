package com.yfeng.more.money.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 *
 */

public class HappyNumber {

	public boolean isHappy(int n) {
		if(n <= 0) return false;
		
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(n);
		
		while(true){
			int newNumber = 0;
			while(n > 0){
				newNumber += (n % 10) * (n % 10);
				n = n / 10;
			}
			if(newNumber == 1) return true;
			if(numbers.contains(newNumber)) return false;
			numbers.add(newNumber);
			n = newNumber;
		}
    }
}
