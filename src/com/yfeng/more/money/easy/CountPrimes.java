package com.yfeng.more.money.easy;

/**
 * 
 * Count the number of prime numbers less than a non-negative number, n.
 *
 */

public class CountPrimes {

	public static int countPrimes(int n) {
		if(n <= 2) return 0;
		int count = 0;
		for(int i = 2; i < n; i++){
			if(isPrimeNumber(i)){
				System.out.println(i);
				count++;
			}
		}
		return count;
    }
	
	private static boolean isPrimeNumber(int num){
		if(num < 2) return false;
		if(num <= 3) return true;
		if(num % 2 == 0 || num % 3 == 0) return false;
		
		int i = 5;
		while(i * i <= num){
			if(num % i == 0 || num % (i+2) == 0) return false;
			i += 6;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(countPrimes(477797));
	}
}
