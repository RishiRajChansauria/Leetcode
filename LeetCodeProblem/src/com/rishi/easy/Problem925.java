package com.rishi.easy;

public class Problem925 {

	public boolean isLongPressedName(String name, String typed) {
		int i=0;
		int j=0;
		
		if(name.charAt(0) != typed.charAt(0)) return false;
		
		while(i<name.length() && j<typed.length()) {
			if(name.charAt(i)== typed.charAt(j)) {
				j++;
				i++;	
			}
			if(i<name.length() && j<typed.length()) {
				if((name.charAt(i)!=typed.charAt(j)) && (typed.charAt(j) != name.charAt(i-1)))
					return false;
				if((name.charAt(i)!=typed.charAt(j)) && (typed.charAt(j) == name.charAt(i-1)))
					j++;
			}
			
		}
		
		if(i!=name.length()) return false;
		
		return true;
	}

	public static void main(String[] args) {
		
		Problem925 p = new Problem925();
		boolean longPressedName = p.isLongPressedName("pyplrz", "ppyypllr");
		System.out.println(longPressedName);
	}

}
