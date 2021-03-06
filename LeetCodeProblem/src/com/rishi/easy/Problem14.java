package com.rishi.easy;

public class Problem14 {

	 public String longestCommonPrefix(String[] strs) {
	   
		 String prefix = strs[0];
		 for(int i=0 ; i<strs.length ; i++) {
			 while(strs[i].indexOf(prefix) != 0) {
				 prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
			 }
		 }
		 
		 return prefix;
		
	    }
	 
	public static void main(String[] args) {
		Problem14 r = new Problem14();
		String[] strs = {"Flower", "Flow", "Flow"};
		String longestCommonPrefix = r.longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	} 
}
