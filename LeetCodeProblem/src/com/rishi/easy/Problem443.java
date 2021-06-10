package com.rishi.easy;

import java.util.Arrays;

public class Problem443 {
	
	private int StringCompression(char [] chars) {
	    int anchor = 0, write = 1, read=0;
	    
	    if(chars.length==1)
	    	return chars.length;
        
	    while(anchor<chars.length){
	    	if(anchor != chars.length-1 && chars[read] == chars[anchor]){
	    		anchor++;
	    	}else if(anchor==chars.length-1){
	    		chars[write]=(char)(anchor - read + '0');
	    		break;
	    	}
	    	else if(chars[read] != chars[anchor]){
	    		if(chars[read] == chars[read+1])
	    			chars[write]=(char)(anchor - read +'0');
	    			read++;
	    			anchor++;
	    			write=read+1;
	    	}
	    }
	    System.out.println(Arrays.toString(chars));
        return write+1;
	}

	public static void main(String[] args) {
		
		Problem443 p = new Problem443();
		char [] s = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		int result = p.StringCompression(s);
		System.out.println(result);
	}

}
