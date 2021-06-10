package com.rishi.easy;

public class Problem26 {
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	public static void main(String[] args) {
		Problem26 p26 = new Problem26();
		int [] nums = {1,2,2};
		int removeDuplicates = p26.removeDuplicates(nums);
		System.out.println(removeDuplicates);

	}

}
