package com.rishi.easy;

import java.util.Arrays;

public class Problem1089 {

	public int[] duplicateZeros(int[] arr) {
		if(arr.length==0)
			return new int[0];
		int j=0;
		int[] tempArray = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0 && j<tempArray.length){
				tempArray[j] = arr[i];
				j++;
			}else{
				j+=2;
			}
		}
		for(int i=0;i<tempArray.length;i++){
			arr[i] = tempArray[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		Problem1089 p = new Problem1089();
		int [] arr = {0,1,9,2,6,0,0,4,1,0};
		int[] duplicateZeros = p.duplicateZeros(arr);
		System.out.println(Arrays.toString(duplicateZeros));
	}

}

/*if(arr.length==0)
	return new int[0];
int len = arr.length-1;
for(int i=0;i<arr.length;i++){
	if(arr[i]==0){
		for(int j=len;j>i;j--){
			arr[j]=arr[j-1];
		}
		i++;
	}
}*/
//0,0,1,9,2,6,0,0,0,0,4
/*1,0,2,3,0,4,5,0
1,0,0,*/