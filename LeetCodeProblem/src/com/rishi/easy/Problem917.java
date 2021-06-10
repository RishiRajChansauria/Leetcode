package com.rishi.easy;

import java.util.Arrays;
import java.util.Stack;

public class Problem917 {
	
	 public String reverseOnlyLetters(String S) {
		 char[] charArray = S.toCharArray();
		 int i=0;
		 int j=charArray.length-1;
		
		while(i < j) {
			 int charValue = charArray[i];
			 int charValueEnd = charArray[j];
			 if(((charValue>=65 && charValue <= 90) || (charValue>=97 && charValue <= 122)) && ((charValueEnd>=65 && charValueEnd <= 90) || (charValueEnd>=97 && charValueEnd <= 122)) ) {
				 char temp = charArray[i];
				 charArray[i] = charArray[j];
				 charArray[j] = temp;
				 i++;
				 j--;
				 continue;
			 }
			 if(((charValue>=65 && charValue <= 90) || (charValue>=97 && charValue <= 122))) {
				 j--;
				 continue;
			 }
			 if(((charValueEnd>=65 && charValueEnd <= 90) || (charValueEnd>=97 && charValueEnd <= 122)) ) {
				 i++;
				 continue;
			 }
			 i++;
		 }
		 
	 
		 return String.valueOf(charArray);
		 
		/* Stack<Character> stack = new Stack<Character>();
		 StringBuilder sb = new StringBuilder();
		 char[] charArray = S.toCharArray();
		 for(int i=0;i<charArray.length;i++) {
			 if(Character.isAlphabetic(charArray[i]))
			 stack.push(S.charAt(i));
		 }
		 for(int i=0;i<charArray.length;i++) {
			 if(Character.isAlphabetic(charArray[i])) {
				 sb.append(stack.pop());
			 }else {
				 sb.append(charArray[i]);
			 }
		 }
		 
		 
		 
		 return sb.toString();*/
	 }
	

	public static void main(String[] args) {
		
		Problem917 p = new Problem917();
		String reverseOnlyLetters = p.reverseOnlyLetters("a-bC-dEf-ghIj");
		System.out.println(reverseOnlyLetters);

	}

}
