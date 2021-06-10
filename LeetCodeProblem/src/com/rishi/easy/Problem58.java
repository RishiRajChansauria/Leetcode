package com.rishi.easy;

public class Problem58 {

	public int lengthOfLastWord(String s) {
		String[] arrayOfWords = s.split("\\s");
		if(arrayOfWords == null || arrayOfWords.length==0)
			return 0;
		String lastWord = arrayOfWords[arrayOfWords.length-1];
		return lastWord.length();
	}

	public static void main(String[] args) {
		Problem58 p = new Problem58();
		int lengthOfLastWord = p.lengthOfLastWord("");
		System.out.println(lengthOfLastWord);
	}

}
