package leetcode_109_convert_sorted_list_to_binary_tree;



class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return build(head, null);
    }
    
    public TreeNode build(ListNode start, ListNode end){
    	if(start == end)
    		return null;
    	ListNode fast = start;
    	ListNode slow = start; 
    	while(fast != end && fast.next != end){
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	TreeNode node = new TreeNode(slow.val);
    	node.left = build(start, slow);
    	node.right = build(slow.next, end);
    	return node;
    }
}


 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


 //Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
