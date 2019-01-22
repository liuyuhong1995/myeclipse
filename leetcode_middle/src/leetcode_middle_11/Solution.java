package leetcode_middle_11;

//public class Solution {
//	 public int maxArea(int[] height) {
//		 if(height.length==1) return 0;
//		 
//		 int max_area = 0;
//		 for (int i = 0; i < height.length - 1; i++)
//			 for (int j = i + 1; j < height.length; j++)
//			 {
//				 int real_height = Math.min(height[i], height[j]);
//				 int area = (j-i)*real_height;
//				 if (area > max_area) {
//					max_area = area;
//				}
//			 }
//		 
//		 return max_area;
//	    }
//	 
//	 public static void main(String[] args) {
//		 Solution solution = new Solution();
//		int[]  height = {1,8,6,2,5,4,8,3,7};
//		System.out.println(solution.maxArea(height));
//	}
//}

class Solution {
    public int maxArea(int[] height) {
        if(height == null)
        {
            return 0;
        }
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int max =  right * Math.min(height[left],height[right]);
        int temp = 0;
        while(left < right + 1)
        {
            if(height[left] < height[right])
            {
                //从前往后找到比height[left]大的数
                for(int i = left ; i < right ; i++)
                {
                    if(height[i] > height[left])
                    {
                        left = i;
                        temp = (right - left) * Math.min(height[left],height[right]);
                        max = max > temp ? max : temp;
                        break;
                    }
                    if(i == right - 1)
                    {
                        return max;
                    }
                }
            }
            else
            {
                //从后往前找到比height[right]大的数
                for(int i = right ; i > left ; i--)
                {
                    if(height[i] > height[right])
                    {
                        right = i;
                        temp = (right - left) * Math.min(height[left],height[right]);
                        max = max > temp ? max : temp;
                        break;
                    }
                    if(i ==  left + 1)
                    {
                        return max;
                    }
                }
            }
        }
        return max;
    }
}
