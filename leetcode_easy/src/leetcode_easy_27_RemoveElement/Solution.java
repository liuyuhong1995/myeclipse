package leetcode_easy_27_RemoveElement;

class Solution {
  
    	public int removeElement(int[] nums, int val) {
    	    int i = 0;
    	    int n = nums.length;
    	    while (i < n) {
    	        if (nums[i] == val) {
    	            nums[i] = nums[n - 1];
    	            // reduce array size by one
    	            n--;
    	        } else {
    	            i++;
    	        }
    	    }
    	    return n;
    	}
    	

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums =  {2,2,3,4,5,6,7,4,4,6};
		System.out.println(solution.removeElement(nums, 2));
		for(int i:nums){
			System.out.print(i);
		}
	}
    
}