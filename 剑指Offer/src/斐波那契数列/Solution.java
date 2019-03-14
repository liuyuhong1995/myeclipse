package 斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
    	
    	
    	return getFibonacci(n);
    }
    public int getFibonacci(int n)
    {
    	if(n == 0)
    		return 0;
    	if(n == 1)
    		return 1;
    	return getFibonacci(n-1) + getFibonacci(n-2);
    }
    
    public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.Fibonacci(2));
	}
}