package com.rishi.easy;

public class Problem557 {

	public String reverseWords(String s) {
		
		/*String[] words= s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<words.length;i++) {
			sb.append(new StringBuilder(words[i]).reverse().toString() + " ");
		}
		return sb.toString().trim();*/
		
		StringBuilder sb = new StringBuilder();
		int j=0;
		int k=0;
		for(int i=0;i<s.length();i++) {
			boolean flag = false;
				if(s.charAt(i)==' ' || i==s.length()-1) {
					if(i==s.length()-1)
						j++;
					while(j > k) {
					sb.append(s.charAt(j-1));
					j--;
				}
					sb.append(' ');
					flag = true;
			}
				if(flag) {
					j=i+1;
					k=j;
				}else
					j++;
		}
		
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		Problem557 p = new Problem557();
		String reverseWords = p.reverseWords("Let's take LeetCode contest");
		System.out.println(reverseWords);
	}

}
