package leetcode_287_Find_theDuplicateNumber;

import java.util.HashMap;

public class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        	if(hashMap.containsKey(nums[i]))
        		return nums[i];
        	else {
				hashMap.put(nums[i], nums[i]);
			}
    	return 0;
    }
}
