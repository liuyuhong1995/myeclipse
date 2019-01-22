package leetcode_69_sqrtX;

class Solution {
    public int mySqrt(int x) {
    	if (x == 1)
    		return 1;
        int left = 0;
        int right = x;
        while(right-left>1)
        {
        	int middle = (left + right) / 2;
        	long tmp =(long)middle*(long)middle;
        	if( tmp > x)
        		{
        		right = middle;
        		}
        	else 
        		left = middle;
        }
    	return left;
    }
    
    public static void main(String[] args) {
		int x = 0; 
		Solution solution = new Solution();
		System.out.println(solution.mySqrt(x));
	}
}
