package com.rishi.medium;

import java.util.Arrays;
import java.util.Comparator;

public class Problem179 implements Comparator<String> {

	public String largestNumber(int[] nums) {
		String result = "";
		String[] strNums = new String[nums.length];
		for(int i=0;i<nums.length;i++) {
			strNums[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(strNums, new Problem179());
		
		 for(int i=0;i<strNums.length;i++) {
	        	result += strNums[i];
	     }
	        
		
		return result;
	}


	public static void main(String[] args) {
		Problem179 p = new Problem179();
		int [] nums = {3,30,34,5,9};
		String largestNumber = p.largestNumber(nums);
		System.out.println(largestNumber);

	}


	@Override
	public int compare(String s1, String s2) {
		String result1 = s1+s2;
		String result2 = s2+s1;
		return result2.compareTo(result1);
	}

}
