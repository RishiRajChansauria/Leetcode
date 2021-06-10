package com.rishi.easy;

public class Problem27 {
	
public int removeElement(int[] nums, int val) {
	
	int i=0;
	
	for(int j=0;j<nums.length;j++) {
		if(nums[j] != val)
			continue;
		else {
			nums[i]=nums[j];
			i++;
		}
	}
	return i;
    }

	public static void main(String[] args) {
		
		Problem27 p27 = new Problem27();
		int [] nums = {0,1,2,2,3,0,4,2};
		int val=2;
		int removeElement = p27.removeElement(nums, val);
		System.out.println(removeElement);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		

	}

}
