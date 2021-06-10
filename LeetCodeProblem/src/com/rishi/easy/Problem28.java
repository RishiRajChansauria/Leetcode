package com.rishi.easy;

public class Problem28 {
	
	
	 public int strStr(String haystack, String needle) {
	        
		 if(haystack.indexOf(needle) != -1) {
			 return haystack.indexOf(needle);
		 }
		 return -1;
	    }
	
	public static void main(String[] args) {
		Problem28 p = new Problem28();
		String haystack = "hello";
		String needle = "f";
		int strStr = p.strStr(haystack, needle);
		System.out.println(strStr);
	}

}
