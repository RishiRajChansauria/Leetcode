package com.rishi.easy;

import java.util.HashMap;

public class Problem594 {

	public int findLHS(int[] nums) {
		
		HashMap<Integer,Integer> lib = new HashMap<>();
		int res =0;
		for(int n : nums) {
			lib.put(n, lib.getOrDefault(n, 0)+1);
		}
		
		for(int n : lib.keySet()) {
			if(lib.containsKey(n+1)) {
				res = Math.max(res, lib.get(n) + lib.get(n+1));
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		Problem594 p = new Problem594();
		int [] nums = {1,3,2,2,5,2,3,7};
		System.out.println(p.findLHS(nums));
	}

}
