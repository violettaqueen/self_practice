package arrays;

import java.util.Arrays;

public class DutchFlagProblem {

	// this will contain the values (0s, 1s and 2s)
	private int[] nums;
	
	public DutchFlagProblem(int[] nums) {
		this.nums = nums;
	}
	
	public void solve() {
		
		int i = 0;
		int j = 0;
		// we know that 1 is the middle item (0, 1, 2)
		int pivot = 1;
		int k = nums.length-1;
		
		// it has O(N) linear running time
		while(j<=k) {
			// when item with index j = 0
			if(nums[j] < pivot) {
				swap(i, j);
				i++;
				j++;
			// item is 2
			} else if(nums[j] > pivot) {
				swap(j, k);
				k--;
			// the item is 1
			} else {
				j++;
			}
		}
	}
	
	private void swap(int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
	
	public void showResult() {
		System.out.println(Arrays.toString(nums));
	}
}
