package 调整数组顺序使奇数位于偶数前面;

public class Solution {
    public void reOrderArray(int [] array) {
    	int length = array.length;
    	int index = 0;
    	int first_even = 0;
    	for(int i = 0; i < length; i++)
    		 if(array[i] % 2 == 0) {
    			 first_even = i;
    			 break;
    		 }
    		
    	for(int i = first_even + 1; i < length; i++)
    		if(array[i] % 2 == 1){
    			change(array, first_even, i);
    			first_even ++;
    		}
    }
    
    public void change(int[] array, int first_even, int first_odd)
    {
    	int temp = array[first_even];
    	array[first_even] = array[first_odd];
    	for(int i = first_odd; i > first_even + 1; i-- ){
    		array[i] = array[i-1];
    	}
    	array[first_even + 1] = temp;  		
    }
    public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6,7};
		Solution solution  = new Solution();
		solution.reOrderArray(test);
		for (int i:test)
			System.out.println(i);
	}
}
