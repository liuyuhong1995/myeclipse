package leetcode_easy_28_Implement_strStr;

public class Solution {
	public int strStr(String haystack, String needle) {
		if(haystack.equals(needle)||needle.length()==0)
			return 0;
        
		for(int i=0;i<=haystack.length()-needle.length();i++)
		{
			String str = haystack.substring(i,i+needle.length());
			if(str.equals(needle))
				return i;
		}
		return -1;
    }	
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		String haystack = "a";
		String needle = "bb";
		
		haystack.indexOf(needle);
	}
}
