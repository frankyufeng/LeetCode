package com.yfeng.more.money.easy;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * @author yfeng
 *
 */


/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */
public class FirstBadVersion {
	public int firstBadVersion(int n) {
        if(n <= 0) throw new IllegalArgumentException();
        int lower = 0;
        int upper = n;
        while(lower < upper){
        	int mid = (lower + upper) / 2;
        	boolean isCurVersionBad = isVersionBad(mid);
        	boolean isPreviousVersioBad = (mid == 0) || isVersionBad(mid - 1);
        	if(isCurVersionBad && !isPreviousVersioBad) return mid;
        	if(isCurVersionBad){
        		upper = mid - 1;
        	}
        	else{
        		lower = mid + 1;
        	}
        }
        return -1;
    }
}
