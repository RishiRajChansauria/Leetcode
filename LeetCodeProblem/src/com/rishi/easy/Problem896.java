package com.rishi.easy;

public class Problem896 {
	
   public boolean isMonotonic(int[] A) {
       
	   int countIncreasing=0;
	   int countDecreasing=0;
	   for(int i=0;i<A.length-1;i++) {
			if(A[i] <= A[i+1])
				   countIncreasing++;
			if(A[i] >= A[i+1])
				   countDecreasing++;
	   }
	   
	   if(countIncreasing == A.length-1 || countDecreasing == A.length-1)
		   return true;
	   else
	   return false;
    }
	

	public static void main(String[] args) {
		
		Problem896 p = new Problem896();
		int [] A = {6,5,4,4};
		boolean monotonic = p.isMonotonic(A);
		System.out.println(monotonic);
	}

}
