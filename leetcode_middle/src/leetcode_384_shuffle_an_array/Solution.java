package leetcode_384_shuffle_an_array;

import java.util.Random;

class Solution {
	int[] nums;
	public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	int [] nums = this.nums.clone();
    	for (int i = nums.length - 1; i > 0; i--){
    		Random ra =new Random();
    		int index = ra.nextInt(i);
    		int temp = nums[i];
    		nums[i] = nums[index];
    		nums[index] = temp;
    	}	
        return nums;
    }
}
