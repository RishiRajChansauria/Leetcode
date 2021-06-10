package com.rishi.easy;

import java.util.Map;
import java.util.TreeMap;

public class Problem1122 {

	Map<Integer,Integer> hs = new TreeMap<Integer,Integer>();
	int j=0;
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			hs.put(arr1[i], hs.getOrDefault(arr1[i], 0)+1);
		}
		for(int i=0;i<arr2.length;i++){
			if(hs.containsKey(arr2[i])){
				int count = hs.get(arr2[i]);
				while(count!=0){
					arr3[j]=arr2[i];
					count--;
					j++;
				}
			}
			hs.put(arr2[i], 0);
		}
		
		for(Map.Entry<Integer,Integer> entry: hs.entrySet()){
				if(entry.getValue() != 0){
					while(j<arr3.length){
					int i= entry.getValue();
					while(i!=0){
						arr3[j] = entry.getKey();
						j++;
						i--;
					}
					break;
				}
			}
		}
		
		return arr3;
	}

	public static void main(String[] args) {

		int [] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
		int [] arr2 = {2,42,38,0,43,21};
		Problem1122 p = new Problem1122();
		int[] relativeSortArray = p.relativeSortArray(arr1, arr2);
		for(int x : relativeSortArray){
			System.out.print(x + " " + ",");
		}
	}

}
