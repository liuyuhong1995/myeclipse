package leetcode_289_gameOfLife;

public class Solution {
    public void gameOfLife(int[][] board) {
    	
        int m = board.length;
        int n = board[0].length;
        int[][] live_cells = new int[m][n];
        for(int i = 0; i < m ; i++)
        	for(int j = 0; j < n ; j++)
        	{	live_cells[i][j] = 0;
        		for (int s = (i-1>=0?i-1:i); s <= ((i+1>=m?i:i+1)); s++)
        			for (int k = (j-1>=0?j-1:j); k <= ((j+1>=n?j:j+1)); k++)
        				if(s!=i || k!=j)
        					if(board[s][k]==1) 
        						live_cells[i][j] += 1;
        	}
        	for(int i = 0; i < m ; i++)
        		for(int j = 0; j < n ; j++){
        			if(board[i][j] == 1)
        				if(live_cells[i][j] < 2 || live_cells[i][j] > 3 ) 
        					board[i][j] = 0;
        			if(board[i][j] == 0)
        				if(live_cells[i][j] == 3)
        					board[i][j] = 1;
        		}
         }
    
    public static void main(String[] args) {
		int[][] test = {
				  {0,1,0},
				  {0,0,1},
				  {1,1,1},
				  {0,0,0}
				};
		Solution solution = new Solution();
		solution.gameOfLife(test);
		 int m = test.length;
	        int n = test[0].length;
	        for(int i = 0; i < m ; i++)
	        	{
	        	for(int j = 0; j < n ; j++)
	        		System.out.print(test[i][j]);
	        	System.out.println("");
	        	}
	        		
	}
}
