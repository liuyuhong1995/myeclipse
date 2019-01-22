package leetcode_287_Find_theDuplicateNumber;

public class Solution2 {
	public int findDuplicate(int[] nums) {
		int nums_len = nums.length;
		for(int n:nums){
			if (n > nums_len) //说明这个下标的数已经找到，其真实数据为n-nums_len
				if (nums[n-nums_len - 1] > nums_len) return n-nums_len;
				else nums[n-nums_len - 1] += nums_len;
			else 
				if(nums[n - 1] > nums_len) return n;
				else nums[n - 1] += nums_len;
				
		}
		return 0;
	}
}
