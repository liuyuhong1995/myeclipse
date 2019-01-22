package 从尾到头打印链表;


public class Test {
	public ListNode reverseList(ListNode listNode){
		ListNode node = listNode;
		ListNode pre = null;
		ListNode reverseHead = null;
		while(node!=null){
			if(node.next!=null)
				reverseHead = node;
			node.next = pre;
			pre = node;
			node = node.next;
			
		}
		return reverseHead;
	}
	
	
    public class ListNode {
        int val;
        ListNode next = null; 
        ListNode(int val) {
           this.val = val;
           }
        }
    
    
    public static void main(String[] args) {
		
	}
}
