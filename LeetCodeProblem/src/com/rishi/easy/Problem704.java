package com.rishi.easy;

public class Problem704 {

	public int search(int[] nums, int target) {
		if(nums.length==0) return -1;
	    int low =0;
	    int high =nums.length-1;
		int mid = low + (low+high)/2;
		System.out.println(mid);
		if(target == nums[mid]) return mid;
		if(target > nums[mid]) {
			for(int i=mid;i<=high;i++) {
				if(nums[i]== target) 
					return i;
			}
		}else if(target < nums[mid]) {
			for(int i=0;i<=mid;i++) {
				if(nums[i]== target) 
					return i;
			}
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		
		Problem704 p = new Problem704();
		int [] nums= {2,5};
		int search = p.search(nums, 5);
		System.out.println(search);
	}

}
