package leetcode_310_minimum_height_trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		  List<Integer> mintree = new ArrayList<Integer>();
		  if(n == 1)
		  {
			  mintree.add(0);
			  return mintree;
		  }
		  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		  int min = Integer.MAX_VALUE;
	      for(int nid = 0; nid < n; nid++){
	    	  int ndepth = depth(nid, -1, edges);
	    	  map.put(nid, ndepth);
	    	  if(ndepth < min)  min = ndepth;
	      }
	       for(int nid = 0; nid < n; nid++){
	    	  if(map.get(nid) == min)
	    		  mintree.add(nid);
	      }
		  return mintree;
	    }
	  /*
	   *  计算以i为根的有根树的深度
	   *  递归实现
	   */
	  public int depth(int i, int j, int[][] edges){
		  int max = -1;
		  List<Integer> children = childNode(i, j, edges);
		  if(children == null)
			  return 1;
		  for(int child : children){
			  int child_depth = depth(child, i, edges);
			  if(child_depth > max)
				  max = child_depth;
		  }
		  return max+1;
	  }
	  
	  /*
	   * 返回以i为父节点的子节点个数，要注意删除i的父节点j
	   */
	  public List<Integer> childNode(int i, int j, int[][] edges){
		  List<Integer> child = new ArrayList<Integer>();
		  for(int m = 0; m < edges.length; m++)
			  if(edges[m][0] == i && edges[m][1] != j)
				  child.add(edges[m][1]);
			  else if (edges[m][1] == i && edges[m][0] != j)
				  child.add(edges[m][0]);
		return child;
	  }
}
