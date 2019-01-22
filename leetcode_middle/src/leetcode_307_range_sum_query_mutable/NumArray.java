package leetcode_307_range_sum_query_mutable;

public class NumArray {
	int[] nums;
	public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public void update(int i, int val) {
        this.nums[i] = val;
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
    	for(int m = i; m <= j; m++)	
    		sum += this.nums[m];
    	return sum;
    }
    
    public static void main(String[] args) {
		int[] nums = {1, 3, 5};
		NumArray numArray  = new NumArray(nums);
		System.out.println(numArray.sumRange(0, 2));
		numArray.update(1, 2);
		System.out.println(numArray.sumRange(0, 2));
	}
}
