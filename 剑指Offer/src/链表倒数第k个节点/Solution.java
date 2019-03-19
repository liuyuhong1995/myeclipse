package 链表倒数第k个节点;



public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k < 1)
        	return null;
    	ListNode fPoint = head;
    	ListNode sPoint = head;
    	for(int i = 0; i < k - 1; i++){
    		if(fPoint.next != null)
    		fPoint = fPoint.next;
    		else 
    			return null;
    	}
    	while(fPoint.next != null){
    		fPoint = fPoint.next;
    		sPoint = sPoint.next;
    	}
    	
    	return sPoint;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}