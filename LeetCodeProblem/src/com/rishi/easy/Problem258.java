package com.rishi.easy;

public class Problem258 {



	public int addDigits(int num) {
		int sum = 0;
		if(num<10)
			return num;
		int i=0;

		while(num>=1 || sum >= 10) {
			if(sum >= 10 && num%10 < 1 && num<10) {
				num = sum;
				sum =0;
			}
			if(num>=10)
				i=num%10;
			else
				i=num;
			sum+=i;
			num/=10;

		}

		if(sum ==10) return 1;

		return sum;
	}

	public static void main(String[] args) {


		Problem258 p258 = new Problem258();
		int addDigits = p258.addDigits(708538619);
		System.out.println(addDigits);
	}

}
