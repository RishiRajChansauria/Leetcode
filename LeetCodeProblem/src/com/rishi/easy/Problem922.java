package com.rishi.easy;

public class Problem922 {

	public int[] sortArrayByParityII(int[] A) {
		
		
		int [] temp = new int[A.length];
		int i=0;
		for(int x : A) {
			if(x%2==0) {
				temp[i] =x;
				i+=2;
			}
		}
		
		i=1;
		for(int x : A) {
			if(x%2!=0) {
				temp[i] =x;
				i+=2;
			}
		}
		
		
		return temp;

	}

	public static void main(String[] args) {
		
		Problem922 p = new Problem922();
		int [] A = {4,2,5,7,8};
		int[] sortArrayByParityII = p.sortArrayByParityII(A);
		for(int x : sortArrayByParityII) {
			System.out.println(x);
		}
	}

}

/*4725
0123


int i=0;
int j=1;

while(i<A.length && j<A.length) {
	while(A[i]%2!=0) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		j++;
	}
	
	i+=2;
	j=i-1;
	
	while(A[j]%2==0) {
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
		i++;
	}
	
	j+=2;
	i=j-1;
}

return A;
*/