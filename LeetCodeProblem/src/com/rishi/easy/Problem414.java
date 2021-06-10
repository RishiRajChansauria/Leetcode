package com.rishi.easy;

import java.util.Arrays;

public class Problem414 {

	public int thirdMax(int[] nums) {
		
		Arrays.sort(nums);
		int j= nums.length-1;
		int count=0;
		for(int i=j;i>0;i--) {
			if(nums[i] > nums[i-1]) {
				count++;
			}
			if(count==2)
				return nums[i-1];
				
		}
		
		return nums[j];
	}

	public static void main(String[] args) {
		
		Problem414 p = new Problem414();
		int [] nums = {1,2};
		int thirdMax = p.thirdMax(nums);
		System.out.println(thirdMax);

	}

}

/*TreeSet<Integer> set = new TreeSet<Integer>();
for(int x : nums) {
	set.add(x);
}

if(set.size()>=3) {
	if(set.size()>3) {
		while(set.size()!=3) {
			set.remove(set.first());
		}
		return set.first();
	}
	return set.first();
}

return set.last();*/


/*Set<Integer> set = new HashSet<Integer>();
for(int x : nums) {
	set.add(x);
}

List<Integer> list = new ArrayList<Integer>(set);
Collections.sort(list);
if(list.size()>=3) {
	if(list.size()>3) 
		return list.get(list.size()-3);
	return list.get(0);
}

return list.get(list.size()-1);
*/