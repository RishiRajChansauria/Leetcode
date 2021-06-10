package com.rishi.medium;

public class Problem34 {

	int mid =0;
	public int findMid(int low , int high) {
		mid = low + (high -low)/2;
		return mid;
	}

	public int[] searchRange(int[] nums, int target) {
		int count =0;
		boolean flag = false;
		int [] result = {-1,-1};

		if(nums.length==0) {
			return result;
		}

		int low=0;
		int high = nums.length-1;
		mid = findMid(low, high);
		
		if(target == nums[mid] && nums.length==1) {
			result[0] =mid;
			result[1]=mid;
			return result;
		}

		while(target == nums[mid] && mid!=0) {
			mid = findMid(low,high-=1);
		}

		if(target > nums[mid] || mid ==0) {
			for(int i=mid;i<nums.length;i++) {
				if(nums[i]==target) {
					if(count==0) {
						flag = true;
						result[0]=i;
						result[1]=i;
						count=1;
					}else {
						result[1]=i;
					}
				}
				if(nums[i] != target && flag) break;
			}
			return result;
		}

		if(target < nums[mid]) {
			for(int i=mid;i>=0;i--) {
				if(nums[i]==target) {
					if(count==0) {
						flag = true;
						result[1] = i;
						result[0]=i;
						count=1;
					}else {
						result[0]=i;
					}
				}
				if(nums[i] != target && flag) break;
			}
			return result;
		}

		return result;
	}

	public static void main(String[] args) {

		Problem34 p = new Problem34();
		int [] nums = {0,0,1,2,2};
		int[] searchRange = p.searchRange(nums, 0);
		System.out.println(searchRange[0] +", " + searchRange[1]);
	}

}
