package com.rishi.easy;

import java.util.HashMap;

public class Problem1 {
	
	public int[] twoSum(int[] nums, int target) {
		int [] result = new int[2];
		if(nums == null || nums.length==0){
			return result;
		}
		HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(visited.containsKey(target-nums[i])){
				result[0] = visited.get(target-nums[i]);
				result[1] = i;
			}
			visited.put(nums[i], i);
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		Problem1 p1 = new Problem1();
		int[] nums = {3,2,4};
		int target =6;
		int[] retrunIndices = p1.twoSum(nums,target);
		for(int i=0;i<retrunIndices.length-1;i++) {
			System.out.println("[" + retrunIndices[i] + "," + retrunIndices[i+1] + "]");
		}

	}
}

/*for(int i=0;i<arr.length;i++) {
for(int j=i+1;j<arr.length;j++) {
	if(((arr[i] + arr[j])==target)) {
		return new int[] {i,j};
	}
}
}
throw new IllegalArgumentException("No two sum solution");*/



// More optimized

/*Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
int complement = target - nums[i];
if (map.containsKey(complement)) {
    return new int[] { map.get(complement), i };
}
map.put(nums[i], i);
}
throw new IllegalArgumentException("No two sum solution");*/