package com.rishi.medium;

public class Problem81 {
	
	 public boolean search(int[] nums, int target) {
         // The Algorithm is to find the minimum element and that will be start of binary search
        if(nums.length == 0) return false;
        if(nums.length == 1){
            if(nums[0] == target) return true;
            else return false;
        }
        int m=0,j=nums.length-1;
        int start =0, end = nums.length-1;
        while(m<j){
        	if((nums[m] == nums[j])) {
        		j--;
        	}
           m++;
         }
        start = m;
   
        if(target >= nums[start] && target <= nums[end]){
            for(int i=start;i<=end;i++){
                if(target!=nums[i])
                    continue;
                else
                    return true;
            }
        }
        else{
            for(int i=start;i>=0;i--){
                if(target!=nums[i])
                    continue;
                else
                    return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		Problem81 p = new Problem81();
		System.out.println(p.search(new int[] {1}, 1));
	}

}
