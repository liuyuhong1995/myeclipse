package leetcode_349_intersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums1)
        	set.add(i);
        for(int i : nums2)
        	if(set.contains(i)){
        		list.add(i);
        		set.remove(i); 
        		}
        int[] results = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        	results[i] = list.get(i);
    	return results;
    }
}
