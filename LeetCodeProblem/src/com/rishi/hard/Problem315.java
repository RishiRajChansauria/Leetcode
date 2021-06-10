package com.rishi.hard;

import java.util.ArrayList;
import java.util.List;

public class Problem315 {

	public List<Integer> countSmaller(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int count =0;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i] > nums[j]) {
					count++;
				}
			}
			res.add(count);
		}
		return res;
	}

	public static void main(String[] args) {
		Problem315 p = new Problem315();
		int [] nums = {5,2,6,1};
		List<Integer> countSmaller = p.countSmaller(nums);
		for(int x : countSmaller) {
			System.out.println(x);
		}
	}

}
