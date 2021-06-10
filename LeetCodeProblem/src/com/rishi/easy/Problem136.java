package com.rishi.easy;

import java.util.HashMap;
import java.util.HashSet;

public class Problem136 {
	
	 public int singleNumber(int[] nums) {
	  
	 HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
	 String A = null;
	 char[] aArray=A.toCharArray();

	  for(int a : nums) {
		  hs.put(a, hs.getOrDefault(a, 0) + 1);
	  }
	  
	  for(int k : hs.keySet()) {
		  if(hs.get(k) != 1) {
			  continue;
		  }else return k;
	  }
	  
	   throw null;
	 }

	
	public static void main(String[] args) {
		Problem136 p = new Problem136();
		int [] nums = {4,1,2,1,2};
		int singleNumber = p.singleNumber(nums);
		System.out.println(singleNumber);

	}

}
