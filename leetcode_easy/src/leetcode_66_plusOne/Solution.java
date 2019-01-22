package leetcode_66_plusOne;

public class Solution {
	public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        int carry = 0;
        
        // 判断是否需要进位
        if(digits[digits.length-1]!=9)
        {
        	result = digits;
        	result[digits.length-1] = digits[digits.length-1] + 1;
        }
        else{
        	carry = 1;
        	result[digits.length-1] = 0;
        	for(int i = digits.length-2; i >= 0; i--)
            {
            	result[i] = (digits[i] + carry) % 10;
            	carry = (digits[i] + carry) / 10;
            }
        }
        int[] result_new = new int[digits.length+1];
        if (carry == 1)
        	{result_new[0] = 1;
        	for (int i = 0; i < digits.length; i++)
        		{
        		result_new[i+1] = result[i];
        		result = result_new;
        		}
        	}
        	
		return result;
    }
	

}
