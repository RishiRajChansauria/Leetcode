package com.rishi.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem989 {
	
	
	public List<Integer> addToArrayForm(int[] A, int K) {
		List<Integer> result = new ArrayList<Integer>();
	    
		int i = A.length-1;
		int sum =0;
		boolean carryCounter = false;
		
		while(i >= 0) {
			int KP=0;
			if(K > 10) {
				KP= K%10;
				K = K/10;
			}else {
				KP = K;
				K=0;
			}
			if(carryCounter) {
				sum= (A[i] + (KP)) +1;
			}else {
				sum= A[i] + (KP);
			}
			
			if(sum < 10) {
				result.add(sum);
				carryCounter=false;
				i--;
			}else {
				result.add(sum%10);
				carryCounter=true;
				i--;
			}
		}
		
		
		if(carryCounter) {
			sum = (K%10)+1;
			if(sum < 10) {
				result.add(sum);
				carryCounter=false;
				K = K/10;
			}else {
				result.add(sum%10);
				carryCounter=true;
				K = K/10;
			}
		}	
			while(K > 0) {
				if(carryCounter) {
					if(K >= 10) {
						sum= K%10 + 1;
						if(sum < 10) {
							result.add(sum);
							carryCounter=false;
							K = K/10;
						}
						else {
							result.add(sum%10);
							carryCounter=true;
							K = K/10;
						}
					}else {
						sum=K + 1;
						if(sum < 10) {
							result.add(sum);
							carryCounter=false;
							K = K/10;
						}
						else {
							result.add(sum%10);
							carryCounter=true;
							K = K/10;
						}
					}
				}else {
					while(K > 9) {
						sum = K % 10;
						result.add(sum);
						K = K / 10;
						if(K == 0 ) {
						}
					}
					result.add(K);
					break;
				}
			}
			
			if(K==0 && carryCounter) {
				result.add(1);
			}
		
		
		
		Collections.reverse(result);
		
		return result;
    }
	

	public static void main(String[] args) {
		Problem989 p989 = new Problem989();
		int [] A = {0};
		int K=1000;
		List<Integer> addToArrayForm = p989.addToArrayForm(A, K);
		for (Integer integer : addToArrayForm) {
			System.out.println(integer);
		}
	}

}
