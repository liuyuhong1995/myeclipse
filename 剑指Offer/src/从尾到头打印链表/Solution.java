package 从尾到头打印链表;


import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<ListNode> stack = new Stack<ListNode>();
        while(listNode!=null){
        	stack.push(listNode);
        	listNode = listNode.next;
        }
        while(!stack.isEmpty()){
        	result.add(stack.pop().val);
        }
    	
    	return  result;
    }
    public class ListNode {
        int val;
        ListNode next = null; 
        ListNode(int val) {
           this.val = val;
           }
        }
    
  
}
