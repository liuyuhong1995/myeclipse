package leetcode_66_plusOne;

public class Solution2 {
	public int[] plusOne(int[] digits) {
		StringBuilder sBuilder = new StringBuilder();
		for(int i = 0; i < digits.length; i++)
		{
			sBuilder.append(digits[i]);
		}
		int value = Integer.parseInt(sBuilder.toString()) + 1;
		String value_str = String.valueOf(value);
		int[] result = new int[value_str.length()];
		for(int i = 0; i < result.length; i++)
		{
			result[i] = (int)(value_str.charAt(i)) - (int)('0');
		}
		
		return result;
	}
	
	
	// 不对，int数组越界了
	
}
