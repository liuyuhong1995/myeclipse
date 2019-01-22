package leetcode_80_removeDuplicatesFromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	int length = nums.length;
        if (nums.length <= 2)
    		return nums.length;
        int pos = 2;
    	for(int i = 2; i < length; i++){
    		if(nums[i] != nums[pos-2])
    			nums[pos++] = nums[i];
    	}
    	return pos;
    }
    public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {0,0,1,1,1,1,2,3,3};
		System.out.println(solution.removeDuplicates(nums));
		for(int i : nums){
			System.out.print(i);
		}
	}
}
