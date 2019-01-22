package leetcode_357_count_number_with_unique_digits;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        if(n == 1) return 10;
        // 9 * A 9 (n - 1)
        //n = n > 10 ? 10 : n;
        int result = 10;
        int tmp = 9;
        for(int i = 2; i <= n; i++){
        	tmp *= (9 - i + 2);
        	result += tmp;
        }
        	
        return result;
    }
    
    public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.countNumbersWithUniqueDigits(1));
	}
}
