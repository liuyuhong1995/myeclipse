package leetcode_73_SetMatrixZeros;

public class Solution {
	public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int flag_row = 0;
        boolean find_flag = false;
        boolean row_find_zeros = false;
        for (int i = 0; i < m; i++){
        	row_find_zeros = false;
        	for(int j = 0; j < n; j++){
        		if (matrix[i][j] == 0){
        			row_find_zeros = true;
        			break;
        		} 
        	}
        	if(row_find_zeros == false){
        		flag_row = i;
        		find_flag = true;
        		break;
        		}
        	}
        if(find_flag == false){
        	  for (int i = 0; i < m; i++)
        		  for(int j = 0; j < n; j++)
        			  matrix[i][j] = 0;
        	  return;
        }		  
        // 找到了第一行全不为0的行,按照列是否有9将标记列对应列至0
        for(int j = 0; j < n; j++)
        	for(int i = 0; i < m; i++){
        		if (matrix[i][j] == 0){
        			matrix[flag_row][j] = 0;
        			  break;
        			}
        	}
        //行扫描，除标记行，其余行按照行规则置0
        for(int i = 0; i < m; i++)
        	for(int j = 0; j < n; j++){
        		if (i == flag_row)
        			break;
        		else{
        			if(matrix[i][j] == 0){
        				for(int s = 0; s < n; s++)
        					matrix[i][s] = 0;
        				break;
        			}
        		}
        	}
        //扫描标记列，按照列规则置0
        for(int j = 0; j < n; j++){
        	if(matrix[flag_row][j] == 0)
        		for(int i = 0; i < m; i++)
        			matrix[i][j] = 0;
        }
  }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] test = {{0,-1,-2,0},{3,-4,-5,2},{1,3,1,5}};
		solution.setZeroes(test);
		for(int i = 0; i < test.length; i++)
        	{for(int j = 0; j < test[0].length; j++)
        		System.out.print(test[i][j]);
        	System.out.println("");
        	}
	}
	
}
