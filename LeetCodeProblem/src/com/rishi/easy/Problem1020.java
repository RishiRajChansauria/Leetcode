package com.rishi.easy;

public class Problem1020 {

	public boolean canThreePartsEqualSum(int[] A) {
		int sum =0, leftSum=0, count=0;
		
		for(int x: A)
		  sum+=x;	
		
		for(int i=0;i<A.length;i++) {
			if(leftSum == sum/3) {
				count++;
				leftSum=0;
			}
			leftSum+=A[i];
		}
		
		if(leftSum == sum/3)
			count++;
		
		if(count == 3) 
			return true;
		return false;
	}

	public static void main(String[] args) {
		
		Problem1020 p = new Problem1020();
		int [] A = {3,3,6,5,-2,2,5,1,-9,4};
		boolean canThreePartsEqualSum = p.canThreePartsEqualSum(A);
		System.out.println(canThreePartsEqualSum);
	}

}
