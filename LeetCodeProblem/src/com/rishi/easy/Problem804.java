package com.rishi.easy;

import java.util.HashSet;
import java.util.Set;

public class Problem804 {

	public int uniqueMorseRepresentations(String[] words) {
		String[] MORSE = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };

		Set<String> seen = new HashSet<>();
		for (String word : words) {
			StringBuilder code = new StringBuilder();
			for (char c : word.toCharArray())
				code.append(MORSE[c - 'a']);
			seen.add(code.toString());
		}

		return seen.size();
	}

	public static void main(String[] args) {
		Problem804 p = new Problem804();
		String [] words = {"gin", "zen", "gig", "msg"};
		System.out.println(p.uniqueMorseRepresentations(words));
	}

}
