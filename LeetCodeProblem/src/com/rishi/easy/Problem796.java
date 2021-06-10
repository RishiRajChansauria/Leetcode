package com.rishi.easy;

public class Problem796 {

	public boolean rotateString(String A, String B) {
		if(A.equals("") || B.equals("")) return true;
		int i=1;
		int j =A.length();
	
		boolean flag=false;
		StringBuilder sb = new StringBuilder(A);
		for(int m=0;m<j-1;m++) {
			sb = new StringBuilder(sb.substring(i, j) + sb.substring(0, i));
			if(sb.toString().equals(B)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		Problem796 p = new Problem796();
		boolean rotateString = p.rotateString("","");
		System.out.println(rotateString);
	}

}
