package leetcode_401_binaryWatch;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> readBinaryWatch(int num) {
        List<String> time = new ArrayList<String>();
        int[] watch = new int[10];
        return null;
    }
	
	public void Trial(int n, int a, int[] watch, List<String> times){
		if(n==0){
			String time = "";
			int hour = SumOfIntArray(3, 0, watch);
			time = time + hour + ":";
			int minute = SumOfIntArray(9, 4, watch);
			if(minute < 10) time = time + 0 + minute;
			else time = time + minute;
			times.add(time);
			return;
		}
		for(;  a<=9; a++){
			watch[a] = 1;
			if( ! ((watch[0] == 1 && watch[1] == 1) || 
                   (watch[4] == 1 && watch[5] == 1 && watch[6] == 1 && watch[7] == 1)))
				Trial(n-1, a+1, watch, times);
			watch[a] = 0;
		}
		return;
	}
	
	 public static int SumOfIntArray(int a,int b,int[] times){
         //a是低位，b是高位，a是3或9，b是0或4
         int sum = 0;
         int mi = 0;
         for(int i=a;i>=b;i--){
        	 sum = (int) (sum +times[i]*Math.pow(2, mi));
        	 mi++;
        }
        return sum;
    }
}
