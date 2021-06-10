package Arrays;

import java.util.HashMap;

// Two Sum Problem
// Follow up question is will each input have only one solution or not?

public class Problem1 {

	public static int[] twoSum(int[] nums, int target) {
		int [] result = new int[2];
		HashMap<Integer,Integer> lib = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!lib.containsKey(target - nums[i])) {
				lib.put(nums[i], i);
			}else {
				result[0] = lib.get(target-nums[i]);
				result[1] = i;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int [] arr = {2, 7, 11, 15};
		int [] res = twoSum(arr, 9);
		System.out.println(res[0] + "," + res[1]);
	}

}