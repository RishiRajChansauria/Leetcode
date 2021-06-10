package com.rishi.easy;


public class Problem206 {
	
	 public ListNode reverseList(ListNode head) {
		 
		 if(head!=null && head.next==null) return head;
	     
		 ListNode lastNode = null;
		 ListNode currentNode = head;
		 ListNode next = null;
		 
		 while(currentNode!=null) {
			 next=currentNode.next;
			 lastNode=currentNode.next;
			 lastNode=currentNode;
			 currentNode=next;
		 }
		 
		 return lastNode;
	    }

	public static void main(String[] args) {
		
		Problem206 p206 = new Problem206();
		
		ListNode ls1 = new ListNode(1);
		ListNode ls2 = new ListNode(2);
		ListNode ls3 = new ListNode(3);
		ListNode ls4 = new ListNode(4);
		ListNode ls5 = new ListNode(5);
		ls1.next = ls2;
		ls2.next = ls3;
		ls3.next = ls4;
		ls4.next = ls5;
		
		ListNode reverseList = p206.reverseList(ls1);
		System.out.println(reverseList.val);
	}

}
