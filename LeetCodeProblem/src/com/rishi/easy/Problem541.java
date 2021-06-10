package com.rishi.easy;

public class Problem541 {

	public String reverseStr(String s, int k) {
		
		char [] a = s.toCharArray();
		for(int start=0;start<a.length;start=start+2*k) {
			int i= start , j=Math.min(start+k-1, a.length -1);
			while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
			
		}
		
		return new String(a);
	}

	public static void main(String[] args) {
		
		Problem541 p = new Problem541();
		String reverseStr = p.reverseStr("abcdefg", 3);
		System.out.println(reverseStr);
	}

}
