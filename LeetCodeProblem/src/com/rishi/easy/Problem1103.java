package com.rishi.easy;

public class Problem1103 {

	public int[] distributeCandies(int candies, int num_people) {
		int [] arr = new int[num_people];
		int j=0;
		int distributed =1;
		while(candies > 0){
			if(j==0){
				if(candies >= distributed){
					arr[j] += distributed;
					candies = candies- distributed;
					distributed++;
				}
				else{
					arr[j] = arr[j] +candies;
					candies = candies- distributed;
					distributed++;
				}
				j++;
			}
			else{
				if(candies > distributed){
					arr[j] += distributed;
					candies = candies-distributed;
					distributed++;
				}
				else{
					arr[j] = arr[j] +candies;
					candies = candies-distributed;
					distributed++;
				}
				j++;
			}
			if(j==arr.length){
				j=0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Problem1103 p = new Problem1103();
		int candies =60;
		int num_people =4;
		int[] distributeCandies = p.distributeCandies(candies, num_people);
		for(int x : distributeCandies){
			System.out.print(x + "  ,");
		}
	}

}
