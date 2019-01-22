package leetcode_62_uniquePath;

class Solution {
	/*
	 *  一共可以走 m+n-2步，其中选择n-1执行向下操作即可
	 */
    public int uniquePaths(int m, int n) {
         if(m==1||n==1)
        	 return 1;
    	 int total_step = m + n - 2;
    	 long divisor = 1;
    	 long dividend = 1;
    	 int times = m > n ? n : m;
    	 for (int i = 0; i < times-1; i++){
    		divisor *= (total_step-i);
    		dividend *= i+1;
    	 }
    	return (int) (divisor/dividend);
    }
}