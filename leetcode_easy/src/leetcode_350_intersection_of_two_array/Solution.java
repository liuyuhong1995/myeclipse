package leetcode_350_intersection_of_two_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    	List<Integer> list = new ArrayList<Integer>();
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i : nums1)
    		if(map.containsKey(i)) map.put(i, map.get(i)+1);
    		else map.put(i, 1);
    	for(int i : nums2)
    		if(map.containsKey(i)){
    			list.add(i);
    			if(map.get(i) > 1) map.put(i, map.get(i)-1);
    			else map.remove(i);
    		}
    	 int[] results = new int[list.size()];
         for(int i = 0; i < list.size(); i++)
         	results[i] = list.get(i);
     	return results;
    }
}
