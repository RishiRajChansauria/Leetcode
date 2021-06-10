package com.rishi.easy;

public class Problem1037 {

	public boolean isBoomerang(int[][] points) {
		
	if ((points[1][1]-points[0][1])*(points[2][0]-points[0][0])==(points[2][1]-points[0][1])*(points[1][0]-points[0][0]))
            return false;
        return true;
	}

	public static void main(String[] args) {

		Problem1037 p = new Problem1037();
		int [][] points= {{1,1},{2,3},{3,2}};
		boolean boomerang = p.isBoomerang(points);
		System.out.println(boomerang);
	}

}
