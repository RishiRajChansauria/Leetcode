package com.rishi.easy;

public class Problem191 {
	
	public int hammingWeight(int n) {
	    
		int count=0;
		
		while(n > 0) {
			count+=n&1;
			n >>= 1;
		}
		
		return count;
    }

	public static void main(String[] args) {
		
		Problem191 p = new Problem191();
		int hammingWeight = p.hammingWeight(0000000000000000011111111111);
		System.out.println(hammingWeight);
	}

}
