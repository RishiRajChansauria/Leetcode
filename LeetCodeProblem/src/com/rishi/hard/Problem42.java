package com.rishi.hard;

public class Problem42 {

	public int trap(int[] height) {
		int len = height.length;
		int [] rMax = new int[len];
		int [] lMax = new int[len];
		int total =0;
		int rmax =0,lmax=0;
		// Finding right Max
		for(int i=0;i<len;i++) {
			if(height[i] > rmax) {
				rMax[i]= height[i];
				rmax = rMax[i];
			}else
				rMax[i] = rmax;
		}
		// Finding left Max
		for(int i=len-1;i>=0;i--) {
			if(height[i] > lmax) {
				lMax[i]= height[i];
				lmax = lMax[i];
			}else
				lMax[i] = lmax;
		}
		
		for(int i=0;i<len;i++) {
			total = total + Math.min(lMax[i], rMax[i]) - height[i];
		}
		
		return total;
	}

	public static void main(String[] args) {
		Problem42 p = new Problem42();
		int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(p.trap(height));
	}

}

