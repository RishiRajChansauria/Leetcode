package Arrays;

public class Problem1365 {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int [] res = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int count =0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i] > nums[j]) {
					count++;
				}
			}
			res[i] = count;
		}
		return res;
	}

	public static void main(String[] args) {
		int [] nums = {};
		Problem1365 p = new Problem1365();
		int[] smallerNumbersThanCurrent = p.smallerNumbersThanCurrent(nums);
		for(int x : smallerNumbersThanCurrent) {
			System.out.println(x + " ");
		}
	}

}
