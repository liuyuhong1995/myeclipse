package leetcode_middle_two_sum;

public class ListTest {
	Node headNode = null;
	
	// 单链表
	class Node{
		int val;
		Node next = null;
		
		public Node(int val)
		{
			this.val=val;
		}
	}
	
	/*
	 * 增
	 */
	public void insertNode(int val)
	{
		Node node = new Node(val);
		if(headNode==null){
			headNode = node;
			return;
		}
		Node tmpNode = headNode;
		while(tmpNode.next!=null)
		{
			tmpNode = tmpNode.next;
		}
		tmpNode.next=node;
			
	}
	
	
	public void deleteNode(int val){
		if(headNode == null)
		{
			System.out.println("ListNode is Empty,Error!");
			return ;
		}
		while(headNode.val==val){
			headNode=headNode.next;
		}
		Node tmpNode = headNode;
		while(tmpNode.next!=null){
			if(tmpNode.next.val==val)
			{
				tmpNode.next=tmpNode.next.next;
			}
			tmpNode = tmpNode.next;
		}
	}
	
	public void dispList(){
		if(headNode==null){
			System.out.println("ListNode is Empty,Error!");
		}
		Node tmpNode = headNode;
		while(tmpNode.next!=null)
		{
			System.out.print(tmpNode.val+"-->");
			tmpNode = tmpNode.next;
		}
		System.out.println(tmpNode.val);
	}
	
	
	public static void main(String[] args) {
		ListTest l1 = new ListTest();

		l1.insertNode(1);
		l1.insertNode(12);
		l1.insertNode(13);
		l1.insertNode(12);
		l1.dispList();
		l1.deleteNode(1);
		l1.dispList();
	}
}
