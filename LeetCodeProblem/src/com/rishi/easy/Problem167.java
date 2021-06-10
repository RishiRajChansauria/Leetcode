package com.rishi.easy;

public class Problem167 {

	public int[] twoSum(int[] numbers, int target) {
		if(numbers == null || numbers.length==0)
			return new int[]{};
		
		int i=0,j=numbers.length-1;
		
		while(i<j){
			if(numbers[i] + numbers[j]==target)
				return new int[]{i+1,j+1};
			else if(numbers[i] + numbers[j] < target)
				i++;
			else if(numbers[i] + numbers[j] > target)
				j--;
		}
		
		return new int[]{};
	}

	public static void main(String[] args) {
		Problem167 p1 = new Problem167();
		int[] numbers = {2,7,11,15};
		int target =9;
		int[] retrunIndices = p1.twoSum(numbers,target);
		for(int i=0;i<retrunIndices.length-1;i++) {
			System.out.println("[" + retrunIndices[i] + "," + retrunIndices[i+1] + "]");
		}
	}

}

/*int [] result  = new int[2];
if(numbers == null || numbers.length==0)
	return result;

HashMap<Integer,Integer> visited = new HashMap<>();

for(int i=0;i<numbers.length;i++){
	if(visited.containsKey(target-numbers[i])){
		result[0] = visited.get(target-numbers[i]);
		result[1] = i+1;
	}
	visited.put(numbers[i], i+1);
}

return result;*/
