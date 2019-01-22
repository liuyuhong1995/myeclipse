package leetcode_81_search_in_rotated_sorted_array_ii;

class Solution {
    public boolean search(int[] nums, int target) {
        for(int i : nums)
        	if (i == target)
        		return true;
    	return false;
    }
}