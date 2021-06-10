package com.rishi.easy;

public class Problem172 {

	 public int trailingZeroes(int n) {
	/*     int i=1;
	     long count=0;
		 while(i<=Math.sqrt(n)) {
			 if(n%(Math.pow(5, i)) >= 1 || n%(Math.pow(5, i))==0) {
				 count+=n/(Math.pow(5, i));
			 }
			 else {
				 break;
			 }
			 i++;
		 }
		 
		 return (int)count;*/
		 
		 return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	 }
	
	public static void main(String[] args) {
		Problem172 p172 = new Problem172();
		int trailingZeroes = p172.trailingZeroes(25);
		System.out.println(trailingZeroes);
	}

}
