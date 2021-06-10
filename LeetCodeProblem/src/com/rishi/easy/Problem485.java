package com.rishi.easy;

public class Problem485 {
	
	
	public int findMaxConsecutiveOnes(int[] nums) {
		
		int count =0;
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				if(max<count && nums[i]!=nums[i-1]) {
					max=count;
					count=0;
				}
			 count=0;
			}
			else
			count++;
		}
		
		max=Math.max(max, count);
		
		return max;
    }

	public static void main(String[] args) {
		
		Problem485 p = new Problem485();
		int [] nums= {1,1,1,0,1,1,0,1,1,1,1};
		int findMaxConsecutiveOnes = p.findMaxConsecutiveOnes(nums);
		System.out.println(findMaxConsecutiveOnes);
	}

}
