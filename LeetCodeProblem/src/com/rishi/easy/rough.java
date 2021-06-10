package com.rishi.easy;

public class rough {

	public int hIndex(int[] citations) {
        int count =0;
        int [] bucket = new int[citations.length+1];
        
        for(int i=0;i<citations.length;i++){
            if(citations[i] > citations.length){
                bucket[citations.length]++;
            }else
                bucket[citations[i]]++;
        }
        
        for(int i=bucket.length-1;i>=0;i--){
           count+=bucket[i];
            if(count >= i){
                return i;
            }
        }
        
        return 0;
    }

	public static void main(String[] args) {
		rough r = new rough();
		int [] arr = {100};
		System.out.println(r.hIndex(arr));
	}

}