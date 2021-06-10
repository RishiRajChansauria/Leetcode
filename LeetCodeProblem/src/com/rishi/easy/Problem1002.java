package com.rishi.easy;

import java.util.LinkedList;
import java.util.List;

public class Problem1002 {

	public List<String> commonChars(String[] A) {
	List<String> ls = new LinkedList<String>();
	String initialValue = A[0];
	for(int i=0;i<initialValue.length();i++) {
		int count =1;
		for(int j=1;j<A.length;j++) {
			if(A[j].contains(String.valueOf(initialValue.charAt(i)))) {
				A[j] = replace(A[j], String.valueOf(initialValue.charAt(i)), "",1);
				count++;
			}
		}
		if(count == A.length) {
			ls.add(String.valueOf(initialValue.charAt(i)));
		}
	}
	
	return ls;
}
    public static String replace(String text, String searchString, String replacement, int max) {
        if (isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0) {
            return text;
        }
        int start = 0;
        int end = text.indexOf(searchString, start);
        if (end == -1) {
            return text;
        }
        int replLength = searchString.length();
        int increase = replacement.length() - replLength;
        increase = (increase < 0 ? 0 : increase);
        increase *= (max < 0 ? 16 : (max > 64 ? 64 : max));
        StringBuilder buf = new StringBuilder(text.length() + increase);
        while (end != -1) {
            buf.append(text.substring(start, end)).append(replacement);
            start = end + replLength;
            if (--max == 0) {
                break;
            }
            end = text.indexOf(searchString, start);
        }
        buf.append(text.substring(start));
        return buf.toString();
    }
    
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
	

	public static void main(String[] args) {

		Problem1002 p = new Problem1002();
		String [] A = {"cool","lock","cook"};
		List<String> commonChars = p.commonChars(A);
		for (String s : commonChars) {
			System.out.println(s);
		}
	}


	
}

/*public List<String> commonChars(String[] A) {
	List<String> ls = new LinkedList<String>();
	String initialValue = A[0];
	for(int i=0;i<initialValue.length();i++) {
		int count =0;
		for(int j=1;j<A.length;j++) {
			if(A[j].contains(String.valueOf(initialValue.charAt(i)))) {
				A[j] = StringUtils.replaceOnce(A[j], String.valueOf(initialValue.charAt(i)), "");
				count++;
			}
		}
		if(count == A.length-1) {
			ls.add(String.valueOf(initialValue.charAt(i)));
		}
	}
	
	return ls;
}*/
