package leetcode_71_SamplifyPath;

public class Solution2 {
	public String simplifyPath(String path) {
		String[] path_values = path.split("/");
		
		for(int i = 0; i < path_values.length; i++)
			if(path_values[i].equals("."))
				path_values[i]="";
			else if (path_values[i].equals("..")){
				path_values[i] = "";
				for(int j = i ; j >= 0; j-- )
					 if(!path_values[j].equals("")){
						 path_values[j] = ""; 
						 break;} 
				}
		for(String str : path_values)
			System.out.println(str);
		String resultString = "";
		for(String valueString : path_values)
			if(!valueString.equals(""))
				resultString = resultString + "/" + valueString;
		
		return resultString.isEmpty() ? "/" : resultString;
	}
	
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		System.out.println(solution.simplifyPath("/"));
	}
}
