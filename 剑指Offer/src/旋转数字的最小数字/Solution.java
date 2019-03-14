package 旋转数字的最小数字;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int length = array.length;
        if(length == 0)
        	return 0;
        int result = array[0];
        for(int i = 0; i < array.length; i++)
        	if(array[i] < result)
        	{
        		result = array[i];
        		break;
        	}
    	return 0;
    }
}
