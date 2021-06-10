package com.rishi.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Problem15 {
	
	List<List<Integer>> rowList = new ArrayList<List<Integer>>();
	List<Integer> columnsList;
	HashMap<List<Integer>,Integer> mapRowList = new HashMap<List<Integer>,Integer>();
	static int key =0;
	int i=0;
	
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		while(i<nums.length-2){
			if(nums[i] ==0)
			if(nums.length>=3 && (nums[i]==0 && nums[i+1]==0 && nums[i+2]==0)){
					columnsList = new ArrayList<Integer>();
					columnsList.add(nums[i]);
					columnsList.add(nums[i+1]);
					columnsList.add(nums[i+2]);
					mapRowList.put(columnsList, key++);
					break;
			}
			int j=i+1;
			int k =nums.length-1;
			while(j<k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == 0){
					columnsList = new ArrayList<Integer>();
					columnsList.add(nums[i]);
					columnsList.add(nums[j]);
					columnsList.add(nums[k]);
					Collections.sort(columnsList);
					if(!mapRowList.containsKey(columnsList))
						mapRowList.put(columnsList, key++);
					j++;
					k--;
					continue;
				}
				if(sum< 0){
					j++;
					continue;
				}
				if(sum > 0){
					k--;
					continue;
				}
			}
			i++;
		}


		return new ArrayList<>(mapRowList.keySet());
	}

	public static void main(String[] args) {
		Problem15 p = new Problem15();
		int [] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> threeSum = p.threeSum(nums);
		for(List<Integer> a : threeSum){
			System.out.println(a.toString());
		}
	}

}

//[[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
//[[-2,0,2],[-2,1,1]]
//[[-2,-1,3],[-2,0,2],[-1,0,1]]

//1.Brute Force

/*List<List<Integer>> rowList = new ArrayList<List<Integer>>();
List<Integer> columnsList;
HashMap<List<Integer>,Integer> mapRowList = new HashMap<List<Integer>,Integer>();
static int key =0;
public List<List<Integer>> threeSum(int[] nums) {
	if(nums.length<3) return rowList;
	int i=0,j=0,k=0;
	for(i=0;i<nums.length-2;i++){
		for(j=i+1;j<nums.length-1;j++){
			for(k=j+1;k<nums.length;k++){
				int a =nums[i];
				int b =nums[j];
				int c =nums[k];
				if(a+b+c==0){
					columnsList = new ArrayList<Integer>();
					columnsList.add(a);
					columnsList.add(b);
					columnsList.add(c);
					Collections.sort(columnsList);
					if(!mapRowList.containsKey(columnsList))
					mapRowList.put(columnsList, key++);
				}
			}
		}
	}

	return new ArrayList<>(mapRowList.keySet());
 */