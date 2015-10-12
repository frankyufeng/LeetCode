package com.yfeng.more.money.medium;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int maxProfit = 0;
        int curMinPrice = Integer.MAX_VALUE;
        
        for(int price : prices){
        	maxProfit = Math.max(maxProfit, price - curMinPrice);
        	curMinPrice = Math.min(curMinPrice, price);
        }
        
        return maxProfit;
    }
}
