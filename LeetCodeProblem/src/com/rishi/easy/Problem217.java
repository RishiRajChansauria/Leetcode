package com.rishi.easy;

import java.util.Arrays;

public class Problem217 {
	
	private boolean flag = false; 
	
	 public boolean containsDuplicate(int[] nums) {
		
		 Arrays.sort(nums);
		 for (int i=0;i<nums.length-1;i++) {
			 if(nums[i] != nums[i+1]) continue;
			 else {
				 flag = true;
				 break;
			 }
		 }
		 
		 return flag;
	  }

	public static void main(String[] args) {
		
		Problem217 p = new Problem217();
		int [] nums = {1,2,3,4,5,6};
		boolean containsDuplicate = p.containsDuplicate(nums);
		System.out.println(containsDuplicate);
	}

}
