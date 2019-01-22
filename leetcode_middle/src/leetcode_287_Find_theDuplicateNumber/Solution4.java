package leetcode_287_Find_theDuplicateNumber;

public class Solution4 {
	public int findDuplicate(int[] nums) {
		if(nums.length <= 1)
			return -1;
		// Ptr_slow 和Ptr_fast设置的值为其走了一步之后的值，不然需要在while中判断两者为0的情况
		int Ptr_slow = nums[0];
		int Ptr_fast = nums[nums[0]];
		// 找到红点
		while(Ptr_slow!=Ptr_fast)
		{
			Ptr_slow = nums[Ptr_slow];
			Ptr_fast = nums[nums[Ptr_fast]];
		}
		// 将快指针至回原点，步长变1
		Ptr_fast = 0;
		while(Ptr_slow != Ptr_fast)
		{
			Ptr_slow = nums[Ptr_slow];
			Ptr_fast = nums[Ptr_fast];
		}
		
		return Ptr_fast;
	}
}
