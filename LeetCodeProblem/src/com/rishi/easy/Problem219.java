package com.rishi.easy;

import java.util.HashMap;

public class Problem219 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean result = false;
		if(nums.length==0){
			return result;
		}
		HashMap<Integer,Integer> library = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(library.containsKey(nums[i])){
				result =Math.abs(library.get(nums[i]) - i) <= k ? true:false;
				if(result)
					return result;
				library.put(nums[i], i);
			}
			else{
				library.put(nums[i], i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Problem219 p = new Problem219();
		int [] nums = {0,1,2,3,4,0,0,7,8,9,10,11,12,0};
		boolean containsNearbyDuplicate = p.containsNearbyDuplicate(nums, 1);
		System.out.println(containsNearbyDuplicate);
	}

}
