package com.rishi.easy;

public class Problem122 {

	public int maxProfit(int[] prices) {
		
		int maxProfit =0;
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i] > prices[i-1])
				maxProfit+=prices[i] - prices[i-1];
		}
		
		return maxProfit;
	}




	public static void main(String[] args) {
		
		Problem122 p = new Problem122();
		int [] prices = {7,1,5,3,6,4};
		System.out.println(p.maxProfit(prices));
	}

}

/*
Pointer1 -->Day
Pointer2 -->Price*/
