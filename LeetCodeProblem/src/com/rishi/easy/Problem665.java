package com.rishi.easy;

public class Problem665 {
	
	int count =0;
	int i=0;
	int j=0;
	 public boolean checkPossibility(int[] nums) {
	    
		 if(nums.length<2) return true;
		 
		 int i = findIndex(nums);
		 
		 if(i==0 && j==nums.length-1) return true;
		 
		 if(i<nums.length-2 && nums[i] > nums[i+1] && nums[i] < nums[i+2])
		 nums[i+1] = nums[i+2] - 1;
		 else
		 nums[i] = nums[i+1] -1;
	
		 count++;
		 int findIndex = findIndex(nums);
		 
		 if(findIndex ==0) return true;
		 else
		 return false;
	    }
	

	private int findIndex(int[] nums) {
		i=0;
		j=i+1;
		
		while(nums[i]<=nums[j] && (j < nums.length-1)) {
			i++;
			j++;
		}
		
		if(j == nums.length-1 ) {
			if(count ==0) return 0;
			if(nums[i]<=nums[j]) return 0;
			else
				return i;
		}
		else {
			if(count == 0) return i;
			else
			return 1;
		}
		
	}


	public static void main(String[] args) {
		Problem665 p665 = new Problem665();
		int [] nums = {4,2,3};
		boolean checkPossibility = p665.checkPossibility(nums);
		System.out.println(checkPossibility);

	}

}
