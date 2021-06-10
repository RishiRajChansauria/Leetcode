package com.rishi.medium;

import java.util.Arrays;

public class Problem16 {

	public int threeSumClosest(int[] nums, int target) {
		if(nums.length < 3 || nums==null){
			return -1;
		}
		Arrays.sort(nums);
		int closet = nums[0] + nums[1] + nums[2];
		
		for(int i=0;i<nums.length;i++){
		int	left=i+1,right=nums.length-1;
			while(left < right){
				int sum = nums[i] + nums[left] + nums[right];
				if(Math.abs(sum-target) < Math.abs(closet-target)){
					closet = sum;
				}
				if(sum < target){
					left++;
				}
				else{
					right--;
				}
			}
		}
		
		return closet;
	}

	public static void main(String[] args) {
		int [] nums = {0,2,1,-3};
		int target = 1;
		Problem16 p = new Problem16();
		long start = System.currentTimeMillis();
		int threeSumClosest = p.threeSumClosest(nums, target);
		long end = System.currentTimeMillis();
		System.out.println("Took : " + ((end - start) / 1000));
		System.out.println(threeSumClosest);

	}

}

//Brute Force Solution

/*if(nums.length==0) 
	return 0;
Set<Integer> sums = new TreeSet<Integer>();
Map<Integer,Integer> hs = new TreeMap<Integer,Integer>();
int min=0,result=0;
for(int i=0;i<nums.length-2;i++){
for(int j=i+1;j<nums.length-1;j++){
	for(int k=j+1;k<nums.length;k++){
		sums.add(nums[i] + nums[j] + nums[k]);
	}
}
}

for(int sum : sums){
	System.out.println(sum);
	hs.put(sum, Math.abs(target-sum));
}
min = Collections.min(hs.values());

for(Map.Entry<Integer, Integer> entry : hs.entrySet()){
	if(entry.getValue()==min){
		result=entry.getKey();
		break;
	}
}
return result;*/