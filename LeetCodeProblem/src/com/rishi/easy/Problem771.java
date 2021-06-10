package com.rishi.easy;
/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
*/
public class Problem771 {
	
	String j ="aAb";
	String s ="aAAbbbb";
	int count;
	int noOfJewelsFound;
	
	public int numJewelsInStones(String J, String S) {
		
		for(int i=0;i<J.length();i++) {
			for(int k=0;k<S.length();k++) {
				if(J.charAt(i) == S.charAt(k)) {
					count++;
				}
			}
			if(noOfJewelsFound > 0) {
				noOfJewelsFound=noOfJewelsFound+count;	
			}
			else
				noOfJewelsFound=count;
			count=0;
		}
		
		return noOfJewelsFound;
	}
	
	public static void main(String[] args) {
		Problem771 p = new Problem771();
		int numJewelsInStones = p.numJewelsInStones(p.j, p.s);
		System.out.println(numJewelsInStones);
	}

}
