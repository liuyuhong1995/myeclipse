package leetcode_287_Find_theDuplicateNumber;

public class Solution3 {
	public int findDuplicate(int[] nums) {
		int fast_ptr = 0; int slow_ptr = 0;
		int fast_step = 2; int slow_step = 3;
		while(true )
		{
			if(nums[slow_ptr] == nums[fast_ptr] && slow_ptr != fast_ptr){
				break;
			}		
			System.out.print(slow_ptr);
			System.out.println(fast_ptr);
			slow_ptr += slow_step;  fast_ptr += fast_step;
				if(slow_ptr >= nums.length) slow_ptr -= nums.length;
				if(fast_ptr >= nums.length) fast_ptr -= nums.length;
		}	
		return nums[slow_ptr];
	}
	public static void main(String[] args) {
		Solution3 solution3 = new Solution3();
		int[] test = {3,1,3,4,2};
		System.out.println(solution3.findDuplicate(test));
	}
}
