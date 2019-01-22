package leetcode_easy_26_Remove_Duplicates_from;

import javax.xml.transform.Templates;

public class Solution {
    public int removeDuplicates(int[] nums) {  
    	
  	if(nums.length==0)
  		return 0;
		int index = 1;
		int Length_tmp = 1;
		for(;index<nums.length;index++)
		{
			if(nums[index-1]<nums[index])
				{
					nums[Length_tmp] = nums[index];
					Length_tmp++;
				}
		}
  	
  	return Length_tmp;
  }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		int[] nums = {0,0,0,1,1,1,2,2,3,3,4,4,4,4,5,6,7};
		System.out.println(solution.removeDuplicates(nums));
		for(int i:nums){
			System.out.print(i);
		}
	}
}
