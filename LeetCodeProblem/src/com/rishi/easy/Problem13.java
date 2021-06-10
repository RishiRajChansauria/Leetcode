package com.rishi.easy;

import java.util.HashMap;

//Roman to Integer

public class Problem13 {

	HashMap<String,Integer> romanValueStore = new HashMap<String, Integer>();

	private void romanStore() {

		romanValueStore.put("I", 1);
		romanValueStore.put("V", 5);
		romanValueStore.put("X", 10);
		romanValueStore.put("L", 50);
		romanValueStore.put("C", 100);
		romanValueStore.put("D", 500);
		romanValueStore.put("M", 1000);
	}

	public int romanToInt(String s) {
		if(romanValueStore.size()==0) {
			romanStore();
		}

		Integer sumOfValue = 0;

		if(s.length()<2) {
			return romanValueStore.get(Character.toString(s.charAt(0)));
		}

		for(int i=0;i<s.length();i++) {

			Integer value1 =romanValueStore.get(Character.toString(s.charAt(i)));

			if(i+1 < s.length()) {
				Integer value2 =romanValueStore.get(Character.toString(s.charAt(i+1)));

				if(value1 >= value2){				
					sumOfValue = sumOfValue+value1;
				}else {
					sumOfValue =sumOfValue+ value2-value1;
					i++;
				}
			}else {
				sumOfValue = sumOfValue+value1;
			}

		}

		return sumOfValue;
	}


	public static void main(String[] args) {
		Problem13 p13 = new Problem13();
		int romanToInt = p13.romanToInt("III");
		System.out.println(romanToInt);
	}

}
