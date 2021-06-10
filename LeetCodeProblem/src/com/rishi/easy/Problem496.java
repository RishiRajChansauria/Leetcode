package com.rishi.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem496 {

	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int [] result = new int[nums1.length];

		for(int i=0;i<nums2.length-1;i++) {
			for(int j=i+1;j<nums2.length;j++) {
				if(nums2[i]<nums2[j]) {
					map.put(nums2[i], nums2[j]);
					break;
				}
			}
		}

		for(int i=0;i<nums1.length;i++) {
			if(map.containsKey(nums1[i])) {
				result[i]=map.get(nums1[i]);
			}else {
				result[i] = -1;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Problem496 p = new Problem496();
		int [] nums1 = {1,3,5,2,4};
		int [] nums2 = {6,5,4,3,2,1,7};
		int[] nextGreaterElement = p.nextGreaterElement(nums1, nums2);
		for(int i=0;i<nextGreaterElement.length;i++) {
			System.out.println(nextGreaterElement[i]);
		}
	}

}
