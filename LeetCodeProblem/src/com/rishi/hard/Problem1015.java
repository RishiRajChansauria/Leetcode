package com.rishi.hard;

import java.util.HashMap;
import java.util.Map;

public class Problem1015 {
	
	 public int numDupDigitsAtMostN(int N) {
	     int count =0;
	     Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int i=0;i<=N;i++) {
			 int no=i;
			 map.clear();
			 while(no%10 >= 0 && no > 0) {
				 if(map.containsKey(no%10)) {
					 count++;
					 break;
				 }
				 map.put(no%10, 1);
				 no=no/10;
			 }
		 }
		 return count;
	    }

	public static void main(String[] args) {
		
		Problem1015 p = new Problem1015();
		int numDupDigitsAtMostN = p.numDupDigitsAtMostN(6718458);
		System.out.println(numDupDigitsAtMostN);
	}

}
