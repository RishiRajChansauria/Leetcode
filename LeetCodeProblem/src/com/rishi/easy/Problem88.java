package com.rishi.easy;

import java.util.Arrays;

public class Problem88 {
	
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		int j=0;
		for(int i=m ;i<nums1.length;i++) {
			nums1[i] = nums2[j];
			j++;
		}
		
		Arrays.sort(nums1);
		
		for(int i=0;i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
	 }

	public static void main(String[] args) {
		Problem88 p88 = new Problem88();
		int[] nums1 = {-1,0,0,3,3,3,0,0,0};
		int[] nums2 = {1,2,2};
		int m =6;
		int n = 3;
		p88.merge(nums1, m, nums2, n);
		
	}

}
