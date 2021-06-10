package com.rishi.easy;

public class Problem121 {

	public int maxProfit(int[] prices) {
		int result =0;
		int i=1;
		int j=0;
		while(i<prices.length) {
			if(prices[j]<prices[i]) {
				result=Math.max(result, (prices[i]-prices[j]));
				i++;
			}else {
				    j=i;
					i++;
			}
		}
		
		
		return result;
	}

	public static void main(String[] args) {

		Problem121 p = new Problem121();
		int [] prices = {7,1,5,3,6,4};
		int maxProfit = p.maxProfit(prices);
		System.out.println(maxProfit);

	}

}
