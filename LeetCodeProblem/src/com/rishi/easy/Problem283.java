package com.rishi.easy;

import java.util.Arrays;

public class Problem283 {
	
	  public void moveZeroes(int[] nums) {
		  int i=0;
		  int j=0;
		  while(i < nums.length) {
			  if(nums[i] == 0)
				  i++;
			  else {
				  int temp = nums[i];
				  nums[i] = nums[j];
				  nums[j] = temp;
				  j++;
				  i++;
			  }
		  }
		  
		  System.out.println(Arrays.toString(nums));
		 
	   }

	public static void main(String[] args) {
		Problem283 p = new Problem283();
		int [] nums = {1,12,0,0,4,5,6};
		p.moveZeroes(nums);
	}

}
