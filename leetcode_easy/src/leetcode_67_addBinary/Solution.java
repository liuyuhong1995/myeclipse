package leetcode_67_addBinary;

class Solution {
	
    public String addBinary(String a, String b) {
    	
        int max_length = a.length() > b.length() ? a.length() : b.length();
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int j = 1;j <= max_length; j++ )
        {
        	int a_value = a.length() >= j ? ((int)(a.charAt(a.length()-j))-(int)('0')) : 0;
        	int b_value = b.length() >= j ? ((int)(b.charAt(b.length()-j))-(int)('0')) : 0;
        	int value = a_value + b_value + carry;
        	if (value >= 2)  { 
        		value = value - 2;
        		carry = 1;
        		}
        	else 
        		carry = 0;
        	sb.append(value);
        }
        if (carry == 1)
        	sb.append(1);
        sb.reverse();
    	return sb.toString();
    }
}
