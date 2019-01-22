package leetcode_middle_15;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
    	List<Integer> neg_list = new ArrayList<>();
    	List<Integer> pos_list = new ArrayList<>();
    	for(int i : nums)
    		if (i<0)
    			neg_list.add(i);
    		else 
				pos_list.add(i);
    	
    	
    	return null;
    }
    
    
    
    public static void main(String[] args) {
		
		
	}
}
