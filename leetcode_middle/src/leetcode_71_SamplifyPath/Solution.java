package leetcode_71_SamplifyPath;

import java.util.Stack;

public class Solution {
public String simplifyPath(String path) {
		String[] values = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(String value : values)
        	if(value.equals(".")||value.equals(""))
        		continue;
        	else if (value.equals("..")){
        		if(!stack.isEmpty())  
        			stack.pop(); 	
        	}
        	else 
        		stack.push(value);
        if(stack.isEmpty())
        	return "/";
        String returnString = "";
        while(!stack.isEmpty())
        	returnString = "/" + stack.pop() +  returnString;
	 return  returnString;
    }

	public static void main(String[] args) {
	Solution solution = new Solution();
	System.out.println(solution.simplifyPath("/"));
}
}
