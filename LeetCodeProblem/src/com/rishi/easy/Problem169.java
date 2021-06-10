package com.rishi.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Problem169 {
	
	 public int majorityElement(int[] nums) {
/*		 int threshold = nums.length/2;
		 HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<nums.length;i++) {
			 hs.put(nums[i], hs.getOrDefault(nums[i], 0) +1);
			 if(hs.get(nums[i]) > threshold) {
				return nums[i];
			 }
		 }
		 return 0;*/
		Arrays.sort(nums);
	    return nums[nums.length/2];  
	 }
	

	public static void main(String[] args) {
		
		Problem169 p = new Problem169();
		int [] nums = {2,2,1,1,1,2,2};
		int majorityElement = p.majorityElement(nums);
		System.out.println(majorityElement);
	}

}
