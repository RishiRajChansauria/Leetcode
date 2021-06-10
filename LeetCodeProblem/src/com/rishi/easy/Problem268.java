package com.rishi.easy;

//Find the missing number.

public class Problem268 {

	public int missingNumber(int[] nums) {
		int TotalSum =0;
		int sum=0;
		int length =nums.length;
		for(int i=0;i< length;i++) {
			TotalSum+=i;
			sum+=nums[i];
		}
		TotalSum=TotalSum + length;
		
		return TotalSum - sum;
	}

	public static void main(String[] args) {


		Problem268 p268 = new Problem268();
		int [] nums = {1,2};
		int missingNumber = p268.missingNumber(nums);
		System.out.println(missingNumber);

	}

}
