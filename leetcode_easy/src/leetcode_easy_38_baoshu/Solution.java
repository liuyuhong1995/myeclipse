package leetcode_easy_38_baoshu;


public class Solution {
	  public String countAndSay(int n) {
		  String test_strString = "1";
		  for (int i=1; i<n;i++)
			  test_strString = calc_nextStr(test_strString);
		  return test_strString;
	    }
	  
public String calc_nextStr(String str)
{
	if(str.length()==1)
		return "1"+str;
	StringBuilder sb = new StringBuilder();
	int index_pre = 0;
	int index = 1;
	for(;index<str.length();index++)
	{
		
		if(!(str.charAt(index)==str.charAt(index_pre))) {
			sb.append(index-index_pre);
			sb.append(str.charAt(index_pre));
			index_pre = index;
		}
	}
	sb.append(index-index_pre);
	sb.append(str.charAt(index-1));
	return sb.toString();
}
	  
	  public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.countAndSay(4));
	}
}
