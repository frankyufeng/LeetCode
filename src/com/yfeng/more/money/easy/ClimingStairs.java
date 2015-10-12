package com.yfeng.more.money.easy;

/**
 * 
 * Climbing Stairs 
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 */

public class ClimingStairs {

	public int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n <= 2) return n;
        
        int p1 = 1;
        int p2 = 2;
        int pn = 0;
        
        for(int i = 3; i <= n; i++){
        	pn = p1 + p2;
        	p1 = p2;
        	p2 = pn;
        }
        
        return pn;
    }
}
