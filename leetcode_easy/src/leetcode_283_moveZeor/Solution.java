package leetcode_283_moveZeor;

import javax.swing.JLabel;

public class Solution {
	
	public void moveZeroes(int[] nums) {
        int noZeroIndex = 0;
        int ZeroIndex = 0;
        int i = 0;
        int j = 0;
        boolean isFindN = false;
        boolean isFindZ = false;
        
        while(!(i==nums.length || j==nums.length))
        	{
        		if(isFindN == false)
        			{
        			if(nums[i] != 0){
        			
        				isFindN = true;
        				noZeroIndex = i;
        				}
        			i++;
        			}
        		if(isFindZ == false)
        			{
        			if(nums[j] == 0){
        			
        				isFindZ = true;
        				ZeroIndex = j;
        				}
        			j++;
        			}
        		if(isFindN==true && isFindZ==true)
        			if(ZeroIndex < noZeroIndex)
        			{
        				nums[ZeroIndex] = nums[noZeroIndex];
        				nums[noZeroIndex] = 0;
        				isFindN = false;
        				isFindZ = false;
        			}
        			else 
        				isFindN = false;
        	}
    }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] test = {3,12,0,0};
		solution.moveZeroes(test);
		for(int j : test)
			System.out.println(j);
	}

}
