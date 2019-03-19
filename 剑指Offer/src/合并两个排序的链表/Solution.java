package 合并两个排序的链表;


public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1 == null)
    		return list2;
    	if(list2 == null)
    		return list1;
    	ListNode head = new ListNode(-1);
        ListNode rear = head;
        ListNode pCur1 = list1;
        ListNode pCur2 = list2;
        while(pCur1!=null && pCur2!=null)
        {
        	if(pCur1.val <= pCur2.val){
        		rear.next = pCur1;
        		rear = pCur1;
        		pCur1 = pCur1.next;
        	}
        	else{
        		rear.next = pCur2;
        		rear = pCur2;
        		pCur2 = pCur2.next;
        	}
        }
        if(pCur1==null)
        	rear.next = pCur2;
        if(pCur2 == null)
        	rear.next = pCur1;
    	
    	return head.next;
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}