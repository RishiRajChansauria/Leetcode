package com.rishi.easy;

import java.util.Arrays;

public class Problem242 {

	public boolean isAnagram(String s, String t) {
		
	
		if(s.length() != t.length()) return false;
		
		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
	
		if((Arrays.toString(s1).compareTo(Arrays.toString(s2)) == 0))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		Problem242 p = new Problem242();
		boolean anagram = p.isAnagram("car","arc");
		System.out.println(anagram);
	}

}
