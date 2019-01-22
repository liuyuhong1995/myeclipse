package leetcode_347_top_k_frequent_elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) 
        	if(map.containsKey(i)) map.put(i, map.get(i)+1);
        	else map.put(i, 1);
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key : map.keySet()){
        	int count=map.get(key);
        	if(bucket[count]==null)
        		bucket[count]=new ArrayList<Integer>();
        	bucket[count].add(key);
        }
        List<Integer> result=new ArrayList<Integer>();
		for(int i=nums.length;i>0;i--)
		{
			if(bucket[i]!=null&&result.size()<k)
				result.addAll(bucket[i]);		
		}
		return result;
    }
}
