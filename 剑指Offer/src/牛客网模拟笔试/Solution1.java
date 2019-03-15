package 牛客网模拟笔试;

import java.util.Scanner;

public class Solution1 {
	
	public void printfResult(int x, int y, int k)
	{
		if(x > k || y > k){
			System.out.println("-1");
			return;
		}
		
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] matrix = new int[3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
              matrix[j] = sc.nextInt();
            }
        } 
        
        
      
    }
}
