package leetcode_81_search_in_rotated_sorted_array_ii;

public class Solution2 {
	public boolean search(int[] nums, int target) {
		if(nums.length < 1) return false;
		if (target > nums[0]){
			for(int i = 0; i < nums.length; i++)
				if(nums[i] == target) return true;}
		else{
			for(int j = nums.length - 1; j >=0; j--)
				if(nums[j] == target) return true;}
		return false;
	}
}
