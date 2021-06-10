package com.rishi.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Problem350 {

	public int[] intersect(int[] nums1, int[] nums2) {
		
		HashMap<Integer,Integer> hs1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hs2 = new HashMap<Integer,Integer>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<nums1.length;i++){
			hs1.put(nums1[i], hs1.getOrDefault(nums1[i], 0)+1);
		}
		
		for (int i=0;i<nums2.length;i++) {
			hs2.put(nums2[i], hs2.getOrDefault(nums2[i], 0)+1);
		}
		
		if(hs1.size()<hs2.size()) {
			for(int x : hs1.keySet()) {
				if(hs2.containsKey(x)) {
					if(hs2.get(x)==hs1.get(x)) {
						for(int i=0;i<hs2.get(x);i++) {
							list.add(x);
						}
					}
					else {
						for(int i=0;i<Math.min(hs1.get(x),hs2.get(x));i++) {
							list.add(x);
						}
					}
				}
			}
		}else {
			for(int x : hs2.keySet()) {
				if(hs1.containsKey(x)) {
					if(hs1.get(x)==hs2.get(x)) {
						for(int i=0;i<hs1.get(x);i++) {
							list.add(x);
						}
					}
					else {
						for(int i=0;i<Math.min(hs1.get(x),hs2.get(x));i++) {
							list.add(x);
						}
					}
				
				}
			}
		}
		
		int [] temp = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			temp[i]=list.get(i);
		}
		
		return temp;
	}

	public static void main(String[] args) {
		
		Problem350 p = new Problem350();
		int [] nums1= {4,9,5};
		int [] nums2= {9,4,9,8,4};
		int[] intersect = p.intersect(nums1, nums2);
		for(int y: intersect) {
			System.out.println(y);
		}
	}

}
