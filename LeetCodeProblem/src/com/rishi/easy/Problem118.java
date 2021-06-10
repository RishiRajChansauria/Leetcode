package com.rishi.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		if (numRows == 0) {
			return triangle;
		}

		triangle.add(new ArrayList<>());
		triangle.get(0).add(1);

		for(int i=1;i<numRows;i++) {
			
			List<Integer> rows = new ArrayList<Integer>();
			List<Integer> prevRow = triangle.get(i-1);

			rows.add(1);
			

			for(int j=1;j<i;j++) {
				rows.add(prevRow.get(j-1)+prevRow.get(j));
			}	
			
			rows.add(1);
			
			triangle.add(rows);
		}

		return triangle;
	}

	public static void main(String[] args) {
		
		Problem118 p = new Problem118();
		List<List<Integer>> generate = p.generate(8);
		for(List<Integer> x : generate) {
			System.out.print(x.toString());
		}
	}
}

