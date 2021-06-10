package com.rishi.easy;

import java.util.Stack;

//Determine whether an integer is a palindrome. 
//An integer is a palindrome when it reads the same backward as forward.
public class Problem9 {

	public boolean isPalindrome(int x) {
		if(x >=0 && x<10) {
			return true;
		}
		if(x<0)
			return false;
		Stack<Integer> ls = new Stack<>();
		int y =x;
		while(y > 0) {
			int a = y % 10;
			ls.push(a);
			y=y/10;
			if(y>0 && y<10) {
				ls.push(y);
				break;
			}
		}
		for(int i=0; i<ls.size();i++) {
			if(ls.get(i)!=ls.pop()) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Problem9 p8 = new Problem9();
		boolean palindrome = p8.isPalindrome(1000030001);
		System.out.println(palindrome);
	}

}
