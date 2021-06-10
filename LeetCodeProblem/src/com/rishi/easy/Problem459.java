package com.rishi.easy;

public class Problem459 {
	
	public boolean repeatedSubstringPattern(String s) {
	int len = s.length();
	if(len==1) return false;
	
	for(int i=0;i<len/2;i++){
		int j=0;
		String substring = s.substring(0,i+1);
		StringBuilder s2=new StringBuilder();
		while(j<len/(i+1)){
			s2.append(substring);
			j++;
		} 
		if(s2.toString().equals(s))
			return true;
	}
	return false;
	
}

	public static void main(String[] args) {
		Problem459 p = new Problem459();
		System.out.println(p.repeatedSubstringPattern("abcabcabcabc"));
	}

}



