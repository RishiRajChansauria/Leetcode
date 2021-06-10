package com.rishi.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem961 {
	
	  public int repeatedNTimes(int[] A) {
	     
		 /* 
		  Arrays.sort(A);
		  int mid = 0 +((A.length-1)- 0)/2;
		  System.out.println(A[mid]);
		  if(A[mid] == A[mid+1]) return A[mid];
		  if(A[mid] == A[mid-1]) return A[mid];
		  else return A[mid+1];*/
		  
		  //More optimized way.
		  
		  Map<Integer, Integer> count = new HashMap<Integer,Integer>();
		  
	        for (int x: A) {
	            count.put(x, count.getOrDefault(x, 0) + 1);
	        }
            for(int m : count.keySet()) {
            	System.out.println(" hey "+m);
            }
	        for (int k: count.keySet()) {
	        	if (count.get(k) > 1)
	        		return k;
	        }

	        throw null;
	    }

	public static void main(String[] args) {
		
		Problem961 p961 = new Problem961();
		int [] A = {2,1,2,5,3,2};
		int repeatedNTimes = p961.repeatedNTimes(A);
		System.out.println(repeatedNTimes);
	}

}
