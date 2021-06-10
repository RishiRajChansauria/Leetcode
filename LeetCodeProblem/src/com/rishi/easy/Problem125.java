package com.rishi.easy;

public class Problem125 {
	
	 public boolean isPalindrome(String s) {
	 
		 StringBuilder sb = new StringBuilder();
		 String CopySb;
		 for(int i=0;i<s.length();i++) {
			 if(Character.isLetterOrDigit(s.charAt(i))) {
				 sb.append(s.charAt(i));
			 }
		 }
		CopySb = sb.toString();
		sb.reverse();
		System.out.println(CopySb);
		System.out.println(sb.toString());
		if(sb.toString().equalsIgnoreCase(CopySb.toString())) {
			return true;
		}else
		 return false;
	 }

	public static void main(String[] args) {
		Problem125 p = new Problem125();
		String s = "race a car";
		boolean palindrome = p.isPalindrome(s);
		System.out.println(palindrome);
	}

}
