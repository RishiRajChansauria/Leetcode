package com.rishi.easy;

import java.util.HashMap;

public class Problem697 {

	public int findShortestSubArray(int[] nums) {

		HashMap<Integer, Integer> freq = new HashMap<>();
		HashMap<Integer,Integer> firstSeen = new HashMap<>();
		int degree = 0;
		int min_length = 0;
		for(int i=0;i<nums.length;i++) {
			firstSeen.putIfAbsent(nums[i], i);
			freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
			if(freq.get(nums[i]) > degree) {
				degree = freq.get(nums[i]);
				min_length = i - firstSeen.get(nums[i]) + 1;
			}else if (freq.get(nums[i]) == degree) {
				min_length = Math.min(min_length,i - firstSeen.get(nums[i]) + 1);
			}
		}
		return min_length;
	}

	public static void main(String[] args) {
		Problem697 p = new Problem697();
		int [] nums = {1,2,2,3,1,4,2};
		System.out.println(p.findShortestSubArray(nums));
	}

}
