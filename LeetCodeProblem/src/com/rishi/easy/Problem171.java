package com.rishi.easy;

public class Problem171 {
	

	public int titleToNumber(String s) {
		int result = 0;
		int len=s.length()-1;
			for(int i=0;i<=len;i++) {
				int value=s.charAt(i)-64;
				result+=(int) (value)*Math.pow(26, len-i);
			}
		
		return result;
	}

	public static void main(String[] args) {
		Problem171 p = new Problem171();
		int titleToNumber = p.titleToNumber("AAA");
		System.out.println(titleToNumber);
	}

}
