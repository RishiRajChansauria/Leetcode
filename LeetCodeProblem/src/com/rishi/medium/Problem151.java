package com.rishi.medium;

public class Problem151 {

	public String reverseWords(String s) {

		StringBuilder sb = new StringBuilder();
		s=s.trim();
		int k=s.length()-1;
		int j=s.length()-1;
		for(int i=s.length()-1;i>=0;i--) {
			boolean flag = false;
			if(s.charAt(i)==' '|| i==0) {
				if(i==0)
					sb.append(" ");
				while(j<=k) {
					sb.append(s.charAt(j));
					j++;
				}
				if(s.charAt(i)==' ' && i>0) {
					while(s.charAt(i-1) == ' ')
					i--;
				}
				flag = true;
			}
			j--;
			if(flag) {
				j=i-1;
				k=j;
			}
			
			
		}

		return sb.toString().trim();
	}




	public static void main(String[] args) {
		Problem151 p = new Problem151();
		String reverseWords = p.reverseWords("the sky is blue");
		System.out.println(reverseWords);
	}

}
