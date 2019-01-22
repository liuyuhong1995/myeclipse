package leetcode_easy_35._Search_Insert_Position;

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)
        	return 0;
        for(int i = 0 ; i < nums.length; i++)
        	if(target<=nums[i])
        		return i;
    	return nums.length;
    }
    
    public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {};
		System.out.println(solution.searchInsert(nums, 5));
	}
}
