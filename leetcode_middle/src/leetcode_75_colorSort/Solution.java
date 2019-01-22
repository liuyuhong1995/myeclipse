package leetcode_75_colorSort;

public class Solution {
    public void sortColors(int[] nums) {
    	int r_index = 0;
    	int b_index = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0){
        		swap(nums, r_index, i);
        		r_index += 1;
        		
        	}
        	if (nums[i] == 2){
        		swap(nums, b_index, i);
        		b_index -= 1;
        		
        	} 
        	if(i > b_index)
        		break;
        }
    }
    
    public void swap(int[] nums, int i, int j){
    	int temp ;
    	temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {1,2,0};
		solution.sortColors(nums);
		for(int i : nums){
			System.out.print(i);
		}
				}
}
