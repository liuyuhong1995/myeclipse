package leetcode_108_convert_sorted_array_to_binary_search_tree;

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
//
//class Solution {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if(nums == null || nums.length == 0)
//        	return null;
//        return func_create(nums, 0, nums.length-1);
//    }
//    
//    public TreeNode func_create(int[] nums, int min, int max){
//    	if (min > max)
//    		return null;
//    	int mid = (min + max) / 2;
//    	TreeNode  node = new TreeNode(nums[mid]);
//    	node.left = func_create(nums, min, mid - 1);
//    	node.right = func_create(nums, mid+1, max);
//    	return node;
//    }
//}