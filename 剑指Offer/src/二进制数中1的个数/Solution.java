package 二进制数中1的个数;

public class Solution {
    public int NumberOf1(int n) {
    	
    	int count = 0;
    	int flag = 1;
    	while(flag >= 1)
    	{
    		if((n & flag) > 0)
    			count ++ ;
    		flag = flag << 1;
    	}
    	
    	
    	return count;
    }
}