package Arrays;

import java.util.Arrays;

public class Problem2 {
	
	 public int lastStoneWeight(int[] stones) {
	        int len = stones.length;
	        int i=0;
	        while(i < len){
	            Arrays.sort(stones);
	            if(stones[len-2] == stones[len-1]){
	                stones[len-2] =0;
	                stones[len-1] =0;
	            }
	            else{
	            	stones[len-1] = stones[len-1] - stones[len-2];
	                stones[len-2] =0;
	            }  
	            i++;
	        }
	        
	        return stones[len-1];
	    }

	public static void main(String[] args) {
		Problem2 p = new Problem2();
		int [] stones = {2,7,4,1,8,1};
		System.out.println(p.lastStoneWeight(stones));
	}

}
