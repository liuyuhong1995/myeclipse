package leetcode_middle_6;

import java.util.ArrayList;
import java.util.List;

//public class Solution {
//	public String convert(String s, int numRows){
//		
//		if (numRows==1) return s;
//		List<StringBuilder> rows = new ArrayList<>();
//		for (int i = 0; i < Math.min(numRows, s.length()); i++)
//			rows.add(new StringBuilder());
//		
//		int curRow = 0;
//		boolean goingdown = false;
//		
//		for (char c : s.toCharArray()){
//			rows.get(curRow).append(c);
//			if(curRow == 0 || curRow == numRows - 1) goingdown = !goingdown;
//			curRow += goingdown ? 1 : -1;
//		}
//		StringBuilder ret = new StringBuilder();
//		for(StringBuilder row : rows ) ret.append(row);
//		return ret.toString();
//		
//	}
//}
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows)
            return s;
        
        int i,j;
        final int dr = (numRows - 1) << 1, n=s.length();
        char[] res = new char[n];
        
        i=0;
        for(int col=0; col<numRows-1; ++col) {
            res[i++] = s.charAt(col);
            for(j=dr; j<n; j+=dr) {
                res[i++] = s.charAt(j-col);
                if(col!=0 && j+col<s.length())
                    res[i++] = s.charAt(j+col);
            }
            if (j-col < n){
                res[i++] = s.charAt(j-col);
            }
        }
        for(j=0; j+numRows-1<n; j+=dr){
            res[i++] = s.charAt(j+numRows-1);
        }
        return new String(res);
    }
}