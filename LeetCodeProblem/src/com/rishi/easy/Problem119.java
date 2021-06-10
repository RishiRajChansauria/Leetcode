package com.rishi.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem119 {

	public List<Integer> getRow(int rowIndex) {
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		if(rowIndex<0) {
			return new ArrayList<>();
		}
		
		triangle.add(new ArrayList<>());
		triangle.get(0).add(1);
		
		for(int i=1 ;i<=rowIndex;i++) {
			List<Integer> row = new ArrayList<>();
			List<Integer> prevRow = triangle.get(i-1);
			
			row.add(1);
			
			for(int j=1;j<i;j++) {
				row.add(prevRow.get(j-1)+prevRow.get(j));	
			}
			
			row.add(1);
			
			triangle.add(row);
			
		}
		
		return triangle.get(rowIndex);
	}

	public static void main(String[] args) {
		
		Problem119 p = new Problem119();
		List<Integer> row = p.getRow(0);
		for(int x: row) {
			System.out.println(x);
		}
	}

}
