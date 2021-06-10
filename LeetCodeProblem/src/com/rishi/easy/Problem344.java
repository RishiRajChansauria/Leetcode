package com.rishi.easy;

public class Problem344 {
	
	 public void reverseString(char[] s) {
	     
		 for(int i=0;i<s.length/2;i++) {
			 char temp = s[i];
			 s[i] = s[s.length-(i+1)];
			 s[s.length-(i+1)]= temp;
		 }
		 
		 System.out.println(s);
		 
	   }

	public static void main(String[] args) {
		
		Problem344 p344 = new Problem344();
		char[] s = {'h','e','l','l','o'};
		p344.reverseString(s);
	}

}
