package com.rishi.easy;

public class Problem189 {
	
  public void rotate(int[] nums, int k) {
	  
	  int m = 0;
	  int i =0;
	  int temp =0;
	  while(m!=k) {
		  int j = nums.length-1;
		  temp = nums[j];
		  while(j!=0) {
			  nums[j] = nums[j-1];
			  j--;
		  }
		  nums[i] = temp;
		  m++;
	  }
        
    }

	public static void main(String[] args) {
		Problem189 p = new Problem189();
		int k =2;
		int [] nums = {-1,-100,3,99};
		p.rotate(nums, k);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

	}

}
