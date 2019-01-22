package leetcode_275_hIndex2;

public class Solution {
	
	public int hIndex(int[] citations) {
		if(citations.length==0)
			return 0;
		int left=0;
		int right = citations.length-1;
		int h_index = (left+right)/2;
		
		while(!(h_index == left || h_index==right))
		{
			if (citations.length-h_index > citations[h_index])
				left = h_index+1;
			else 
				right = h_index-1;
			h_index = (left+right)/2;
			
		}
		
		return citations.length-h_index;
    }

	public static void main(String[] args) {
		int[] citations = {1};
		Solution solution = new Solution();
		System.out.println(solution.hIndex(citations));
	}
	
}
