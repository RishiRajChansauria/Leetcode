package com.rishi.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem387 {
	
	 int index = 0;
	/* boolean flag = false;
	 int i=0;*/
	
	 Map<Character,Integer> hs = new LinkedHashMap<Character,Integer>();
	 
	 public int firstUniqChar(String s) {
/*		 for(int i=0;i<s.length();i++) {
			 char charAt = s.charAt(i);
			 int indexOf = s.indexOf(charAt);
			 int lastIndexOf = s.lastIndexOf(charAt);
			 if(indexOf != lastIndexOf) {
				continue;
			 }else {
				 index= i;
				 flag = true;
				 break;
			 }
		 }
		 if(flag) return index;
		 else
		 return -1;*/
		 
		 if(s.equals("")) return -1;
		 
		 for(int i=0;i<s.length();i++) {
			 hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) +1);
		 }
		 
		 for(char x : hs.keySet()) {
			 if(hs.get(x) == 1) {
				 index = s.indexOf(x);
				 break;
			 }
			 else index=-1;
		 }
		
		 return index;

		 
	 }

	public static void main(String[] args) {
		
		Problem387 p = new Problem387();
		int firstUniqChar = p.firstUniqChar("leetcode");
		System.out.println(firstUniqChar);
	}

}
