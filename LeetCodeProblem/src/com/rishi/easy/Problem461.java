package com.rishi.easy;

public class Problem461 {
	
	public int hammingDistance(int x, int y) {
        int count =0;
        /*while(x>0 || y>0){
         count += (x%2)^(y%2);
         x>>=1;
         y>>=1; 
        }*/
        
        for(int i=0;i<32;i++) {
        	count+=(x%2)^(y%2);
        	x>>=1;
            y>>=1;
        }
       
        
        return count;
    }

	public static void main(String[] args) {
		
		Problem461 p = new Problem461();
		int hammingDistance = p.hammingDistance(1, 4);
		System.out.println(hammingDistance);
	}

}
