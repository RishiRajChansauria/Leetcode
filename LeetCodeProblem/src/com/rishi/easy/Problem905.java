package com.rishi.easy;

public class Problem905 {


	public int[] sortArrayByParity(int[] A) {
		int j=0;
		int i=0;
		while(i<A.length) {
			if(A[i]%2!=0)
				i++;
			else {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				j++;
				i++;
			}
		}
		
		
		return A;
	}

	public static void main(String[] args) {
		
		Problem905 p = new Problem905();
		int [] A = {0};
		int[] sortArrayByParity = p.sortArrayByParity(A);
		for(int i=0;i<sortArrayByParity.length;i++)
			System.out.println(sortArrayByParity[i]);
	}

}
