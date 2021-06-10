package com.rishi.medium;

import java.util.HashSet;
import java.util.Set;

public class Problem3 {
	
	 public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<Character>();
		int count=0;
		int ans =0;
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				ans=Math.max(ans, count);
				set.removeAll(set);
				i=j;
				j++;
				count=0;
			}else {
			  set.add(s.charAt(i));
			  count++;
			}
		}
		 
		 
		return Math.max(ans, count);
	 }  
	 
//	 Optimized Solution.
	       /* int n = s.length();
	        int	ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
*/

	 

		 
	    

	public static void main(String[] args) {
		Problem3 p = new Problem3();
		int lengthOfLongestSubstring = p.lengthOfLongestSubstring("avighab");
		System.out.println(lengthOfLongestSubstring);
	}

}
