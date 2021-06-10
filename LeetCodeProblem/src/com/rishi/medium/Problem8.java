package com.rishi.medium;

public class Problem8 {


	public int myAtoi(String str) {

		StringBuilder sb = new StringBuilder();
		int count =0;
		if(str.length()==1 && (!Character.isDigit(str.charAt(0))))
			return 0;
		for(int i=0;i<str.length();i++) {
			if(count==1) {
				if(Character.isDigit(str.charAt(i)))
					sb.append(str.charAt(i));
				else
					break;
			}
			if(Character.isDigit(str.charAt(i)) || Character.isWhitespace(str.charAt(i)) || str.charAt(i)==46 || str.charAt(i)==43 || str.charAt(i)==45) {
				if(count==1) continue;
				if(Character.isWhitespace(str.charAt(i))) continue;
				sb.append(str.charAt(i));
				count=1;
			}
			else {
				return 0;
			}
		}

		if(sb.length()==0) {
			return 0;
		}


		Double number;

		try {
			number = Double.parseDouble(sb.toString());
		} catch (NumberFormatException e) {
			return 0;
		}

		if((number < 0 && number > Integer.MIN_VALUE) || (number > 0 && number < Integer.MAX_VALUE)) {
			return number.intValue();	
		}
		else {
			if(number <= Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			if(number >= Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
		}

		return 0;
	}

	public static void main(String[] args) {

		Problem8 p = new Problem8();
		int myAtoi = p.myAtoi(".457");
		System.out.println(myAtoi);
	}

}

