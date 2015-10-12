package com.yfeng.more.money.easy;

/**
 * 
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 *
 */

public class AddBinary {

	public String addBinary(String a, String b) {
		if(a == null && b == null) throw new IllegalArgumentException();
		if(a == null) return b;
		if(b == null) return a;
		
		StringBuilder sum = new StringBuilder();
		int aCur = a.length() - 1;
		int bCur = b.length() - 1;
		int carry = 0;
		
		while(aCur >= 0 && bCur >= 0){
			int aInt = a.charAt(aCur) == '1' ? 1 : 0;
			int bInt = b.charAt(bCur) == '1' ? 1 : 0;
			char sumChar = (aInt + bInt + carry) % 2 == 1 ? '1' : '0';
			carry = (aInt + bInt + carry) / 2;
			sum.insert(0, sumChar);
			
			aCur--; bCur--;
		}
		
		while(aCur >= 0){
			int aInt = a.charAt(aCur) == '1' ? 1 : 0;
			char sumChar = (aInt + carry) % 2 == 1 ? '1' : '0';
			carry = (aInt + carry) / 2;
			sum.insert(0, sumChar);
			aCur--;
		}
		
		while(bCur >= 0){
			int bInt = b.charAt(bCur) == '1' ? 1 : 0;
			char sumChar = (bInt + carry) % 2 == 1 ? '1' : '0';
			carry = (bInt + carry) / 2;
			sum.insert(0, sumChar);
			bCur--;
		}
		
		if(carry > 0){
			sum.insert(0, '1');
		}
		
		return sum.toString();
    }
	
}
