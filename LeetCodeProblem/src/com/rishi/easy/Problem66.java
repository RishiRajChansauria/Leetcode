package com.rishi.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem66 {

	public int[] plusOne(int[] digits) {
		
		int i= digits.length-1;
		List<Integer> ls = new ArrayList<Integer>();
		int cur = 1;
		while(i >= 0 || cur > 0) {
		  if(i >= 0)
			cur += digits[i];
			ls.add(cur%10);
			cur /= 10;
			i--;
		}
		
		
		int [] digitsResult = new int[ls.size()];
		int n =0;
		for(int m=ls.size()-1;m>=0;m--) {
			digitsResult[n] = ls.get(m);
			n++;
		}
		
		return digitsResult;
	}

	public static void main(String[] args) {
		
		Problem66 p66 = new Problem66();
		int [] digits = {9,9,9};
		int[] plusOne = p66.plusOne(digits);
		for(int i=0; i< plusOne.length;i++) {
			System.out.println(plusOne[i]);
		}
	}

}
