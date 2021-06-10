package com.rishi.medium;

public class Problem1004 {

	public int longestOnes(int[] A, int K) {
		
		int start =0, end = 0;
		int countOfZero =0;
		while(end < A.length) {
			if(A[end] == 0) countOfZero++;
			if(countOfZero > K) {
				if(A[start]==0) {
					countOfZero--;
				}
				start++;
			}
			end++;
		}
		
		return end-start;
	}

	public static void main(String[] args) {
		Problem1004 p = new Problem1004();
		int [] A = {1,1,1,0,0,0,1,1,1,1,0};
		System.out.println(p.longestOnes(A, 2));
	}

}
