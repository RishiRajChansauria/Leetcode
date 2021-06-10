package com.rishi.easy;

public class Problem709 {
	
	  public String toLowerCase(String str) {
	        
		  char[] strToArray = str.toCharArray();
	        for(int i=0;i<strToArray.length;++i){
	            if(strToArray[i] >= 97 && strToArray[i] <= 122){
	                continue;
	            }else{
	                strToArray[i] = (char) (strToArray[i] + 32);
	            }
	        }
	        
	        return new String(strToArray);
	    }

	public static void main(String[] args) {
		Problem709 p = new Problem709();
		System.out.println(p.toLowerCase("Hello"));

	}

}
