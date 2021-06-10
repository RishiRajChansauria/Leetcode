package com.rishi.medium;

public class Problem1006 {
	
	 public int clumsy(int N) {
	        return recursion(N, 1);
	    }
	    
	    private int recursion(int N, int flag){
	        if(N<=0) return 0;
	        if(N==1) return flag*1;
	        if(N==2) return flag*2;
	        if(N==3) return flag*6;
	        
	        return ((flag*N*(N-1)) / (N-2)) + (N-3) + recursion(N-4, -1);
	    }

	public static void main(String[] args) {
		Problem1006 p = new Problem1006();
		int clumsy = p.clumsy(6);
		System.out.println(clumsy);
	}

}
