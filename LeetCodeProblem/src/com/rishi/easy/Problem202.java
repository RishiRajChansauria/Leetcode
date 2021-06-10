package com.rishi.easy;

public class Problem202 {

	int res=0;
	public boolean isHappy(int n) {
		res=n;
		while(res >= 10) {
			res=breakNumberAndSumSquare(res);
		}
		if(res==1 || res==7) {
			return true;
		}else
		return false;
	}

	private int breakNumberAndSumSquare(int n) {
		res=0;
		while(n>=10) {
			int a = n%10;
			n=n/10;
			res+=(int) (Math.pow(a, 2));
		}
		return (int) (res + Math.pow(n, 2));
	}

	public static void main(String[] args) {

		Problem202 p = new Problem202();
		boolean happy = p.isHappy(10);
		System.out.println(happy);
	}

}
