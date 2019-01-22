package leetcode_middle_two_sum;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p=l1;
        ListNode q=l2;
        ListNode curr=dummyHead;
        int carry = 0;
        while(p!=null || q!=null){
        	int x =(p!=null)?p.val:0;
        	int y =(q!=null)?q.val:0;
        	int sum = x+y+carry;
        	carry = sum/10;
        	curr.nextNode= new ListNode(sum%10);
        	curr=curr.nextNode;
        	if(p!=null) p=p.nextNode;
        	if(q!=null) q=q.nextNode;
        }
        if(carry>0){
            curr.nextNode=new ListNode(carry);
        }
        return dummyHead.nextNode;

    	
    }
}

class ListNode{
	int val;
	ListNode nextNode;
	ListNode(int val){
		this.val = val;
		this.nextNode=null;
	}
}

