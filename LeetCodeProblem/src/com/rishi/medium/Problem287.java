package com.rishi.medium;

public class Problem287 {
	
    public int findDuplicate(int[] nums) {
     	for(int i=0;i<nums.length;i++) {
            if(nums[Math.abs(nums[i])] < 0){
                return -nums[i];
            }else{
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            }
		}
        return 0;
    }

	public static void main(String[] args) {
		
		Problem287 p = new Problem287();
		int [] nums= {1,3,4,2,2};
		int findDuplicate = p.findDuplicate(nums);
		System.out.println(findDuplicate);
	}

}
