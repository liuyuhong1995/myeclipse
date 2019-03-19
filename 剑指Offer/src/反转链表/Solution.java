package 反转链表;



public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null)
        	return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy.next;
        ListNode pCur = prev.next;
        while(pCur != null){
        	prev.next = pCur.next;
        	pCur.next = dummy.next;
        	dummy.next = pCur;
        	pCur = prev.next;
        }
    	return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
