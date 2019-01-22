package leetcode_63_uniquePath2;

public class Solution {
	
	
	
	
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	int m = obstacleGrid.length;
	int n = obstacleGrid[0].length;
	int[][] total_step = new int[m][n];

	if(obstacleGrid[0][0]==1)
		return 0;
	total_step[0][0] = 1;
	
	for(int i = 1; i < m; i++) 
		total_step[i][0] = obstacleGrid[i][0]==1 ? 0 : total_step[i-1][0];
	for(int j = 1; j < n; j++)
		total_step[0][j] = obstacleGrid[0][j]==1 ? 0 : total_step[0][j-1];
	for(int i = 1; i < m; i++)
		for(int j = 1; j < n; j++)
			total_step[i][j] = obstacleGrid[i][j]==1 ? 0 : total_step[i-1][j] + total_step[i][j-1];
			
	return total_step[m-1][n-1];
}
	

	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] obstacleGrid = {{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0}};
		System.out.println(solution.uniquePathsWithObstacles(obstacleGrid));
	}
}
