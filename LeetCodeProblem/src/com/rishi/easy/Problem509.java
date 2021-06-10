package com.rishi.easy;

public class Problem509 {
	
	int num1 =0;
	int num2 =1;
	int sum =0;
	public int fib(int N) {
		if(N < 1) return N;
		else {
			for(int i =2 ; i<=N ;i++) {
				sum = num1 + num2;
				num1 = num2;
				num2 = sum;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		
		Problem509 p = new Problem509();
		int fib = p.fib(6);
		System.out.println(fib);
	}

}
