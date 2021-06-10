package com.rishi.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem724 {
	
	
	private int pivotIndex(int[] nums) {
		if(nums.length==0) return -1;
		int sum1 =0;
		int sum2 =0;
		int j= nums.length-1;
		Map<Integer,Integer> sum1Map = new HashMap<Integer,Integer>();
		Map<Integer,Integer> sum2Map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			sum1Map.put(i, sum1+=nums[i]);
			sum2Map.put(j-i, sum2+=nums[j-i]);
		}
		
		for(int x : sum1Map.keySet()) {
			if(sum1Map.get(x) == sum2Map.get(x)) {
				if(sum1Map.get((sum1Map.size()-1)) - sum1Map.get(0)==0)
					return 0;
				return x;
			}
		}
		
		
		return -1;
	}
	

	public static void main(String[] args) {
		Problem724 p = new Problem724();
		int[] nums = {-1,-1,-1,1,1,1};
		int pivotIndex = p.pivotIndex(nums);
		System.out.println(pivotIndex);
	}


}

/* if(nums.length==0 || nums.length==1) return -1;
		 int i=0;
		 int j=nums.length-1;
		 int k=i+1;
		 int L=j-1;
		 int sum1 =0;
		 int sum2 =0;
		 sum1 = sum1 + nums[i];
		 sum2 = sum2 + nums[j];

		 while(k<L) {
			 if(sum1==sum2) {
				 sum1=sum1+nums[k];
				 sum2=sum2+nums[L];
				 k++;
				 L--;
				 continue;
			 }
			 if(sum1<sum2) {
				 sum1=sum1+nums[k];
				 k++;
				 continue;
			 }
			 if(sum2<sum1) {
				 sum2=sum2+nums[L];
				 L--;
				 continue;
			 }

		 }
		 if(sum1==sum2 && k<=L) {
			 return k;
		 }
		 else
			 return -1;*/
/*int sumLeft=0;
	int sumRight=0;

	public int sumLeft(int low,int high,int[] nums) {
		for(int i=low;i<high;i++) {
			sumLeft=sumLeft+nums[i];
		}
		return sumLeft;
	}
	public int sumRight(int low,int high,int[] nums) {
		for(int i=low;i<=high;i++) {
			sumRight=sumRight+nums[i];
		}
		return sumRight;
	}

	public int pivotIndex(int[] nums) {


		if(nums.length==0) return -1;
		int mid=0;
		int low=0;
		int high=nums.length-1;

		 if(sumRight(low+1, high, nums)==0) return 0;
		 if(sumRight(low, high-1, nums)==0) return 0;

		mid = low+(high-low)/2;
		sumLeft = sumLeft(low, mid, nums);
		sumRight = sumRight(mid+1, high, nums);

		while(sumLeft!=sumRight && mid<high) {
			sumLeft =0;
			sumRight =0;
			mid++;
			sumLeft = sumLeft(low, mid, nums);
			sumRight = sumRight(mid+1, high, nums);
		}

		if(sumLeft!=sumRight) {
			mid = low+(high-low)/2;
			sumLeft =0;
			sumRight =0;
			sumLeft = sumLeft(low, mid, nums);
			sumRight = sumRight(mid+1, high, nums);
		}

		while(sumLeft!=sumRight && low<mid) {
			sumLeft =0;
			sumRight =0;
			mid--;
			sumLeft = sumLeft(low, mid, nums);
			sumRight = sumRight(mid+1, high, nums);
		}

		if(sumLeft!=sumRight)
			return -1;
		else {
			int preMid =mid;
			mid--;
			sumLeft = sumLeft(low, mid, nums);
			sumRight = sumRight(mid+1, high, nums);


			while(sumLeft!=sumRight && low<mid) {
				sumLeft =0;
				sumRight =0;
				mid--;
				sumLeft = sumLeft(low, mid, nums);
				sumRight = sumRight(mid+1, high, nums);
			}

			if(sumLeft!=sumRight) {
				return preMid;
			}else {
				low=0;
				sumLeft =0;
				sumRight =0;
				high=nums.length-1;
				if(sumRight(low+1,high, nums)==0) return 0;
			}
		}

		return mid;

	}
 */