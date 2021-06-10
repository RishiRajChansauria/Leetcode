package com.rishi.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> groupedAnagrams = new ArrayList<>();
		HashMap<String,List<String>> hs = new HashMap<>();
		
		for(String curr : strs) {
			char[] charaters = curr.toCharArray();
			Arrays.sort(charaters);
			String sorted = new String(charaters);
			if(!hs.containsKey(sorted)) {
				hs.put(sorted, new ArrayList<>());
			}
			hs.get(sorted).add(curr);
		}
		
		groupedAnagrams.addAll(hs.values());
		
		return groupedAnagrams;
	}

	public static void main(String[] args) {
		Problem49 p = new Problem49();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> groupAnagrams = p.groupAnagrams(strs);
		for (List<String> res : groupAnagrams) {
			for (String s : res) {
				System.out.print(s + " ");
			}
			System.out.println("\n");
		}
	}

}
