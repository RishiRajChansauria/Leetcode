package com.rishi.easy;

public class Problem371 {
	
	private int sum(int a , int b)
	{
		return Math.addExact(a, b);
	}
	
	public static void main(String[] args) {
		Problem371 p = new Problem371();
		int sum = p.sum(3, 4);
		System.out.println(sum);
	}

}
