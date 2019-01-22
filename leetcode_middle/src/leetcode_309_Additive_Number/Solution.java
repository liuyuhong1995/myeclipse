package leetcode_309_Additive_Number;

public class Solution {
    public boolean isAdditiveNumber(String num) {
        int length = num.length();
        for(int i = 1; i <= (length - 1 ) / 2; i++ ){
        	if (num.startsWith("0") && i >= 2) break;
        	for(int j = i + 1; (length - j) >= j - i; j++){
        		if(num.charAt(i) == '0' && j -i >= 2) break;
        		long num1 = Long.parseLong(num.substring(0, i));
        		long num2 = Long.parseLong(num.substring(i, j));
        		if(isAdditive(num.substring(j), num1, num2)) return true;
        	}
        }
        return false;
    }
    
    public boolean isAdditive(String remain, long num1, long num2){
    	if(remain.equals("")) return true;
    	long sum = num1 + num2;
    	String sumString = "" + sum;
    	if(!remain.startsWith(sumString)) return false;
    	return isAdditive(remain.substring(sumString.length()), num2, sum);
    }
    
}
