package com.rishi.easy;

import java.util.Arrays;

// 0,1,1,2,3,5,8,13,21,34
public class Problem977 {
	
   public int[] sortedSquares(int[] A) {
       int[] b = new int[A.length];
       
       for(int i=0;i<A.length;i++) {
    	   b[i] = A[i]*A[i];
       }
	   
       Arrays.sort(b);
       
	   return b;
    }

	public static void main(String[] args) {
		Problem977 p = new Problem977();
		int[] A = {-4,-1,0,3,10};
		int[] sortedSquares = p.sortedSquares(A);
		for(int i=0;i<sortedSquares.length;i++) {
			System.out.println(sortedSquares[i]);
		}
	}

}
