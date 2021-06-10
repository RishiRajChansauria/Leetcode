package com.rishi.easy;

public class Problem204 {

	int count =1;
    int i=3;
	public int countPrimes(int n) {
       if(n<=2) {
    	   return 0;
       }
       
       boolean[] notPrime = new boolean[n];
       
       for(int i=3;i<n;i+=2) {
    	   if(notPrime[i]) {
    		   continue;
    	   }else {
    		   count++;
    	   }
    	   for(int j=3; i*j <n;j+=2) {
    		   notPrime[i*j]=true;
    	   }
       }

		
		
		
		return count; 
	}

	public static void main(String[] args) {
		Problem204 p204 = new Problem204();
		int countPrimes = p204.countPrimes(45555559);
		System.out.println(countPrimes);
	}

}
