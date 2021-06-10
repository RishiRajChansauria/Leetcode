package com.rishi.easy;

import java.util.Arrays;

public class Problem976 {
	
	 public int largestPerimeter(int[] A) {
	     
		 Arrays.sort(A);
         for(int i=A.length-3;i>=0;i--) {
        	 if(A[i]+A[i+1]>A[i+2]) {
        		 return A[i]+A[i+1]+A[i+2];
        	 }
         }

		 return 0;
	    }

	public static void main(String[] args) {
		Problem976 p = new Problem976();
		int [] A = {3,6,2,3};
		int largestPerimeter = p.largestPerimeter(A);
		System.out.println(largestPerimeter);
	}

}
