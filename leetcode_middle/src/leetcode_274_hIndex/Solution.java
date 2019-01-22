package leetcode_274_hIndex;

import java.util.Arrays;

/**
 * 
 * @author liuyuhong
 * Des: LeetCode274 h-index
 *
 */
public class Solution {
	
	 public int hIndex(int[] citations) {
		 if(citations.length == 0)
			 return 0;
		 int h_index = 0;
		 Arrays.sort(citations);
		 
		 for (int pos_index = citations.length-1; pos_index >= 0; pos_index--)
			 if(h_index < citations[pos_index])
				 h_index++;
		 return h_index;
	    }
	 
public static void main(String[] args) {
	int[] citations = {3,0,6,1,5,0,7,8};
	Solution solution = new Solution();
	System.out.println(solution.hIndex(citations));
}
	 
}
