package com.rishi.easy;

import java.util.HashSet;

public class Problem345 {

	/*HashSet<Character> hs = new HashSet<Character>();
	public void addVowels() {
		hs.add('a');
		hs.add('e');
		hs.add('i');
		hs.add('o');
		hs.add('u');
        hs.add('A');
		hs.add('E');
		hs.add('I');
		hs.add('O');
		hs.add('U');
	}
	
	public String reverseVowels(String s) {
		int i=0;
		int j=s.length()-1;
		addVowels();
		char[] A = s.toCharArray();
		while(i < j) {
			if(hs.contains(A[i]) && hs.contains(A[j])) {
				char temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
				continue;
			}
			if(hs.contains(A[i])) {
				j--;
				continue;
			}
			if(hs.contains(A[j])) {
				i++;
				continue;
			}
			i++;
		}
		
		return String.valueOf(A);*/
	public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length -1, ct;
        char c;
        while( i < j) {
            ct = 0;
            if(!isVowel(arr[i])) {
                i++;
                ct++;
            };
            if(!isVowel(arr[j])){
                j--;
                ct++;
            }
            if (ct ==0){
                c = arr[i];
                arr[i] = arr[j];
                arr[j] =c;
                i++; j--;
            }
        }
        return String.valueOf(arr);
    }
    private boolean isVowel(char c)
    {
        return "AEIOUaeiou".indexOf(c) != -1;
    }


	public static void main(String[] args) {
		Problem345 p = new Problem345();
		String reverseVowels = p.reverseVowels("education");
		System.out.println(reverseVowels);
	}

}
