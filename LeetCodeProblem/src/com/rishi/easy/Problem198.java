package com.rishi.easy;

public class Problem198 {

	public int rob(int[] nums) {
		int sum1=0,sum2=0;
		
		for(int i=0;i<nums.length;i++){
			if(i%2!=0){
				sum1=Math.max(sum1+nums[i], sum2);
			}else{
				sum2=Math.max(sum2+nums[i], sum1);
			}
		}
		return Math.max(sum1, sum2);
	}

	public static void main(String[] args) {
		Problem198 p = new Problem198();
		int[] nums = {2,7,9,3,1};
		int rob = p.rob(nums);
		System.out.println(rob);
	}

}
//2,1,1,2
//1,2,3,1
//2,7,9,3,1