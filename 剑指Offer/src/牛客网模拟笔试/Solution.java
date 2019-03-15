package 牛客网模拟笔试;

import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
    	long n, k, MaxNum, d, b;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        k = in.nextLong();
        MaxNum = 1 << k;
        d = MaxNum - n;
        b = d / 2;
        System.out.println(b);
        for(int i = 0; i < k; i++)
        {
        	if (((1<<i) & b) == (1<<i))  
        		System.out.println((long)(1<<i) + " -");
        	else{
        		if(i == k -1){
        			if(d % 2 == 1) System.out.println((long)(1<<i) + " +");
        			else System.out.println((long)((1<<i) + 1) + " +");
        		}
        		else 
					System.out.println((long)(1<<i) + " +");
			}
        }
    }  
}
