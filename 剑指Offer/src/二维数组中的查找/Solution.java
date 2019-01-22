package 二维数组中的查找;

public class Solution {
    public boolean Find(int target, int [][] array) {
    	boolean res = false;
    	if(array == null) return res;
    	int row = 0;
    	int col = array[0].length - 1;
    	while(row < array.length && col >= 0)
    		if(array[row][col] == target){
    			res = true;
    			break;
    		}
    		else if (array[row][col] > target)
    			col--;
    		else 
    			row ++;
		return res;	   	
    }
    
    
    public static void main(String[] args) {
		int [][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		Solution solution = new Solution();
		System.out.println(solution.Find(1, array));
	}
}