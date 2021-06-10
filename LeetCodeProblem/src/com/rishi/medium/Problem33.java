package com.rishi.medium;

public class Problem33 {
	
	public int search(int [] nums, int target) {
		if(nums.length == 0)
			return -1;
		if(nums.length == 1) {
			if(nums[0] == target)
				return 0;
			return -1;
		}
		int low =0;
		int high = nums.length-1;
		int mid = low + (high - low)/2;
		
		if(nums[mid] <= nums[high]) {
			if(target >= nums[mid] && target <= nums[high]) {
				for(int i=mid ;i<=high ;i++) {
					if(target == nums[i])
						return i;
				}
				return -1;
			}else {
				for(int i=mid;i>=0;i--) {
					if(target == nums[i])
						return i;
				}
				return -1;
			}
		}else {
			if(target >= nums[low] && target <= nums[mid]) {
				for(int i=low ;i<=mid ;i++) {
					if(target == nums[i])
						return i;
				}
				return -1;
			}else {
				for(int i=mid;i<=high;i++) {
					if(target == nums[i])
						return i;
				}
				return -1;
			}
		}
		
	}

	public static void main(String[] args) {
		Problem33 p = new Problem33();
		//int [] nums = {4,5,6,7,8,9,10,11,1,2,3};
		//int [] nums = {5,1,3};
		//int [] nums = {1,3};
		int [] nums = {3,5,1};
		System.out.println(p.search(nums, 3));
	}

}
