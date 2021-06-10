package com.rishi.easy;

public class Problem35 {
	
	 public int searchInsert(int[] nums, int target) {
	     
		 int low = 0;
		 int high = nums.length-1;
		 int mid = low+(high - low)/2;
		 if(nums[mid] == target) return mid;
		 
		 if(nums[high] < target) return high+1;
		 
		 if(nums[mid] < target && nums[mid+1] > target) return mid+1;
		 
		 if(nums[mid] < target) {
			 for(int i=mid+1;i<=high;i++) {
				 if(nums[i] == target)
					 return i;
				 if(i<high) {
					 if(nums[i] < target && nums[i+1] > target) {
						 return i+1;
					 }
				 }
			 }
		 }
			 if(nums[mid] > target) {
				 for(int i=0;i<=mid+1;i++) {
					 if(nums[i] == target)
						 return i;
						 if(nums[i] < target && nums[i+1] > target )
							 return i+1;
				 }
		 }
	    
		 return 0;
	 }
	public static void main(String[] args) {
		
		Problem35 p35 = new Problem35();
		int [] nums = {1,3};
		int target = 3;
		int searchIndex = p35.searchInsert(nums, target);
		System.out.println(searchIndex);
	}

}
