package com.rishi.easy;

public class Problem326 {

	public boolean isPowerOfThree(int n) {
		
		/*if(n == 0) return false;

		while(n%3==0) {
			n = n/3;
		}
		if(n == 1) {
			return true;
		}
		else
			return false;*/
		
		return (int)Math.pow(3, 19)%n==0 ? true:false;
		
	}

	public static void main(String[] args) {
		Problem326 p = new Problem326();
		boolean powerOfThree = p.isPowerOfThree(30);
		System.out.println(powerOfThree);

	}

}
