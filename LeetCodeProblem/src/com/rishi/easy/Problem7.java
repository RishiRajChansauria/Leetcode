package com.rishi.easy;
//Given a 32-bit signed integer, reverse digits of an integer.
//123 to 321


public class Problem7 {
	
	public int reverse(int x) {
		
		if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) 
		return 0;
		
		String s = Integer.toString(x);
		StringBuilder sb = new StringBuilder(s);
		String substring = sb.substring(0, 1);
		char charAt1 = substring.charAt(0);
		if(charAt1=='-') {
			sb.deleteCharAt(0);
			sb.reverse();
			sb.insert(0, '-');
		}
		else
		sb.reverse();
		long reverseInt = Long.parseLong(sb.toString());
		if(reverseInt > Integer.MAX_VALUE || reverseInt < Integer.MIN_VALUE)
			return 0;
		else
		return (int)reverseInt;
	}

	public static void main(String[] args) {
		Problem7 p7 = new Problem7();
		int reverseInt = p7.reverse(-123);
		System.out.println(reverseInt);
	}

}
