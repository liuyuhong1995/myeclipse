package leetcode_middle_3._Longest_Substring_Without_Repeating_Characters;

public class Solution1 {
	public int lengthOfLongestSubstring(String s) {
		if(s.isEmpty())  return 0;
		if(s.length()==1)  return 1;
		for(int i=s.length();i>1;i--){
			for(int j=s.length()-i;j>=0;j--){
				String tmpString = s.substring(j,j+i);
				if(isUnique(tmpString)) 
					return tmpString.length();
			}
		}
		return 1;
	}

	public boolean isUnique(String s){
		int str_len = s.length();
		for (int i=0; i<str_len-1;i++)
			for(int j=i+1;j<str_len;j++)
				if(s.charAt(i)==s.charAt(j))
					return false;
		return true;
	}

	
	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
	}
}
