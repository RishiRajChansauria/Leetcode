package com.rishi.medium;

import java.util.ArrayList;
import java.util.List;

/*1. Sort the array and comapre the consecutive elements
2. Hashmap store count of element as values.
*/
public class Problem442 {
	
	
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		 for(int i =0;i<nums.length;i++) {
			 int abs = Math.abs(nums[i]);
			 if(nums[abs -1] < 0)
				 list.add(abs);
			 nums[abs-1] = 0 - Math.abs(nums[abs -1]);
			  
		 }
		
	        return list;
	}


	public static void main(String[] args) {

		Problem442 p = new Problem442();
		int [] nums = {4,3,2,7,8,2,3,1};
		List<Integer> findDuplicates = p.findDuplicates(nums);
		for (Integer integer : findDuplicates) {
			System.out.println(integer);
		}
	}

}
