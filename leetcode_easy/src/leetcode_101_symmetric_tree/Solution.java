package leetcode_101_symmetric_tree;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null) return true;
//        //return  IsSymmertrix(root.left, root.right);
//    	return false;
//    	
//    }
//    
//    public boolean IsSymmertrix(TreeNode left, TreeNode right){
//    	if(left == null && right == null)
//    		return true;
//    	else if (left != null && right != null){
//    		if(left.val != right.val) return false;
//    		else 
//    			return IsSymmertrix(left.left, right.right) && IsSymmertrix(left.right, right.left);
//    	}
//    	else 
//    		return false;
//    }
//}
